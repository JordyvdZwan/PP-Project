package exceptions;

/**
 * Created by Jordy van der Zwan on 24-Jun-17.
 *
 * This exception is thrown when an error occurs during the Checker phase.
 */
public class CheckerException extends Exception {
    private String message = "";

    public CheckerException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
