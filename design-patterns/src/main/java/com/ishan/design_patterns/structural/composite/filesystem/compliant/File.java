package com.ishan.design_patterns.structural.composite.filesystem.compliant;

/**
 * Leaf node
 */
public class File implements FileSystemComponent {

    private final String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void ls() {
        System.out.println("File: " + name);
    }
}
