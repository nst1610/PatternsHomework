package com.github.nst1610.neoflex.homework.patterns.adapter;

public class Adapter implements USB{
    private MemoryCard memoryCard;

    public Adapter(MemoryCard memoryCard){
        this.memoryCard = memoryCard;
    }

    @Override
    public void connect() {
        memoryCard.read();
    }
}
