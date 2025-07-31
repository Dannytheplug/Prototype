package com.example.Week2;

public class Person {

    public static void main(String[] args) {
        Day2 d = () -> System.out.println("This student is reading.");

        read(d);

        Day1 d3 = () -> System.out.println("This student is playing.");

        reader(d3);
    }

    static void read(Day2 d){
        d.reading();
    }
    static void reader(Day1 d3){
        d3.day();
    }
}
