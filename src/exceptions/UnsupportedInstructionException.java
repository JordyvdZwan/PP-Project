package exceptions;

/**
 * Created by Jordy van der Zwan on 24-Jun-17.
 */

/**
 * This exception gets thrown when an Instruction is used that isn't declared anywhere.
 */
public class UnsupportedInstructionException extends Exception {
    private String message;

    public UnsupportedInstructionException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
