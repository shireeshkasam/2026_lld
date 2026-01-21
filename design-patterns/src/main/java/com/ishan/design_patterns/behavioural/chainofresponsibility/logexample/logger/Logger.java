package com.ishan.design_patterns.behavioural.chainofresponsibility.logexample.logger;

import com.ishan.design_patterns.behavioural.chainofresponsibility.logexample.model.LogLevel;

public abstract class Logger {

    protected Logger next;

    public void setNext(Logger next) {
        this.next = next;
    }

    public abstract void log(LogLevel level, String message);
}
