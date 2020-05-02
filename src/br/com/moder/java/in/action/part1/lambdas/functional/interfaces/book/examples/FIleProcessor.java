package br.com.moder.java.in.action.part1.lambdas.functional.interfaces.book.examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FIleProcessor {

    public static void main(String[] args) throws IOException {

        //Behaviour parametrization
        String result = processFile((BufferedReader br) -> br.readLine());
        System.out.println(result);

        String resultTwo = processFile((BufferedReader br) -> br.readLine() + br.readLine());
        System.out.println(resultTwo);
    }

    public static String processFile(BufferedReaderProcessor processor) throws IOException{
        try (BufferedReader br = new BufferedReader(new FileReader("text.txt"))){
            return processor.process(br);
        }
    }

}
