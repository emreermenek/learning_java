package com.emreermenek.paket1;
import com.emreermenek.paket2.Araba;


public class Main {
    public static void main(String[] args) {
        Araba araba = new Araba();
        //System.out.println(araba.model); public oldugu icin baska package dan erisebildik.
        // System.out.println(araba.renk); direk erisemeyiz cunku private.
        // System.out.println(araba.yil); yalnizca kendi paketinden erisebiliriz

        
        // Hayvan hayvan = new Hayvan("Boza");
         // assagida hata aliriz cunku baska paketteki protected degere dogrudan erisemeyiz.
        // System.out.println(hayvan.isim); 
       

        At at = new At("Sahbatur");
        //assagida At Hayvanin alt classi oldugu icin baska paketten isim'e erisim saglayabildik
        at.isminiSoyle(); 
    }
}
