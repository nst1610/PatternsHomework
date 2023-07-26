package com.github.nst1610.neoflex.homework.patterns.adapter;

public class Main {
    public static void main(String[] args) {
        MemoryCard memoryCard = new MemoryCard();
        Computer computer = new Computer();
        USB adapter = new Adapter(memoryCard);
        computer.connectWithUSB(adapter);
    }
}
