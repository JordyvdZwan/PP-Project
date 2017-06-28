package exceptions;

import utils.iloc.model.Instr;

/**
 * Created by Jordy van der Zwan on 24-Jun-17.
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
