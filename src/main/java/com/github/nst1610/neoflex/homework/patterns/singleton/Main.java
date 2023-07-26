package com.github.nst1610.neoflex.homework.patterns.singleton;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.classLog(new Main(), "Some info");
    }
}
