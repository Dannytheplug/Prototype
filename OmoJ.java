package com.example.Week2;

import java.util.Arrays;
import java.util.List;

public class OmoJ {
    public static void main(String[] args) {
        List<Omo> mo = Arrays.asList(
                new Omo("Ali"),
                new Omo("Angela"),
                new Omo("Ade"),
                new Omo("John")
        );

//        System.out.println(mo.remove(1));
        System.out.println(mo);
//        mo.forEach(System.out::println);
    }
}
