import java.io.FileWriter;
import java.io.IOException;

public class filewriter_dosyayaveriyazma {
    public static void main(String[] args) {
       FileWriter writer = null;  //eger dosya acma islemini burada yaparsak finally icinde fw i kullanamazdik..

       //file writer ile dosyaya byte ile yazmamiz gerekmez, direk string olarakta yazabiliriz.

       try {
            writer = new FileWriter("dosya.txt",true); //true dosya varsa olanin uzerine yazar.

            writer.write("Emre Ermenek\n"); //\n ile dosyanin alt satirina gecilir
            //eger yapmasaydik dosyalar direk sonundan devam ederdi.
            writer.write("CivvvCivvv");
        } catch (IOException e) {
            System.out.println("Dosya acilirken IOException olustu..");
       }finally{
            if(writer != null){
                try {
                    writer.close();
                } catch (IOException e) {
                    System.out.println("Dosya kapatilirken bir hata olustu!");
                }
            }
       }
    }
}
