package br.com.moder.java.in.action.part1.lambdas.methods.references.book.examples;

import java.util.Arrays;
import java.util.List;

public class ComparingStrings {

    public static void main(String[] args) {
        compareLists();
    }

    public static void compareLists(){
        //Without method reference
        List<String> strings = Arrays.asList("a","b","A","B");
        strings.sort((a1,a2) -> a1.compareToIgnoreCase(a2));

        //With method reference
        strings.sort(String::compareToIgnoreCase);
    }
}
