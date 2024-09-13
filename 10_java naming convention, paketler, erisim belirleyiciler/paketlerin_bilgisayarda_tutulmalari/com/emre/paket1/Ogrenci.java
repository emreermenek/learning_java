package com.emre.paket1;
import com.emre.paket2.AdayOgrenci;

public class Ogrenci implements AdayOgrenci{

    @Override
    public void dersCalis() {
        System.out.println("Ders calisiyor..");
    }
}
