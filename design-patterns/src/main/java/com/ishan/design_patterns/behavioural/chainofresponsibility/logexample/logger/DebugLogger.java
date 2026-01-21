package com.ishan.design_patterns.behavioural.chainofresponsibility.logexample.logger;

import com.ishan.design_patterns.behavioural.chainofresponsibility.logexample.model.LogLevel;

public class DebugLogger extends Logger {

    @Override
    public void log(LogLevel level, String message) {
        if (level == LogLevel.DEBUG) {
            System.out.println("DEBUG: " + message);
        } else if (next != null) {
            next.log(level, message);
        }
    }
}
