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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
