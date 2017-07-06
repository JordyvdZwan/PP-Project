package ilocGenerator;

import checker.model.CheckerRecord;
import checker.model.DeclarationTable;
import checker.model.PrimitiveType;
import grammar.MainGrammarBaseVisitor;
import grammar.MainGrammarParser;
import ilocGenerator.helperParsers.WrittenNumberParser;
import jdk.internal.org.objectweb.asm.Opcodes;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import utils.iloc.Simulator;
import utils.iloc.model.*;

/**
 * Created by Jordy van der Zwan on 13-Jun-17.
 *
 * This class is used to generate ILOC code using the parse tree generated by earlier steps.
 * It also uses some more information generated by other steps in the compiler.
 */
@SuppressWarnings("unused")
public class ILOCGenerator extends MainGrammarBaseVisitor<Op> {
    /**
     * The representation of the boolean value <code>false</code>.
     */
    private final static Num FALSE_VALUE = new Num(0);
    /**
     * The representation of the boolean value <code>true</code>.
     */
    private final static Num TRUE_VALUE = new Num(1);

    private final static int DEFAULT_VALUE = 0;
    /**
     * The base register.
     */
    private Reg arp = new Reg("r_arp");
    /**
     * The outcome of the checker phase.
     */
    private CheckerRecord checkResult;
    /**
     * Association of statement nodes to labels.
     */
    private ParseTreeProperty<Label> labels;
    /**
     * The program being built.
     */
    private Program prog;
    /**
     * Register count, used to generate fresh registers.
     */
    private int regCount;
    /**
     * Association of expression and target nodes to registers.
     */
    private ParseTreeProperty<Reg> regs;
    private DeclarationTable declarationTable;
    private Reg dynamicMemoryPointer;

    /**
     * Generates ILOC code for a given parse tree,
     * given a pre-computed checker result.
     */
    public Program generate(ParseTree tree) {
        this.prog = new Program();
        this.checkResult = checkResult;
        this.regs = new ParseTreeProperty<>();
        this.labels = new ParseTreeProperty<>();
        this.declarationTable = declarationTable;
        this.regCount = 0;
        tree.accept(this);
        return this.prog;
    }

