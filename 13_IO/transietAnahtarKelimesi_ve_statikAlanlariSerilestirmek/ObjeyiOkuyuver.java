
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ObjeyiOkuyuver {
    public static void main(String[] args) {
        
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("ogrenciler.bin"))){
          
            //objeler yazilirken objenin hangi classtan yazildigi ve hangi ozellikleri tasidigi direk
            //yazildigi icin bu readObject buna gore veriyi okur..
            Ogrenci[] ogrenciArray = (Ogrenci[])in.readObject();
            ArrayList<Ogrenci> ogrenciList = (ArrayList<Ogrenci>)in.readObject();
            for(Ogrenci o : ogrenciArray){
                System.out.println(o);
                System.out.println("----------------------------------------");
            }
            System.out.println("******************************");
            for(Ogrenci o : ogrenciList){
                System.out.println(o);
                System.out.println("----------------------------------------");
            }
            System.out.println("******************************");
            System.out.println("Ogrenci sayisi: "+ Ogrenci.getOgrenciSayisi()); //0 yazar cunku static alanlar serilestirilmez..

        }catch(IOException e){
            System.out.println("Dosya acilirken sorun olustu!");
        }catch(ClassNotFoundException e){
            System.out.println("Boyle bir obje bulunamadi!");
        }
    }
}
