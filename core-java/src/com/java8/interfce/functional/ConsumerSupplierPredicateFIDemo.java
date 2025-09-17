package com.java8.interfce.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerSupplierPredicateFIDemo {

    public static void main(String[] args) {

        //Consumer Functional Interface
        /*
         * Consumer<Integer> consumer = t -> System.out.println("Printing  : " + t);
         *
         * consumer.accept(10);
         */

        List<String> stringList = Arrays.asList(
        "@My-Secret!Box",
        "$D3CRe4m#Road",
        "&Chill@Nights*",
        "%Rock&Roll@",
        "^Adventure$Time"
        );

        stringList.stream().forEach(t -> System.out.println("Business logic to convert upper case using Consumer FI: " + t.toUpperCase()));

        //Demo For Predicate Interface
        // Here Filter function accepts predicate interface
        Predicate<Integer> predicate = t ->t % 2 == 0;
        System.out.println("Result From Predicate:"+predicate.test(5));

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);

        integerList.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.println("print  Even: " + t));

        //Supplier Functional Interface Example

        List<String> list1 = Arrays.asList();

        System.out.println(list1.stream().findAny().orElseGet(() -> "Hi from supplier functional interface. No input but getting this as output"));
    }

}
