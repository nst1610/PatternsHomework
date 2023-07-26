package com.github.nst1610.neoflex.homework.patterns.proxy;

public class RealDataBaseConnector implements DataBaseConnector{
    private String url;

    public RealDataBaseConnector(String url){
        this.url = url;
    }
    @Override
    public void connect() {
        System.out.println("Подключено " + url);
    }
}
