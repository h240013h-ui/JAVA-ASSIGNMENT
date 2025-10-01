package com.banking.system;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 4, 5, 20, 30, 6);
        List<Integer> divisibleBy5 = numbers.stream()
                .filter(n -> n % 5 == 0)
                .collect(Collectors.toList());
        System.out.println("Numbers divisible by 5: " + divisibleBy5);
    }
}
