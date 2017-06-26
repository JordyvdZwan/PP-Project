package checker.model;

/**
 * Created by Jordy van der Zwan on 24-Jun-17.
 *
 * Construct types in the source language
 */
public class Construct {

    private CType cType;
    private int length;

    public Construct(CType cType) {
        this.cType = cType;
        this.length = length;
    }

    public CType getcType() {
        return cType;
    }

    public int getLength() {
        return length;
    }

    public enum CType {
        Array;
    }
}
