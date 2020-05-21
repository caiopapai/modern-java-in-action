package br.com.moder.java.in.action.part2.streams.working.with.reduce.traders.example;

public class Transacation {

    private final Trader trader;
    private final int year;
    private final int value;

    public Transacation(Trader trader, int year, int value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int getYear() {
        return year;
    }

    public Trader getTrader() {
        return trader;
    }

    @Override
    public String toString() {
        return "Transacation{" +
                "trader=" + trader +
                ", year=" + year +
                ", value=" + value +
                '}';
    }
}
