package utils.log;

import java.io.*;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Jordy van der Zwan on 13-Mar-17.
 *
 * This Class represents a log to which you can add logItems or messages.
 * It is possible to use this class with multiple threads.
 */
public class Log {

    private List<LogItem> logItems = new LinkedList<>();
    private boolean printToScreen;
    private boolean writeToFile;
    private Writer writer;

    public Log(boolean printToScreen, boolean writeToFile) {
        this.printToScreen = printToScreen;
        this.writeToFile = writeToFile;
        if (writeToFile) {
            try {
                writer = new BufferedWriter(new OutputStreamWriter(
                        new FileOutputStream("resources\\logs\\ppl-compiler-log-" + LogItem.sdf.format(new Date()) + ".log"), "utf-8"));
            } catch (UnsupportedEncodingException | FileNotFoundException e) {
                e.printStackTrace();
                this.writeToFile = false;
                addLogItem("Could not create log file!", LogType.Error);
            }
        }
    }

    /**
     * This method adds a LogItem to the log.
     * @param item The LogItem that needs to be logged.
     */
    public synchronized void addLogItem(LogItem item) {
        logItems.add(item);
        if (printToScreen) {
            System.out.println(item.toLogString());
        }
        if (writeToFile) {
            appendLogFile(item);
        }
    }

    private void appendLogFile(LogItem item) {
        try {
            writer.append(item.toLogString()).append(String.valueOf('\n'));
            writer.flush();
        } catch (IOException e) {
            writeToFile = false;
            addLogItem("Could not write to log file!", LogType.Error);
        }
    }

    /**
     * This method creates a new LogItem and adds it to the log.
     * @param message Message that you need to log.
     * @param type This is the type of the LogItem that will be created.
     */
    public void addLogItem(String message, LogType type) {
        addLogItem(new LogItem(message, type));
    }


    /**
     * This method converts the log to a string representation mainly used to write to a file as size can become extensive.
     * @return String representation of the log.
     */
    public String toString() {
        String result = "";
        for (LogItem item : logItems) {
            result = result + item.toLogString() + "\n";
        }
        return result;
    }

    /**
     * This method converts the log to a string representation mainly used to write to a console as size can be limited.
     * It has a parameter so you can limit the amount of lines you want to receive.
     * @param lines Maximum amount of lines you want the result to be.
     * @return String (possibly partial) representation of the log.
     */
    public String toString(int lines) {
        String result = "";
        for (int i = (logItems.size() < lines ? 0 : logItems.size() - lines); i < logItems.size(); i++) {
            result = result + logItems.get(i).toLogString() + "\n";
        }
        return result;
    }

    /**
     * This method converts the log to a string representation mainly used to write to a file.
     * @param type The type of logItems the result will contain.2
     * @return String representation of the LogItems of the type you have given.
     */
    public String toString(LogType type) {
        String result = "";
        for (LogItem item : logItems) {
            if (item.getType() == LogType.Dev && (type == LogType.Dev)) {
                result = result + item.toLogString() + "\n";
            } else if (item.getType() == LogType.Info && (type == LogType.Dev || type == LogType.Info)) {
                result = result + item.toLogString() + "\n";
            } else if (item.getType() == LogType.Warning && (type == LogType.Dev || type == LogType.Info || type == LogType.Warning)) {
                result = result + item.toLogString() + "\n";
            } else if (item.getType() == LogType.Error) {
                result = result + item.toLogString() + "\n";
            }
            result = result + item.toLogString() + "\n";
        }
        return result;
    }

    /**
     * This method converts the log to a string representation mainly used to write to a file.
     * @param lines Maximum amount of lines you want the result to be.
     * @param type The type of logItems the result will contain.
     * @return String representation of the LogItems of the type you have given.
     */
    public String toString(int lines, LogType type) {
        String result = "";
        for (int i = (logItems.size() < lines ? 0 : logItems.size() - lines); i < logItems.size(); i++) {
            if (logItems.get(i).getType() == LogType.Dev && (type == LogType.Dev)) {
                result = result + logItems.get(i).toLogString() + "\n";
            } else if (logItems.get(i).getType() == LogType.Info && (type == LogType.Dev || type == LogType.Info)) {
                result = result + logItems.get(i).toLogString() + "\n";
            } else if (logItems.get(i).getType() == LogType.Warning && (type == LogType.Dev || type == LogType.Info || type == LogType.Warning)) {
                result = result + logItems.get(i).toLogString() + "\n";
            } else if (logItems.get(i).getType() == LogType.Error) {
                result = result + logItems.get(i).toLogString() + "\n";
            }
        }
        return result;
    }
}
