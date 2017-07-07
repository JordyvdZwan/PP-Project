package checker.model;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

/**
 * Created by Jordy van der Zwan on 26-Jun-17.
 *
 * This class is to keep track of all the data of the parse tree.
 */
public class CheckerRecord {
    /**
     * Entries is used to determine the entry point of a Node in the parse tree.
     * This is needed when a node is dependent on another node.
     */
    private ParseTreeProperty<ParserRuleContext> entries = new ParseTreeProperty<>();

    /**
     * Types is used to store the types of the parse tree nodes.
     * This helps with type checking.
     */
    private ParseTreeProperty<Type> types = new ParseTreeProperty<>();

    /**
     * Offsets is used to link the offset in the memory to a variable name in the code.
     * This is done using the DeclarationTable to look up the offsets and storing them here for convenience
     */
    private ParseTreeProperty<Integer> offsets = new ParseTreeProperty<>();

    /**
     * Globals is used to determine whether a variable is in the shared memory or in the local memory.
     * This is mainly used for checking on declaration problems and generation the ILOC code.
     */
    private ParseTreeProperty<Boolean> globals = new ParseTreeProperty<>();

    /**
     * ForkIds is used to record the id's used to determine on which fork you want to join.
     */
    private ParseTreeProperty<Integer> forkIDs = new ParseTreeProperty<>();

    /**
     * This variable is used to keep track of the amount of threads and is only used to determine how
     * many progs to use in the sprockel code.
     */
    public int nrOfThreads = 1;

    public void setEntry(ParserRuleContext node, ParserRuleContext entry) {
        entries.put(node, entry);
    }
    public void setType(ParserRuleContext node, Type type) {
        types.put(node, type);
    }
    public void setOffset(ParserRuleContext node, Integer offset) {
        offsets.put(node, offset);
    }
    public void setGlobal(ParserRuleContext ctx, boolean global) {
        globals.put(ctx, global);
    }
    public void setForkId(ParserRuleContext ctx, Integer forkID) {
        forkIDs.put(ctx, forkID);
    }

    public ParserRuleContext getEntry(ParserRuleContext node) {
        return entries.get(node);
    }
    public Type getType(ParserRuleContext node) {
        return types.get(node);
    }
    public Integer getOffset(ParserRuleContext node) {
        return offsets.get(node);
    }
    public Boolean getGlobal(ParserRuleContext node) {
        return globals.get(node);
    }
    public Integer getForkId(ParserRuleContext node) {
        return forkIDs.get(node);
    }

    @Override
    public String toString() {
        return "CheckerRecord{" +
                "\nentries=" + entries.toString() +
                "\n, types=" + types.toString() +
                "\n, offsets=" + offsets.toString() +
                "\n}";
    }
}
