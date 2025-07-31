package com.example.Week3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

//Monday, 7 July, 2025
public class ListOfArray {
    //Monday, 7 July, 2025

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 20, 34, 111, 29, 8, 9);

        nums.stream()
                .filter(n -> n % 2 == 0)
                .sorted()
                .map(n -> n * 10)
                .forEach(System.out::println);
        System.out.println(nums);
    }
//        Stream<Integer> data = nums.stream();

//        Stream<Integer> sortedNumbers = data.sorted();
//        sortedNumbers .forEach(System.out::println);
//        Stream <Integer> multiplyBy = data.map(n -> n*2);
//        multiplyBy.forEach(System.out::println);



//        data.sorted(Comparator.comparingInt(Integer::intValue));
//        nums.sort(Comparator.comparingInt(Integer::intValue));
//        System.out.println(nums);

//        Stream<Integer> data = nums.stream();
//        data.forEach(System.out::println);
//        data.forEach(y -> System.out.println(y));

//        nums.forEach(System.out::println);

    }

