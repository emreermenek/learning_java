import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class trywithresource_javayedi {
    //java 7 ile gelen try with resource kullanimi:
    //bu sayede dosya otamatik olarak kapanicak, finally kullanmamiz gerekmeyecek.
    //kalabalik try catch karmasindan da kurtulucaz.

    public static void main(String[] args) {
        //try with resources closable interfaceini implemente eden butun classlar icin calisir.
        //icine bir veya birden cok deger yazilabilir.

        // try(FileWriter writer = new FileWriter("dosya.txt");
        //     FileWriter writer2 = new FileWriter("dosya2.txt")){

        //     writer.write("deneme");

        // }catch(IOException e){
        //     System.out.println("Dosya olusturulurken IOException olustu!");
        // }


        try(FileWriter writer = new FileWriter("diller.txt")){
            Scanner sc = new Scanner(System.in);
            String dil;

            while (true) { 
                System.out.print("Bir dil giriniz: ");
                dil = sc.nextLine();
                if(dil.equals("-1")){
                    System.out.println("Programdan cikiliyor, dosyayi kontrol ediniz.");
                    break;
                }
                writer.write(dil+"\n");
            }
        }catch(IOException e){

        }
        
    }
}
