package com.ishan.design_patterns.structural.composite.filesystem.violated;

public class Client {

    public static void main(String[] args) {
        Directory movie = new Directory("Movie");

        movie.add(new File("Border"));

        Directory comedy = new Directory("ComedyMovie");
        comedy.add(new File("Welcome"));

        movie.add(comedy);

        movie.ls();
    }
}
