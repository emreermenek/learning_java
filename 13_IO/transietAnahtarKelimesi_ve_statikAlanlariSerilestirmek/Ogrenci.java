import java.io.Serializable;

/*
 *  Bazen ayni objeden cok fazla serialize etmek isteyebiliriz ve dosya boyutunu kucultmek icin
 *  objenin bazi ozelliklerini serialize etmeyebiliriz. bunun icin transient anahtar kelimesi kullaniriz.
*/

public class Ogrenci implements Serializable{
    
    private String isim;
    private transient int id; //bunu sakin serilestirme dedik
    private String bolum;

    private static int ogrenciSayisi = 0; //static alanlar otomatik olarak serilestirilmez..

    public static int getOgrenciSayisi() {
        return ogrenciSayisi;
    }

    public static void setOgrenciSayisi(int ogrenciSayisi) {
        Ogrenci.ogrenciSayisi = ogrenciSayisi;
    }

    public Ogrenci(String bolum, int id, String isim) {
        this.bolum = bolum;
        this.id = id;
        this.isim = isim;
    }

    @Override
    public String toString() {
       String bilgiler = "Ogrenci ismi: " + isim +
                         "\nOgrenci numarasi: " + id +
                         "\nOgrenci bolum: " + bolum;
        return bilgiler;
    }
}
