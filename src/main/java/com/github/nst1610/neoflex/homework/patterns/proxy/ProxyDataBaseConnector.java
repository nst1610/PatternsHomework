package com.github.nst1610.neoflex.homework.patterns.proxy;

public class ProxyDataBaseConnector implements DataBaseConnector{
    private RealDataBaseConnector realDataBaseConnector;
    private String name;

    public ProxyDataBaseConnector(String name){
        this.name = name;
    }
    @Override
    public void connect() {
        if (realDataBaseConnector == null){
            realDataBaseConnector = new RealDataBaseConnector("localhost:port/" + name);
        }
        realDataBaseConnector.connect();
    }
}
