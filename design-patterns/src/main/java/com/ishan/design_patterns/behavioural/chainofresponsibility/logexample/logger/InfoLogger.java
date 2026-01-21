package com.ishan.design_patterns.behavioural.chainofresponsibility.logexample.logger;

import com.ishan.design_patterns.behavioural.chainofresponsibility.logexample.model.LogLevel;

public class InfoLogger extends Logger {

    @Override
    public void log(LogLevel level, String message) {
        if (level == LogLevel.INFO) {
            System.out.println("INFO: " + message);
        } else if (next != null) {
            next.log(level, message);
        }
    }
}