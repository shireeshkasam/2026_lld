package com.ishan.design_patterns.structural.composite.filesystem.violated;

public class File {

    private final String name;

    public File(String name) {
        this.name = name;
    }

    public void ls() {
        System.out.println("file name " + name);
    }
}
