import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class mpuc {
    private static ArrayList<Integer> icerik = new ArrayList<Integer>();

    public static void dosyaOku(){
        try {
            FileInputStream fis = new FileInputStream("mars.mp3");
            int oku;

            while((oku = fis.read()) != -1){
                icerik.add(oku);
            }
        } catch(FileNotFoundException e){
            System.out.println("Dosya bulunamadi!");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void kopyala(String dosyaIsmi){
        try {
            FileOutputStream fos = new FileOutputStream(dosyaIsmi);

            for(int deger : icerik){
                fos.write(deger);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        //bir array list kullanip dosyanin tum icerigini ona aticaz.
        dosyaOku();
        long baslangic = System.currentTimeMillis();
        kopyala("mars2.mp3");
        long bitis = System.currentTimeMillis();
        System.out.println("Kopyalama islemi "+(bitis-baslangic) / 1000+" saniye aldi!");
    }
}
