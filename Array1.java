package com.example.Week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array1 {
    public String name;
    public int age;

    public Array1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        List<String> name = Arrays.asList("Malik", "Farouq", "Ayo");
        name.forEach(good-> System.out.println("Hello" + name));
    }

    @Override
    public String toString() {
        return "Array1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}