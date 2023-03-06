package com.Abhishek.properties.polymorphisms;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Shapes circle = new Circle();
        Shapes square = new Squares();

        circle.area();
    }
}