package checker.model;

/**
 * Created by Jordy van der Zwan on 24-Jun-17.
 *
 * Types of our source language.
 * Mainly used for bookkeeping of the variables.
 */
public class Type {

    private Construct construct = null;
    private PrimitiveType primitiveType = null;

    public Type(Construct construct, PrimitiveType primitiveType) {
        this.construct = construct;
        this.primitiveType = primitiveType;
    }

    public Type(PrimitiveType primitiveType) {
        this.primitiveType = primitiveType;
    }

    public Construct getConstruct() {
        return construct;
    }

    public PrimitiveType getPrimitiveType() {
        return primitiveType;
    }

    @Override
    public String toString() {
        return "" + primitiveType + (construct != null ? construct : "");
    }
}