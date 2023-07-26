package com.github.nst1610.neoflex.homework.patterns.factory;

public class Main {
    public static void main(String[] args) {
        CoffeeFactory factory = new CoffeeFactory();
        Coffee americano = factory.getCoffee(CoffeeType.AMERICANO);
        Coffee espresso = factory.getCoffee(CoffeeType.ESPRESSO);
    }
}
