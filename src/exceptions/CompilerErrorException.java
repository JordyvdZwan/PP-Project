package exceptions;

/**
 * Created by Jordy van der Zwan on 25-Jun-17.
 */

/**
 * This exception gets thrown when an error occurs in the compiler fase.
 */
public class CompilerErrorException extends Exception {

    private String message;

    public CompilerErrorException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
