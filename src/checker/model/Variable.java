package checker.model;

/**
 * Created by Jordy van der Zwan on 24-Jun-17.
 *
 * This class is used to keep track of the variables in the program.
 */
public class Variable {
    private Type type;
    private String id;
    private int offset;

    public Variable(Type type, String id, int offset) {
        this.id = id;
        this.offset = offset;
        this.type = type;
    }

    public Type getType() {
        return type;
    }
    public String getId() {
        return id;
    }
    public int getOffset() {
        return offset;
    }
    public void setType(Type type) {
        this.type = type;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setOffset(int offset) {
        this.offset = offset;
    }

    @Override
    public String toString() {
        return type + " " + id;
    }


}
