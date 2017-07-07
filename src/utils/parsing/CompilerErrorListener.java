package utils.parsing;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jordy van der Zwan on 24-Jun-17.
 *
 * This class is used to store errors which occur during parsing and lexing.
 */
public class CompilerErrorListener extends BaseErrorListener {
    private List<String> errorMessages;

    public CompilerErrorListener() {
        this.errorMessages = new ArrayList<>();
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        errorMessages.add("Error: " + (offendingSymbol != null ? offendingSymbol.toString() : "null") + " at line: " + line + " at pos: " + charPositionInLine + " Msg: " + msg);
    }

    public List<String> getErrorMessages() {
        return errorMessages;
    }

    public void resetErrorMessages() {
        errorMessages = new ArrayList<>();
    }
}
