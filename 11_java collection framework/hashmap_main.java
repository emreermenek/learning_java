import java.util.HashMap;
import java.util.Map;

public class hashmap_main{
    public static void main(String[] args) {
        /*
        
            HashMap Sinifi:

            1. Degerleri Key(Anahtar) ve Value(Deger) olarak depolar. Her key'e karsilik
               gelen bir tane deger bulunur.
            2. Bir anahtar sadece bir kez varolabilir. Ancak bir deger birden fazla olabilir.
            3. Elementleri tipki HashSet gibi ekleme sirasina gore depolamaz. (HashSet gibi)

        */

        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(10, "Java");
        hashMap.put(30, "Python");
        hashMap.put(50, "Php");
        hashMap.put(20, "Php");
        hashMap.put(20, "Php"); //key ayni oldugu icin bisi degismez.

        hashMap.put(50, "Javascript"); //key ayni olup value farkliysa value yu degistirir.
        System.out.println(hashMap);
        System.out.println(hashMap.get(10));
        System.out.println(hashMap.get(1000)); //null gelir. hata vermez.

        for(Map.Entry<Integer, String> entry : hashMap.entrySet()){
            System.out.println("Anahtar : "+ entry.getKey() + ", degeri = "+ entry.getValue());
        } 
        
    }
}