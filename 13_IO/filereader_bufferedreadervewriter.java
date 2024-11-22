import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class filereader_bufferedreadervewriter {
    public static void main(String[] args) {
        //dosyalarimiz .txt uzantısıysa dosyalarimizi filereader ya da buffered reader ile okummamiz daha efektif olur

        // try(Scanner sc = new Scanner(new FileReader("ogrenciler.txt"))){
            
        //     // while(sc.hasNextLine()){ //okucak baska satir kaldi mi
        //     //     System.out.println("Okunan satir: " + sc.nextLine());
        //     // }

        //     //sadece Yazilim muhendislerini almak istersek:

        //     while(sc.hasNextLine()){
        //         String ogrenci_bilgisi = sc.nextLine();
        //         String[] array = ogrenci_bilgisi.split(","); //0. index isim olacak, 1. index bolum olacak

        //         if(array[1].equals("Yazilim Muhendisligi")){
        //             System.out.println("Ogrenci Bilgisi: "+ogrenci_bilgisi);
        //         }
        //     }

            
        // } catch (IOException e) {
        //     System.out.println("Dosya acilirken bir hata olustu!");
        // }

        //buffered reader file reader ile ayni islemi yapar ama daha hizlidir.
        //cunku file reader karakter okur geri gelir. bu da uzun surer, buffered reader ise kume olusturur ve
        //\n gorene kadar butun karakterleri bu kumeye atar.

        // try(Scanner sc = new Scanner(new BufferedReader(new FileReader("ogrenciler.txt")))){
            
        //     // sadece Yazilim muhendislerini almak istersek:

        //     while(sc.hasNextLine()){
        //         String ogrenci_bilgisi = sc.nextLine();
        //         String[] array = ogrenci_bilgisi.split(","); //0. index isim olacak, 1. index bolum olacak

        //         if(array[1].equals("Yazilim Muhendisligi")){
        //             System.out.println("Ogrenci Bilgisi: "+ogrenci_bilgisi);
        //         }
        //     }
        // }catch(IOException e){
        //     System.out.println("Dosya acilirken bir hata oldu!");
        // }

        //simdi buffered writeri gorelim:

        try(BufferedWriter writer = new BufferedWriter(new FileWriter("ogrenciler.txt",true))){ //true cunku dosyanin devamina yazmak istiyoruz uzerine degil
            writer.write("\nAli Ozan,Insaat Muhendisligi");

        }catch(IOException e){
            System.out.println("Dosya acilirken bir sorun olustu.");
        }
    }
}
