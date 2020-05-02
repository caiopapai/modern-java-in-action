package br.com.moder.java.in.action.part1.lambdas.functional.interfaces.book.examples;

import java.io.BufferedReader;
import java.io.IOException;

@FunctionalInterface
public interface BufferedReaderProcessor {

    String process(BufferedReader bufferedReader) throws IOException;

}
