package com.ishan.design_patterns.behavioural.chainofresponsibility.logexample;

import com.ishan.design_patterns.behavioural.chainofresponsibility.logexample.factory.LoggerFactory;
import com.ishan.design_patterns.behavioural.chainofresponsibility.logexample.logger.Logger;
import com.ishan.design_patterns.behavioural.chainofresponsibility.logexample.model.LogLevel;

public class LoggerDemo {
    public static void main(String[] args) {

        System.out.println("---------- INFO LEVEL SET -----------");

        Logger infoLogger = LoggerFactory.getLogger(LogLevel.INFO);
        infoLogger.log(LogLevel.DEBUG, "Entering method");
        infoLogger.log(LogLevel.INFO, "Service started");
        infoLogger.log(LogLevel.ERROR, "Database failure");

        System.out.println("---------- DEBUG LEVEL SET -----------");

        Logger debugLogger = LoggerFactory.getLogger(LogLevel.DEBUG);
        debugLogger.log(LogLevel.DEBUG, "Entering method");
        debugLogger.log(LogLevel.INFO, "Service started");
        debugLogger.log(LogLevel.ERROR, "Database failure");

        System.out.println("---------- ERROR LEVEL SET -----------");
        Logger errorLogger = LoggerFactory.getLogger(LogLevel.ERROR);
        errorLogger.log(LogLevel.DEBUG, "Entering method");
        errorLogger.log(LogLevel.INFO, "Service started");
        errorLogger.log(LogLevel.ERROR, "Database failure");
    }
}

