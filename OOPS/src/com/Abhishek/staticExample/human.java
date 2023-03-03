package com.Abhishek.staticExample;

public class human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    static void message() {
        System.out.println("Hello world");
//        System.out.println(this.age); // cant use this over here
    }

    public human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        human.population += 1;
    }
}
