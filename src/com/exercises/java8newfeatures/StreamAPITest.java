package com.exercises.java8newfeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPITest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(6);

        Stream<Integer> stream = list.stream();
        Stream<Integer> parallelStream = list.parallelStream();

        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        IntStream intStream = Arrays.stream(arr);

        Stream<Integer> ofStream = Stream.of(1, 2, 3, 4, 5, 6);

        Stream.iterate(0, t -> t + 2).limit(10).forEach(System.out::println);
        Stream.generate(Math::random).limit(10).forEach(System.out::println);
    }
}
