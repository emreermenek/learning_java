
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjeyiOku {
    public static void main(String[] args) {
        
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("ogrenci.bin"))){
            Ogrenci ogrenci1 = (Ogrenci)in.readObject(); //ogrenciyi yazdirirken objeye donusturduk simdi geri ogrenciye donusturmemiz gerekir.
            Ogrenci ogrenci2 = (Ogrenci)in.readObject();

            System.out.println(ogrenci1);
            System.out.println(ogrenci2);

        }catch(IOException e){
            System.out.println("Dosya acilirken sorun olustu!");
        }catch(ClassNotFoundException e){
            System.out.println("Boyle bir obje bulunamadi!");
        }
    }
}
