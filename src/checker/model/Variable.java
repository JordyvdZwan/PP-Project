package checker.model;

/**
 * Created by Jordy van der Zwan on 24-Jun-17.
 *
 * This class is used to keep track of the variables in the program.
 */
public class Variable {
    private Type type;
    private String id;

    public Variable(Type type, String id) {
        this.type = type;
        this.id = id;
    }

    public Type getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return type + " " + id;
    }
}
