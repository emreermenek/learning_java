import java.io.Serializable;

/* Classimiza versiyon atamak istersek Serialal Ui ozelligini kullanabiliriz.
 * Versiyon atamamiz classi guncelledigimzde javanin bizim soyledigimiz versiyonu secmesini saglar..
*/

public class Ogrenci implements Serializable{
    

    private static final long serialVersionUID = 1000; //bir ozellik ekleyince bunu degistirirsek hatalari engellemis oluruz..
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
