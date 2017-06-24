package exceptions;

import java.util.List;

/**
 * Created by Jordy van der Zwan on 24-Jun-17.
 *
 * This exception is thrown when an error listener has found one or more errors in the lexer or parsing phase.
 */
public class SyntaxErrorException extends Exception {
    private List<String> errorMessages;

    public SyntaxErrorException(List<String> errorMessages) {
        this.errorMessages = errorMessages;
    }

    @Override
    public String getMessage() {
        String result = "";
        for (String line : errorMessages) {
            result += line + "\n";
        }
        return result;
    }
}
