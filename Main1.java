package com.example.Week2;

public class Main1 {
    public static void main(String[] args) {
        Day1 d1  = () -> System.out.println("Dog is eating.");

        print(d1);

    }

    static void print(Day1 d1){
        d1.day();
    }
}
