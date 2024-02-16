public class LogLevels {

    public static String message(String logLine) {

        if(logLine.contains("[WARNING]")){
            logLine = logLine.replace("[WARNING]:", " ");
            logLine = logLine.trim();
        }

        if(logLine.contains("[INFO]")){
            logLine = logLine.replace("[INFO]:", " ");
            logLine = logLine.trim();
        }

        if(logLine.contains("[ERROR]")){
            logLine = logLine.replace("[ERROR]:", " ");
            logLine = logLine.trim();
        }
        return logLine;
    }
    
    public static String logLevel(String logLine) {

        if(logLine.contains("[WARNING]")){
           return "warning";
        }

        if(logLine.contains("[INFO]")){
            return "info";
        }

         if(logLine.contains("[ERROR]")){
            logLine = logLine.replace("[ERROR]"," ");
            return "error";
        }
        return logLine;
    }

    public static String reformat(String logLine) {
        return message(logLine) + "(" + logLevel(logLine) +")" ;
    }
}
