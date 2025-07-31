package com.example.Week2;

public class Animal implements Day1 {
    public String name;
    public int age;

    @Override
    public void day() {
        System.out.println("Yo yo yo!");
    }
}
