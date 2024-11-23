package com.emreermenek.thread1;

public class Main {
    public static void main(String[] args) {

        Printer printer1 = new Printer("printer1");
        Printer printer2 = new Printer("printer2");

        printer1.start(); //bu ikisinin calisma sirasi tamamen islemciye ve JVM'e bagli
        printer2.start();


        System.out.println("Main thread calisiyor...");

    }
}
