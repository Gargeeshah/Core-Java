package com.practice.lambdaexpression;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PreDefineFunctionalClass {
    public static void main(String[] args){

        System.out.println("----------Predicate---------");
        int num = 10;
        Predicate<Integer> isEven = num1 -> num1 % 2 == 0;
        if(isEven.test(num)) {
            System.out.println(num + " is even!");
        }

        Predicate<Integer> isDivisibleBy5 = num1 -> num1 % 2 == 0;
        Predicate<Integer> filter = isEven.and(isDivisibleBy5);
        if(filter.test(num)) {
            System.out.println(num + " is even and divisible by 5!");
        }

        Predicate<Integer> isNotEven = isEven.negate();
        if(isNotEven.test(num)) {
            System.out.println(num + " is not even!");
        }

        System.out.println("----------Supplier----------");
        Supplier<Integer> supplier = () -> new Random().nextInt(100);
        System.out.println(supplier.get());

        System.out.println("----------Consumer---------");
        Consumer<Integer> printNum = n -> System.out.print("Number: " + n);
        Consumer<Integer> invert = n -> System.out.print(", Inverted: " + (-n));
        Consumer<Integer> doubleNum = n -> System.out.print(", Double, " + n * 2);
        Consumer<Integer> result = printNum
                .andThen(invert)
                .andThen(doubleNum);
        result.accept(10);

        System.out.println("-------chaining of predicate, consumer and supplier------");
        Supplier<Integer> randomIntSupplier = () -> {
            int random = new Random().nextInt(100);
            System.out.print("Random number " + random);
            return random;
        };
        Consumer<Boolean> printAnswer = answer -> System.out.println(" is even? " + answer);
        printAnswer.accept(isEven.test(randomIntSupplier.get()));

        System.out.println("-----------Function----------");
        Function<Integer, Integer> square = n -> n * n;
        System.out.println(square.apply(5));


        Function<Integer, Double> multiplyByPi = n -> n * Math.PI;
        Function<Integer, Double> findArea =multiplyByPi.compose(square);
        System.out.println(findArea.apply(5));

        
    }
}