    public ILOCGenerator(CheckerRecord checkResult, DeclarationTable declarationTable) {
        this.checkResult = checkResult;
        this.declarationTable = declarationTable;
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////
    //                      Control Structures
    /////////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public Op visitIfStat(MainGrammarParser.IfStatContext ctx) {
        Label ifL = createLabel(ctx, "if");
        Label endL = createLabel(ctx, "end");

        setReg(ctx, reg(ctx.expression()));

        Op result = visit(ctx.expression());

        if (ctx.getChildCount() == 1) {
            emit(OpCode.cbr, reg(ctx.expression()), ifL, endL);
            visit(ctx.statement(0)).setLabel(ifL);
        } else {
            Label elseLabel = createLabel(ctx, "else");
            emit(OpCode.cbr, reg(ctx.expression()), ifL, elseLabel);
            visit(ctx.statement(0)).setLabel(ifL);
            emit(OpCode.jumpI, endL);
            visit(ctx.statement(1)).setLabel(elseLabel);
        }

        emit(endL, OpCode.nop);
        return result;
    }
    @Override
    public Op visitWhileStat(MainGrammarParser.WhileStatContext ctx) {
        Label start = createLabel(ctx, "startWhile");
        Label end = createLabel(ctx, "endWhile");
        Label body = createLabel(ctx, "bodyWhile");

        Op result = visit(ctx.expression());
        result.setLabel(start);

        emit(OpCode.cbr, reg(ctx.expression()), body, end);

        Op stat = visit(ctx.statement());
        stat.setLabel(body);

        emit(OpCode.jumpI, start);
        emit(end, OpCode.nop);
        return result;
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////
    //                      Declarations and Assignments
    /////////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public Op visitAssStat(MainGrammarParser.AssStatContext ctx) {
        Op result = visit(ctx.expression());
        emit(OpCode.storeAI, reg(ctx.expression()), arp, offset(ctx.target()));
        return result;
    }
//    @Override
//    public Op visitArrayDeclStat(MainGrammarParser.ArrayDeclStatContext ctx) {
//        Op res = visit(ctx.expression());
//        emit(OpCode.load, dynamicMemoryPointer, reg(ctx.id()));
//        emit(OpCode.storeAO, arp, dynamicMemoryPointer, reg(ctx.expression()));
//        emit(OpCode.add, reg(ctx.expression()), new Num(1), reg(ctx.expression()));     //Plus one for the length
//        emit(OpCode.multI, reg(ctx.expression()), new Num(4), reg(ctx.expression()));   //times 4 for the length of an integer
//        emit(OpCode.add, dynamicMemoryPointer, reg(ctx.expression()), dynamicMemoryPointer);
//        return res;
//    }
    @Override
    public Op visitDeclStat(MainGrammarParser.DeclStatContext ctx) {
        Op result;
        if (ctx.expression() != null) {
            result = visit(ctx.expression());
            emit(OpCode.storeAI, reg(ctx.expression()), arp, offset(ctx.id()));
        } else {
            if (checkResult.getType(ctx.id()).getPrimitiveType() == PrimitiveType.INTEGER) {
                result = emit(OpCode.loadI, new Num(Simulator.FALSE), reg(ctx));
                emit(OpCode.storeAI, reg(ctx), arp, offset(ctx.id()));
            } else {
                result = emit(OpCode.loadI, new Num(DEFAULT_VALUE), reg(ctx));
                emit(OpCode.storeAI, reg(ctx), arp, offset(ctx.id()));
            }
        }
        return result;
    }
//    @Override
//    public Op visitArrayId(MainGrammarParser.ArrayIdContext ctx) {
//        Op res = visit(ctx.expression());
//        //TODO range checking
////        emit(OpCode.add, reg(ctx.expression()), new Num(1), reg(ctx.expression()));     //Plus one for the length
//        emit(OpCode.multI, reg(ctx.expression()), new Num(4), reg(ctx.expression()));   //times 4 for the length of an integer
//        emit(OpCode.loadAO, arp, reg(ctx.expression()), reg(ctx));
//        return res;
//    }


    /////////////////////////////////////////////////////////////////////////////////////////////////////
    //                      Expressions
    /////////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public Op visitParExpr(MainGrammarParser.ParExprContext ctx) {
        Op res = visit(ctx.expression());
        setReg(ctx, reg(ctx.expression()));
        return res;
    }


