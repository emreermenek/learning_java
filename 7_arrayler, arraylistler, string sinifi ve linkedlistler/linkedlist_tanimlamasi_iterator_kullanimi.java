
import java.util.LinkedList;
import java.util.ListIterator;

public class linkedlist_tanimlamasi_iterator_kullanimi {

    public static void yazdir(LinkedList<String> gidilecekYerler){
        //bu sekilde yazdirabilirz ve java arka planda gerekli islemleri yapar, 
        for(String i : gidilecekYerler){
            System.out.println(i);
        }
        //ancak daha karmasik islemler icin Iterator kullanmamiz gerekir.
        ListIterator<String> iterator = gidilecekYerler.listIterator();  
        while(iterator.hasNext()){ //iterator'un gosterdigi obje varsa true doner.
            iterator.next();
        }
    }

    public static void siraliEkle(LinkedList<String> gidilecekYerler, String yeni){
        ListIterator<String> iterator = gidilecekYerler.listIterator();  
        while(iterator.hasNext()){
            int kontrol = iterator.next().compareTo(yeni);
            if(kontrol==0){
                System.out.println("Listenizde bu eleman yok!");
                return; // fonksiyonu sonlandirmak icin yazdik.
            }else if(kontrol<0){
                //yeni deger bir sonrakinden daha buyuk 
            }else if(kontrol>0){
                iterator.previous();
                iterator.add(yeni);
                return;
            }
        }
        iterator.add(yeni);
    }
    public static void main(String[] args) {
        //linked list objeleri birbirine baglayarak calisir, 
        //her obje bir referansta tutar, 
        //her objen gosterdigi objeye ve kendisini gosteren objeye referans eder,
        //basitce:
        LinkedList<String> gidilecekYerler = new LinkedList<>();
        // gidilecekYerler.add("Postane");
        // gidilecekYerler.add("Market");
        // gidilecekYerler.add("Okul");
        // gidilecekYerler.add("Spor Salonu");
        // gidilecekYerler.add("Kutuphane");
        // gidilecekYerler.add("Ev");
        // //Postane -> Market -> Okul -> Spor Salonu -> Kutuphane -> Ev
        // //Postane <- Market <- Okul <- Spor Salonu <- Kutuphane <- Ev
        // //Yukarda gosterilen sekilde her obje eklenen sirayla birbirinin referansini cift yonlu tutar!
        // yazdir(gidilecekYerler);
        // System.out.println("-----------------------------------");
        // gidilecekYerler.add(4,"Alisveris Merkezi");
        // yazdir(gidilecekYerler);
        // System.out.println("-----------------------------------");
        // gidilecekYerler.remove(4);
        // gidilecekYerler.add("Alisveris Merkezi");
        // yazdir(gidilecekYerler);

        siraliEkle(gidilecekYerler, "Postane");
        siraliEkle(gidilecekYerler, "Market");
        siraliEkle(gidilecekYerler, "Ev");
        yazdir(gidilecekYerler);

    }
}
