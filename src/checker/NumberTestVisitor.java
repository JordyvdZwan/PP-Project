package checker;

import grammar.NumberGrammarBaseVisitor;
import grammar.NumberGrammarParser;

/**
 * Created by Jordy van der Zwan on 14-Jun-17.
 * <p>
 * The NumberTestVisitor was build as a proof of concept of an written number to int conversion.
 * Though it returns a Long it is safe to cast the value to an integer as it makes sure no overflow can occur.
 * If an overflow is detected the visitWrittenNumber will return -1 which is an errorcode
 * <p>
 * NOTE: Only correct use is by accessing the value of visitNumber and adding the following code around it.
 * <p>
 * Luckily it was successful and has the following features:
 * - Using the grammar defined in maingrammar this class generates an Long given an correct written number *
 */
public class NumberTestVisitor extends NumberGrammarBaseVisitor<Long> {

    @Override
    public Long visitNgWrittenNumber(NumberGrammarParser.NgWrittenNumberContext ctx) {
        Long result = 0L;
        if (ctx.NGZero() != null) {
            return 0L;
        }
        if (ctx.ngbillion() != null) {
            result += visit(ctx.ngbillion());
        }
        if (ctx.ngmillion() != null) {
            result += visit(ctx.ngmillion());
        }
        if (ctx.ngthousand() != null) {
            result += visit(ctx.ngthousand());
        }
        if (ctx.ngsingle() != null) {
            result += visit(ctx.ngsingle());
        }
        if (result > Integer.MAX_VALUE) {
            result = -1L;
        }
        return result;
    }

    @Override
    public Long visitNgsingle(NumberGrammarParser.NgsingleContext ctx) {
        if (ctx.nghundred() != null) {
            if (ctx.nghprefix() != null) {
                if (ctx.ngonly() != null) {
                    return (visit(ctx.nghprefix()) * 100) + visit(ctx.ngonly());
                } else {
                    return (visit(ctx.nghprefix()) * 100);
                }
            } else {
                if (ctx.ngonly() != null) {
                    return 100 + visit(ctx.ngonly());
                } else {
                    return 100L;
                }
            }
        } else {
            return visit(ctx.ngonly());
        }
    }

    @Override
    public Long visitNgonly(NumberGrammarParser.NgonlyContext ctx) {
        if (ctx.ngsingles() != null) {
            return visit(ctx.ngsingles());
        } else if (ctx.ngmain2() != null) {
            return visit(ctx.ngmain2());
        } else {
            return visit(ctx.ngmain1());
        }
    }

    @SuppressWarnings("Duplicates")
    @Override
    public Long visitNgsingles(NumberGrammarParser.NgsinglesContext ctx) {
        if (ctx.NGOne() != null) {
            return 1L;
        } else if(ctx.NGTwo() != null) {
            return 2L;
        } else if (ctx.NGThree() != null) {
            return 3L;
        } else if (ctx.NGFour() != null) {
            return 4L;
        } else if (ctx.NGFive() != null) {
            return 5L;
        } else if (ctx.NGSix() != null) {
            return 6L;
        } else if (ctx.NGSeven() != null) {
            return 7L;
        } else if (ctx.NGEight() != null) {
            return 8L;
        } else if (ctx.NGNine() != null) {
            return 9L;
        } else {
            return 10L;
        }
    }

    @Override
    public Long visitNgmain1(NumberGrammarParser.Ngmain1Context ctx) {
        if (ctx.NGEleven() != null) {
            return 11L;
        } else if (ctx.NGTwelve() != null) {
            return 12L;
        } else if (ctx.NGEighteen() != null) {
            return 18L;
        } else {
            return 10 + visit(ctx.ngfirst());
        }
    }

    @Override
    public Long visitNgmain2(NumberGrammarParser.Ngmain2Context ctx) {
        Long result = 0L;
        result += visit(ctx.ngdoubles());
        if (ctx.ngseconds() != null) {
            result += visit(ctx.ngseconds());
        }
        return result;
    }

    @SuppressWarnings("Duplicates")
    @Override
    public Long visitNghprefix(NumberGrammarParser.NghprefixContext ctx) {
        return visit(ctx.ngonly());
    }

    @SuppressWarnings("Duplicates")
    @Override
    public Long visitNgseconds(NumberGrammarParser.NgsecondsContext ctx) {
        if (ctx.NGOne() != null) {
            return 1L;
        } else if (ctx.NGTwo() != null) {
            return 2L;
        } else if (ctx.NGThree() != null) {
            return 3L;
        } else if (ctx.NGFour() != null) {
            return 4L;
        } else if (ctx.NGFive() != null) {
            return 5L;
        } else if (ctx.NGSix() != null) {
            return 6L;
        } else if (ctx.NGSeven() != null) {
            return 7L;
        } else if (ctx.NGEight() != null) {
            return 8L;
        } else {
            return 9L;
        }
    }

    @Override
    public Long visitNgfirst(NumberGrammarParser.NgfirstContext ctx) {
        if (ctx.NGThir() != null) {
            return 3L;
        } else if (ctx.NGFour() != null) {
            return 4L;
        } else if (ctx.NGFif() != null) {
            return 5L;
        } else if (ctx.NGSix() != null) {
            return 6L;
        } else if (ctx.NGSeven() != null) {
            return 7L;
        } else {
            return 9L;
        }
    }

    @Override
    public Long visitNgdoubles(NumberGrammarParser.NgdoublesContext ctx) {
        if (ctx.NGTwenty() != null) {
            return 20L;
        } else if (ctx.NGThirty() != null) {
            return 30L;
        } else if (ctx.NGForty() != null) {
            return 40L;
        } else if (ctx.NGFifty() != null) {
            return 50L;
        } else if (ctx.NGSixty() != null) {
            return 60L;
        } else if (ctx.NGSeventy() != null) {
            return 70L;
        } else if (ctx.NGEighty() != null) {
            return 80L;
        } else {
            return 90L;
        }
    }

    @Override
    public Long visitNgthousand(NumberGrammarParser.NgthousandContext ctx) {
        if (ctx.ngsingle() != null) {
            return visit(ctx.ngsingle()) * 1000;
        } else {
            return 1000L;
        }
    }

    @Override
    public Long visitNgmillion(NumberGrammarParser.NgmillionContext ctx) {
        if (ctx.ngsingle() != null) {
            return visit(ctx.ngsingle()) * 1000000;
        } else {
            return 1000000L;
        }
    }

    @Override
    public Long visitNgbillion(NumberGrammarParser.NgbillionContext ctx) {
        if (ctx.ngsingle() != null) {
            return visit(ctx.ngsingle()) * 1000000000;
        } else {
            return 1000000000L;
        }
    }
}
