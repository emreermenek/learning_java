
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class fileoutputstream_dosyalara_veri_yazmak {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        //File file = new File("dosya.txt");

        try {
            // fos = new FileOutputStream("dosya.txt"); 
            //bu sekilde yapip ekstradan belirtmedigimiz surece her seferinde dosya silinir ve yeniden yazilir.
            //true eklersek bu sefer boyle bir dosya varsa sonuna ekle demis oluruz dosya yoksa olusturup yazar.
            fos = new FileOutputStream("dosya.txt",true); 

            //     fos.write(65); //sayiya karsilik gelen ASCII karakterini yazar.
            //     fos.write(67);
            

            //yukaridaki gibi yerine bir byte arrayi ile bir cok veriyi ayni anda yazabiliriz.

            // byte[] array = {101,75,102};

            // fos.write(array);

            String s = "Emre Ermenek";
            //yukaridaki stringi bir byte arrayine donusturup bunu yazabiliriz. String characters -> ASCII -> BYTE

            byte[] sArray = s.getBytes();
            fos.write(sArray);

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found Exception olustu!");
        } catch(IOException e){
            System.out.println("Dosyaya yazilirken bir hata olustu!");
        }
        finally{
            try {
                fos.close();
            } catch (IOException e) {
                System.out.println("Dosya kapatilirken bir hata olustu!");
            }
        }
    }
}
