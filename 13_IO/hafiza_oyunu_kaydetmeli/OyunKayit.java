
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class OyunKayit {
    
    public static void oyunuKaydet(Kart[][] kartlar){

        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("kayit.bin"))){

            System.out.println("Oyun kaydediliyor...");

            out.writeObject(kartlar);

        }catch(IOException e){
            System.out.println("Kaydedilirken bir sorun olustu..");
        }
    }

    public static Kart[][] kayittanAl(){
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("kayit.bin"))){

            
            Kart[][] kartlar = (Kart[][])in.readObject();
            return kartlar;

        }catch(IOException e){
            System.out.println("Dosya acilirken sira olustu!");
        }catch(ClassNotFoundException e){
            System.out.println("Sinif bulunamadi!");
        }
        return null;
    }
}
