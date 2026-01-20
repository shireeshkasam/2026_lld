package com.ishan.design_patterns.structural.composite.filesystem.compliant;

public class CompositePatternDemo {

    public static void main(String[] args) {

        Directory root = new Directory("Movie");

        File border = new File("Border");

        Directory comedy = new Directory("ComedyMovie");
        comedy.add(new File("Welcome"));

        root.add(border);
        root.add(comedy);

        root.ls();
    }
}
