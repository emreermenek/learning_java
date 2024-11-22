import java.io.Serializable;

public class Ogrenci implements Serializable{
    
    private String isim;
    private int id;
    private String bolum;

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
