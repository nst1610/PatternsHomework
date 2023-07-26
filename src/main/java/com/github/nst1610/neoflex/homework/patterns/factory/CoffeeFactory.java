package com.github.nst1610.neoflex.homework.patterns.factory;

public class CoffeeFactory {
    public Coffee getCoffee(CoffeeType coffeeType){
        Coffee coffee;
        switch (coffeeType){
            case ESPRESSO -> coffee = new Espresso();
            case AMERICANO -> coffee = new Americano();
            default -> throw new IllegalArgumentException("Нет такого кофе.");
        }
        return coffee;
    }
}
