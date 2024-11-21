
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class fileinputstream_dosyalardan_veri_almak {
    public static void main(String[] args) {
        FileInputStream fis = null;
        
        try {
            fis = new FileInputStream("dosya.txt");

            // System.out.println("Okunan karakter: "+(char)(fis.read())); //tek bir byte okur.
            // System.out.println("Ikinci karakter: "+(char)(fis.read())); //okucak byte kalmazsa -1 doner.

            //peki dosyanin herhangi bir yerinden veri okumak istersek ne yapariz:
            // fis.skip(6); //gecilecek karakter sayisini verdik.
            // System.out.println("okunan karakter: "+(char)(fis.read()));

            //peki butun dosyayi okumak istersek ne yapariz:
            // int deger;

            // String s = "";

            // while((deger = fis.read()) != -1){
            //     s += (char)(deger);
            // }
            // System.out.println("Dosya icerigi: "+s);

            //dosyanin belli bir yerinden sonra belli sayida karakter de asagidaki gibi okunabilir:
            int deger = 0;
            int say = 0;
            String s = "";
            fis.skip(5);
            while((deger = fis.read()) != -1){
                s += (char)(deger);
                say++;
                if(say == 10){
                    break;
                }
            }
            System.out.println("Dosyanin 5. yerinden itibaren 10 karakter: " + s);



        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadi!");
        } catch(IOException e){
            System.out.println("Dosya okunurken hata olustu!");
        }
         finally{
            try {
                if(fis!=null){
                    fis.close();
                }
            } catch (IOException e) {
                System.out.println("Dosya kapatilirken hata olustu!");
            }
        }
    }
}
