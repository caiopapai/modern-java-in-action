package br.com.moder.java.in.action.part1.lambdas.book.practice;

import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.*;

public class MainApp {

    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();
        inventory.sort(comparing(Apple::getWeight)
                .reversed()
                .thenComparing(Apple::getCountry));

    }

}

