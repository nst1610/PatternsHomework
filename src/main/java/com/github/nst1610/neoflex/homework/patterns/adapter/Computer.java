package com.github.nst1610.neoflex.homework.patterns.adapter;

public class Computer {
    public void connectWithUSB(USB usb){
        usb.connect();
        System.out.println("Данные с USB-устройства прочитаны.");
    }
}
