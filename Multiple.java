package com.example.Week2.Day4;

import java.util.Arrays;
import java.util.List;

public class Multiple {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4);

        int ans = nums.stream().reduce(1,(a,b) -> a*b);

        System.out.println(ans);
    }
}
