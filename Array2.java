package com.example.Week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Array2 {

    public static void main(String[] args) {
        List<Array1> name = Arrays.asList(
                new Array1("Malik", 12),
                new Array1("Farouq", 19),
                new Array1("Ayo", 25)
        );
        name.sort(Comparator.comparingInt(n -> n.age));
        name.forEach(System.out::println);

//        System.out.println(name);
    }
}
