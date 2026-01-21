package com.ishan.design_patterns.behavioural.chainofresponsibility.logexample.logger;

import com.ishan.design_patterns.behavioural.chainofresponsibility.logexample.model.LogLevel;

public class ErrorLogger extends Logger {

    @Override
    public void log(LogLevel level, String message) {
        if (level == LogLevel.ERROR) {
            System.out.println("ERROR: " + message);
        }
    }
}