package com.github.nst1610.neoflex.homework.patterns.proxy;

public class Main {
    public static void main(String[] args) {
        DataBaseConnector connection = new ProxyDataBaseConnector("test_db");
        connection.connect();
    }
}
