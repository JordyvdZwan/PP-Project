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
    private ParseTreeProperty<ParserRuleContext> entries = new ParseTreeProperty<>();
    private ParseTreeProperty<Type> types = new ParseTreeProperty<>();
    private ParseTreeProperty<Integer> offsets = new ParseTreeProperty<>();
    private ParseTreeProperty<Boolean> globals = new ParseTreeProperty<>();
    private ParseTreeProperty<Integer> forkIDs = new ParseTreeProperty<>();

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

    public ParseTreeProperty<ParserRuleContext> getEntries() {
        return entries;
    }
    public ParseTreeProperty<Type> getTypes() {
        return types;
    }
    public ParseTreeProperty<Integer> getOffsets() {
        return offsets;
    }

    public static int nrOfThreads = 0;


    @Override
    public String toString() {
        return "CheckerRecord{" +
                "\nentries=" + entries.toString() +
                "\n, types=" + types.toString() +
                "\n, offsets=" + offsets.toString() +
                "\n}";
    }

    public String entriesToString(ParseTreeProperty<ParserRuleContext> ptp, ParseTree tree) {
        String res = ptp.get(tree) != null ? ptp.get(tree).toString() : "";
        for (int i = 0; i < tree.getChildCount(); i++) {
            res += entriesToString(ptp, tree.getChild(i)) + ", ";
        }
        return res;
    }

    public String typesToString(ParseTreeProperty<Type> ptp, ParseTree tree) {
        String res = ptp.get(tree) != null ? ptp.get(tree).toString() : "";
        for (int i = 0; i < tree.getChildCount(); i++) {
            res += typesToString(ptp, tree.getChild(i)) + ", ";
        }
        return res;
    }

    public String offsetsToString(ParseTreeProperty<Integer> ptp, ParseTree tree) {
        String res = ptp.get(tree) != null ? ptp.get(tree).toString() : "";
        for (int i = 0; i < tree.getChildCount(); i++) {
            res += offsetsToString(ptp, tree.getChild(i)) + ", ";
        }
        return res;
    }


}
