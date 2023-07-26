package com.github.nst1610.neoflex.homework.patterns.singleton;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static volatile Logger logger;

    private Logger(){}

    public static Logger getInstance(){
        if(logger == null){
            synchronized (Logger.class){
                if(logger == null){
                    logger = new Logger();
                }
            }
        }
        return logger;
    }

    public void classLog(Object obj, String info){
        System.out.println("Log info: " + LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))
                + " - " + obj.getClass().getSimpleName() + " - " + info);
    }
}
