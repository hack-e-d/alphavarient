package com.example.alphavarient.logging;

import org.apache.logging.log4j.LogManager;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Logger {

    public enum LoggingLevel {
        DEBUG,
        ERROR,
        INFO,
        FATAL;
    }
    private static final org.apache.logging.log4j.Logger LOG = LogManager.getLogger(Logger.class);

    public static org.apache.logging.log4j.Logger getLOG() {
        return LOG;
    }

    public void log(String message,LoggingLevel loggingLevel) {
        if(loggingLevel == LoggingLevel.DEBUG) {
            getLOG().debug(message);
        }
        else if(LoggingLevel.INFO == loggingLevel) {
            getLOG().info(message);
        }
        else if(LoggingLevel.ERROR == loggingLevel) {
            getLOG().error(message);
        }
        else {
            getLOG().fatal(message);
        }
    }

    public void logTester() {
        log("testing logger!!!",LoggingLevel.INFO);
    }

//    public static void main(String a[]) {
//        Logger logger = new Logger();
//        logger.logTester();
//    }
}
