package com.example.Week2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Array3 {
    public static void main(String[] args) {
        List<Array1> name1 = Arrays.asList(
          new Array1("Halima", 16),
          new Array1("Oyinko", 18),
          new Array1("Chisom", 17)
        );

        name1.sort(Comparator.comparingInt(n1 -> n1.age));
        name1.forEach(System.out::println);
    }
}
