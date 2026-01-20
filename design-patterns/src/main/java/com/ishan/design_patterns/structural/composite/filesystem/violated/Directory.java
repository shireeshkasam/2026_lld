package com.ishan.design_patterns.structural.composite.filesystem.violated;

import java.util.ArrayList;
import java.util.List;

public class Directory {

    private final String name;
    private final List<Object> children = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(Object obj) {
        children.add(obj);
    }

    public void ls() {
        System.out.println("Directory Name: " + name);
        for (Object obj : children) {
            if (obj instanceof File) {
                ((File) obj).ls();
            } else if (obj instanceof Directory) {
                ((Directory) obj).ls();
            }
        }
    }
}
