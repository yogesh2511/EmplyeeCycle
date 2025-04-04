package com.test.automation.UIAutomation.utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.spi.ExtendedLogger;
import org.apache.logging.log4j.Level;

public class Logger {

    private static final String FQCN = Logger.class.getName(); // Fully Qualified Class Name of RestLogger

    private static ExtendedLogger getLogger() {
        return (ExtendedLogger) LogManager.getLogger(getCallerClassName());
    }

    public static void info(String message) {
        getLogger().logIfEnabled(FQCN, Level.INFO, null, message, (Throwable) null);
    }

    public static void debug(String message) {
        getLogger().logIfEnabled(FQCN, Level.DEBUG, null, message, (Throwable) null);
    }

    public static void warn(String message) {
        getLogger().logIfEnabled(FQCN, Level.WARN, null, message, (Throwable) null);
    }

    public static void error(String message) {
        getLogger().logIfEnabled(FQCN, Level.ERROR, null, message, (Throwable) null);
    }

    public static void error(String message, Throwable throwable) {
        getLogger().logIfEnabled(FQCN, Level.ERROR, null, message, throwable);
    }

    public static void fatal(String message) {
        getLogger().logIfEnabled(FQCN, Level.FATAL, null, message, (Throwable) null);
    }

    private static String getCallerClassName() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (int i = 2; i < stackTrace.length; i++) {
            String className = stackTrace[i].getClassName();
            if (!className.equals(Logger.class.getName())) {
                return className; // Return actual calling class
            }
        }
        return Logger.class.getName(); // Fallback
    }
}