//    @Override
//    public Op visitIndexExpr(MainGrammarParser.IndexExprContext ctx) {
//        Op res = visit(ctx.arrayId());
//        setReg(ctx, reg(ctx.arrayId()));
//        return res;
//    }
    @Override
    public Op visitIdExpr(MainGrammarParser.IdExprContext ctx) {
        if (global(ctx.id())) {
            return emit(OpCode.conloadAI, arp, offset(ctx), reg(ctx));
        } else {
            return emit(OpCode.loadAI, arp, offset(ctx), reg(ctx));
        }
    }


    @Override
    public Op visitTrueExpr(MainGrammarParser.TrueExprContext ctx) {
        return emit(OpCode.loadI, TRUE_VALUE, reg(ctx));
    }
    @Override
    public Op visitFalseExpr(MainGrammarParser.FalseExprContext ctx) {
        return emit(OpCode.loadI, FALSE_VALUE, reg(ctx));
    }
    @Override
    public Op visitNumExpr(MainGrammarParser.NumExprContext ctx) {
        if (ctx.num().ngWrittenNumber() != null) {
            return emit(OpCode.loadI, new Num(WrittenNumberParser.getNumber(ctx.num().ngWrittenNumber())), reg(ctx));
        } else {
            return emit(OpCode.loadI, new Num(Integer.parseInt(ctx.num().NUMBER().getText())), reg(ctx));
        }
    }


    @Override
    public Op visitCompExpr(MainGrammarParser.CompExprContext ctx) {
        Op res = visit(ctx.expression(0));
        visit(ctx.expression(1));
        //TODO Check what is returned by the cmp THINGY.
        if (ctx.compOp().EQ() != null) {
            emit(OpCode.cmp_EQ, reg(ctx.expression(0)), reg(ctx.expression(1)), reg(ctx));
        } else if (ctx.compOp().GE() != null) {
            emit(OpCode.cmp_GE, reg(ctx.expression(0)), reg(ctx.expression(1)), reg(ctx));
        } else if (ctx.compOp().GT() != null) {
            emit(OpCode.cmp_GT, reg(ctx.expression(0)), reg(ctx.expression(1)), reg(ctx));
        } else if (ctx.compOp().LE() != null) {
            emit(OpCode.cmp_LE, reg(ctx.expression(0)), reg(ctx.expression(1)), reg(ctx));
        } else if (ctx.compOp().LT() != null) {
            emit(OpCode.cmp_LT, reg(ctx.expression(0)), reg(ctx.expression(1)), reg(ctx));
        } else {
            emit(OpCode.cmp_NE, reg(ctx.expression(0)), reg(ctx.expression(1)), reg(ctx));
        }
        return res;
    }
    @Override
    public Op visitPrfExpr(MainGrammarParser.PrfExprContext ctx) {
        Op res = visit(ctx.expression());
        if (ctx.prfOp().Minus() != null) {
            //TODO Check if rsubi or subI is needed.
            emit(OpCode.rsubI, reg(ctx.expression()), new Num(0), reg(ctx));
        } else {
            emit(OpCode.rsubI, reg(ctx.expression()), new Num(0), reg(ctx));
            emit(OpCode.xorI, reg(ctx), new Num(1), reg(ctx));
            emit(OpCode.rsubI, reg(ctx), new Num(0), reg(ctx));
        }

        return res;
    }
    @Override
    public Op visitBoolExpr(MainGrammarParser.BoolExprContext ctx) {
        Op res = visit(ctx.expression(0));
        visit(ctx.expression(1));
        if (ctx.boolOp().And() != null) {
            emit(OpCode.and, reg(ctx.expression(0)), reg(ctx.expression(1)), reg(ctx));
        } else {
            emit(OpCode.or, reg(ctx.expression(0)), reg(ctx.expression(1)), reg(ctx));
        }
        return res;
    }
    @Override
    public Op visitMultExpr(MainGrammarParser.MultExprContext ctx) {
        Op res = visit(ctx.expression(0));
        visit(ctx.expression(1));
        if (ctx.multOp().Mult() != null) {
            emit(OpCode.mult, reg(ctx.expression(0)), reg(ctx.expression(1)), reg(ctx));
        } else {
            emit(OpCode.div, reg(ctx.expression(0)), reg(ctx.expression(1)), reg(ctx));
        }
        return res;
    }
    @Override
    public Op visitPlusExpr(MainGrammarParser.PlusExprContext ctx) {
        Op res = visit(ctx.expression(0));
        visit(ctx.expression(1));
        if (ctx.plusOp().Plus() != null) {
            emit(OpCode.add, reg(ctx.expression(0)), reg(ctx.expression(1)), reg(ctx));
        } else {
            emit(OpCode.sub, reg(ctx.expression(0)), reg(ctx.expression(1)), reg(ctx));
        }
        return res;
    }


    /////////////////////////////////////////////////////////////////////////////////////////////////////
    //                      Other Structures
    /////////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public Op visitProgram(MainGrammarParser.ProgramContext ctx) {
        Op res = emit(OpCode.loadI, new Num(declarationTable.getNextOffset()), reg(ctx));
        emit(OpCode.storeAI, reg(ctx), arp, new Num(0));
        emit(OpCode.loadI, new Num(CheckerRecord.nrOfThreads * 4), arp);
        for (int i = 0; i < ctx.statement().size(); i++) {
            visit(ctx.statement(i));
        }
        return res;
    }
    @Override
    public Op visitBlockStat(MainGrammarParser.BlockStatContext ctx) {
        Op res = visit(ctx.statement(0));
        for (int i = 1; i < ctx.statement().size(); i++) {
            visit(ctx.statement(i));
        }
        return res;
    }


    /////////////////////////////////////////////////////////////////////////////////////////////////////
    //                      Other Structures
    /////////////////////////////////////////////////////////////////////////////////////////////////////


    @Override
    public Op visitSharedDeclStat(MainGrammarParser.SharedDeclStatContext ctx) {
        Op result;
        if (ctx.expression() != null) {
            result = visit(ctx.expression());
            emit(OpCode.constoreAI, reg(ctx.expression()), arp, offset(ctx.id()));
        } else {
            if (checkResult.getType(ctx.id()).getPrimitiveType() == PrimitiveType.INTEGER) {
                result = emit(OpCode.loadI, new Num(Simulator.FALSE), reg(ctx));
                emit(OpCode.constoreAI, reg(ctx), arp, offset(ctx.id()));
            } else {
                result = emit(OpCode.loadI, new Num(DEFAULT_VALUE), reg(ctx));
                emit(OpCode.constoreAI, reg(ctx), arp, offset(ctx.id()));
            }
        }
        return result;
    }

    @Override
    public Op visitLockStat(MainGrammarParser.LockStatContext ctx) {
        if (ctx.Lock() != null) {
            return emit(OpCode.lock, offset(ctx.id()));
        } else {
            return emit(OpCode.unlock, offset(ctx.id()));
        }
    }

    @Override
    public Op visitForkStat(MainGrammarParser.ForkStatContext ctx) {
        Label end = createLabel(ctx, "ForkEnd");
        Label start = createLabel(ctx, "ForkStart");
        Op result = emit(OpCode.fork, forkId(ctx.forkID()), end, start);
        emit(start, OpCode.nop);
        visit(ctx.statement());
        emit(OpCode.unfork, forkId(ctx.forkID()));
        emit(end, OpCode.nop);
        return result;
    }

    @Override
    public Op visitJoinStat(MainGrammarParser.JoinStatContext ctx) {
        return emit(OpCode.join, forkId(ctx.forkID()));
    }

    /**
     * Constructs an operation from the parameters
     * and adds it to the program under construction.
     */
    private Op emit(Label label, OpCode opCode, Operand... args) {
        Op result = new Op(label, opCode, args);
        this.prog.addInstr(result);
        return result;
    }

    /**
     * Constructs an operation from the parameters
     * and adds it to the program under construction.
     */
    private Op emit(OpCode opCode, Operand... args) {
        return emit(null, opCode, args);
    }

    /**
     * Looks up the label for a given parse tree node,
     * creating it if none has been created before.
     * The label is actually constructed from the entry node
     * in the flow graph, as stored in the checker result.
     */
    private Label label(ParserRuleContext node) {
        Label result = this.labels.get(node);
        if (result == null) {
            ParserRuleContext entry = this.checkResult.getEntry(node);
            result = createLabel(entry, "n");
            this.labels.put(node, result);
        }
        return result;
    }

    /**
     * Creates a label for a given parse tree node and prefix.
     */
    private Label createLabel(ParserRuleContext node, String prefix) {
        Token token = node.getStart();
        int line = token.getLine();
        int column = token.getCharPositionInLine();
        String result = prefix + "_" + line + "_" + column;
        return new Label(result);
    }

    /**
     * Retrieves the offset of a variable node from the checker result,
     * wrapped in a {@link Num} operand.
     */
    private Num offset(ParseTree node) {
        return new Num(this.checkResult.getOffset((ParserRuleContext) node));
    }
    private boolean global(ParseTree node) {
        return checkResult.getGlobal((ParserRuleContext) node);
    }
    private Num forkId(ParseTree node) {
        return new Num(this.checkResult.getForkId((ParserRuleContext) node));
    }

    /**
     * Returns a register for a given parse tree node,
     * creating a fresh register if there is none for that node.
     */
    private Reg reg(ParseTree node) {
        Reg result = this.regs.get(node);
        if (result == null) {
            result = new Reg("r_" + this.regCount);
            this.regs.put(node, result);
            this.regCount++;
        }
        return result;
    }

    /**
     * Assigns a register to a given parse tree node.
     */
    private void setReg(ParseTree node, Reg reg) {
        this.regs.put(node, reg);
    }
}
