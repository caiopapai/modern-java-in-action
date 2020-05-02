package br.com.moder.java.in.action.part1.lambdas.functional.interfaces.my.examples.product.checker;

import java.util.Arrays;
import java.util.List;

public class Products {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,3,5,6,7,9,10,40,3);
        for (Integer number : numbers) {
            printValidValues(number, (n) -> n < 50, "This number is less than 50");
            printValidValues(number, (n) -> n > 50, "This number is greater than 50");
            printValidValues(number, (n) -> n < 3, "This number is less than 3");
        }

        List<String> products = Arrays.asList("","Product1", "Product2", "Product3");
        for (final String product : products) {
                                         // Behaviour
            printProductChecked(product, (p) -> p.endsWith("3"), "This product ends with 3");
            printProductChecked(product, (p) -> p.isEmpty(), "This product is Empty");
            printProductChecked(product, (p) -> p.startsWith("P"), "This product starts with P");
            printProductChecked(product, (p) -> p.endsWith("2"), "This product ends with 2");
        }
    }

    public static void printValidValues(int number, ValueChecker checker, String message) {
        if (checker.valid(number)) {
            System.out.println("Checked -> " + number + " " + message);
        }
    }



    public static void printProductChecked(String product, ProductChecker checker, String message) {
            if (checker.check(product)) {
                System.out.println("Checked -> " + product + " " + message);
            }
    }
}