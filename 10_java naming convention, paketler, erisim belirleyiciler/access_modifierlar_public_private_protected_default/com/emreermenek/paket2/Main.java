package com.emreermenek.paket2;

public class Main {
    public static void main(String[] args) {
        // Araba araba = new Araba();
        // System.out.println(araba.model); //public oldugu icin rahatca eristik
        // System.out.println(araba.renk);  //private oldugu icin dogrudan kendi paketinden bile erisemeyiz.
        // System.out.println(araba.yil);  //default oldugu kendi packageinden sorunsuz erisebildik.
        
        Hayvan hayvan = new Hayvan("Boza");
        
        System.out.println(hayvan.isim); //protected degere kendş paketinden kolayca eristik
        //fakat diger paketlerden erisemeyiz..
        
    }
}
