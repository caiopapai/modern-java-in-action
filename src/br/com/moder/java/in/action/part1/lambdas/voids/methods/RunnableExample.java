package br.com.moder.java.in.action.part1.lambdas.voids.methods;

public class RunnableExample {

    public static void main(String[] args) {
        process(() -> System.out.println("This is a void lambda passing by argument2"));
    }

    public static void process(Runnable runnable){
        runnable.run();
    }

}
