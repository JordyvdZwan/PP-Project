package checker.model;

/**
 * Created by Jordy van der Zwan on 06-Jul-17.
 */
public class Id {

    private String name;
    private int number;

    Id(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public Id(String name) {
        this.name = name;
    }

    /**
     * @return The name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     * @param name The new name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return The ID number.
     */
    public int getNumber() {
        return number;
    }

    /**
     * Sets the ID
     * @param number The new ID.
     */
    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Id{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
