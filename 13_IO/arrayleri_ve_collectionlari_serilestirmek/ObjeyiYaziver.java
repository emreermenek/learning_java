
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class ObjeyiYaziver {
    public static void main(String[] args) {
        
        Ogrenci ogrenci1 = new Ogrenci("Yazilim Muhendisligi", 2022, "Emre Ermenek");
        Ogrenci ogrenci2 = new Ogrenci("Siyaset Bilimi ve Uluslararasi Iliskiler", 2023, "Mert Ermenek");
        Ogrenci ogrenci3 = new Ogrenci("Ekonomi", 2024, "Mehmet Agah Caylan");
        Ogrenci ogrenci4 = new Ogrenci("Makina Muhendisligi", 2025, "Omer Caylan");

        Ogrenci[] ogrenciArray = {ogrenci1,ogrenci2,ogrenci3,ogrenci4};
        ArrayList<Ogrenci> ogrenciList = new ArrayList<>(Arrays.asList(ogrenciArray));

        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ogrenciler.bin"))) { 
            
            out.writeObject(ogrenciArray);
            out.writeObject(ogrenciList);


        } catch (IOException e) {
            System.out.println("Dosya acilirken bir sorun olustu!");
        }
    }
}
