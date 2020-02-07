package com.pradipta.lambdas.unit2;

import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;

public class ExceptionHandling {
    public static void main(String[] args) {
        int[] someNums = {1, 2, 3, 4};
        int key = 0;
        process(someNums, key, wrapperLambda((a, b) -> System.out.println(a / b)));
    }

    private static void process(int[] nums, int key, BiConsumer<Integer, Integer> biConsumer) {
        for (int i : nums) {
            biConsumer.accept(i, key);
        }
    }

    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> biConsumer) {
        return (i, j) -> {
            try {
                biConsumer.accept(i, j);
            } catch (Exception ex) {
                System.out.println(ex);
            }
        };
    }
}
