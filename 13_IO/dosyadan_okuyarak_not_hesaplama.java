import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class dosyadan_okuyarak_not_hesaplama {

    public static String harfNotuHesapla(String isim, int vize1, int vize2, int finalNotu){

        String cikti = "";

        double not = vize1 * 3 / 10.0 + vize2 * 3 / 10.0 + finalNotu * 4 / 10.0;

        if(not>=90){
            cikti = isim + " bu dersten AA aldi.";
        }else if(not>=85){
            cikti = isim + " bu dersten BA aldi.";
        }else if(not >=80){
            cikti = isim + " bu dersten BB aldi.";
        }else if(not >= 75){
            cikti = isim + " bu dersten CB aldi.";
        }else if(not >= 70){
            cikti = isim + " bu dersten CC aldi.";
        }else if(not >= 65){
            cikti = isim + " bu dersten DC aldi.";
        }else if(not >= 60){
            cikti = isim + " bu dersten DD aldi";
        }else if(not >= 55){
            cikti = isim + " bu dersten FD aldi.";
        }else{
            cikti = isim + " bu dersten FF aldi.";
        }

        return cikti;

    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(new FileReader("dosya.txt"));
            FileWriter writer = new FileWriter("harfnotu.txt",true);){

                while(sc.hasNextLine()){
                    String ogrenciBilgileri = sc.nextLine();
                    String[] array = ogrenciBilgileri.split(",");
                    writer.write(harfNotuHesapla(array[0], Integer.parseInt(array[1]), Integer.parseInt(array[2]), Integer.parseInt(array[3]))+"\n");

                }

                
        }catch(IOException e){
            System.out.println("Dosya acilirken bir sorun olustu!");
        }
    }   
}
