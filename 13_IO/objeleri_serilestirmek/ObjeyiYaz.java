
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjeyiYaz {
    public static void main(String[] args) {
        //bin dat ser uzantilarini girebiliriz hicbir sey degismezdi..
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ogrenci.bin"))) { 
            
            Ogrenci ogrenci1 = new Ogrenci("Yazilim Muhendisligi", 2022, "Emre Ermenek");
            Ogrenci ogrenci2 = new Ogrenci("Siyaset Bilimi ve Uluslararasi Iliskiler", 2023, "Mert Ermenek");

            out.writeObject(ogrenci1);
            out.writeObject(ogrenci2);


        } catch (IOException e) {
            System.out.println("Dosya acilirken bir sorun olustu!");
        }
    }
}
