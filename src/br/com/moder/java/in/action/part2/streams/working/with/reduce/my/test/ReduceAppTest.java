package br.com.moder.java.in.action.part2.streams.working.with.reduce.my.test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceAppTest {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,3,10,14,65,87,23,60,99);

        Integer sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println(sum);

        Optional<Integer> newSum = numbers.stream().reduce((a, b) -> a + b);
        System.out.println(newSum);

        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        System.out.println(max);

        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        System.out.println(min);

    }
}
