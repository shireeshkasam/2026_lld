package com.ishan.design_patterns.behavioural.chainofresponsibility.logexample.factory;

import com.ishan.design_patterns.behavioural.chainofresponsibility.logexample.logger.*;
import com.ishan.design_patterns.behavioural.chainofresponsibility.logexample.model.LogLevel;

public class LoggerFactory {

    public static Logger getLogger(LogLevel configuredLevel) {

        Logger debugLogger = new DebugLogger();
        Logger infoLogger = new InfoLogger();
        Logger errorLogger = new ErrorLogger();

        // Build chain: DEBUG → INFO → ERROR
        debugLogger.setNext(infoLogger);
        infoLogger.setNext(errorLogger);

        // Decide entry point based on configuration
        switch (configuredLevel) {
            case DEBUG:
                return debugLogger;
            case INFO:
                return infoLogger;
            case ERROR:
                return errorLogger;
            default:
                throw new IllegalArgumentException("Unsupported log level");
        }
    }
}
