import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class list_interface_arraylist_linkedlist_performans_karsilastirmasi {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        zamanHesapla("linkedList", linkedList);
        zamanHesapla("arrayList", arrayList);
        
    }

    public static void zamanHesapla(String veriTipi, List<Integer> list){
        //listin sonuna deger ekleme
        long baslangic;
        long bitis;

        baslangic = System.currentTimeMillis();
        for(int i = 0;i<100000;i++){
            list.add(0,i); //linkedlist avantajlidir. ciddi bir fark vardir.
            //ist.add(i); //arraylist avantajlidir. az bir fark vardir.
        }
        bitis = System.currentTimeMillis();

        System.out.println(veriTipi + " ekleme suresi " + (bitis-baslangic) +" ms");
    }
}
