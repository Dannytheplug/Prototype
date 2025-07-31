package com.example.Week2.Day4;

import java.util.Arrays;
import java.util.List;

public class UpperCaseLowerCase {
    public static void p(String input, StringProcess process) {
        System.out.println(process.processString(input));

    }

    public static void main(String[] args) {
        p("IDRIS", q -> q.toLowerCase());
        p("adejumo", q -> q.toUpperCase());
    }
}
