package exceptions;

import java.util.List;

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

    public CheckerException(List<String> errors) {
        for (String error : errors) {
            message += error;
        }
    }

    @Override
    public String getMessage() {
        return message;
    }
}
