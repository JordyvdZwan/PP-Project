package utils.log;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Jordy van der Zwan on 09-Mar-17.
 *
 * This class represents a single item in a log.
 * It contains a message and what type of message it is.
 */
public class LogItem {
    /*-----------------------------------------------------------
                           Attributes
     -----------------------------------------------------------*/

    final static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH.mm.ss.SSS");

    private String message;
    private LogType type;
    private Date date;

    /*-----------------------------------------------------------
                            Methods
     -----------------------------------------------------------*/

    LogItem(String message, LogType type) {
        this.message = message;
        this.type = type;
        date = new Date(System.currentTimeMillis());
    }

    String toLogString() {
        return sdf.format(date) + " [" + type +  "]: " + message;
    }

    /*-----------------------------------------------------------
                       Getters and Setters
     -----------------------------------------------------------*/

    public String getMessage() {
        return message;
    }
    public LogType getType() {
        return type;
    }
    public Date getDate() {
        return date;
    }

}
