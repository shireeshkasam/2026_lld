package com.ishan.design_patterns.structural.composite.filesystem.compliant;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite node
 */
public class Directory implements FileSystemComponent {

    private final String name;
    private final List<FileSystemComponent> children = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(FileSystemComponent component) {
        children.add(component);
    }

    @Override
    public void ls() {
        System.out.println("Directory: " + name);
        for (FileSystemComponent child : children) {
            child.ls();
        }
    }
}
