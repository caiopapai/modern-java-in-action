package br.com.moder.java.in.action.part2.streams.working.with.reduce.traders.example;

import java.util.Arrays;
import java.util.List;

public class TransactionRepository {

    Trader raoul = new Trader("Raoul", "Cambridge");
    Trader mario = new Trader("Mario", "Milan");
    Trader alan = new Trader("Alan", "Cambridge");
    Trader brian = new Trader("Brian", "Cambridge");

    List<Transacation> transacationList = Arrays.asList(
            new Transacation(brian, 2011, 300),
            new Transacation(raoul, 2012, 1000),
            new Transacation(raoul, 2011, 400),
            new Transacation(mario, 2012, 700),
            new Transacation(mario, 2012, 710),
            new Transacation(alan, 2012, 950)
    );

}
