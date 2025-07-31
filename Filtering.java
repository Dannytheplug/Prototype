package com.example.Week3;

import java.util.Arrays;
import java.util.List;

//Tuesday, 8 July 2025
public class Filtering {
//    Tuesday, 8 July 2025
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jome", "Jaine", "Jack", "Doe");
        names.stream()
                .filter(q -> q.contains("J"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
