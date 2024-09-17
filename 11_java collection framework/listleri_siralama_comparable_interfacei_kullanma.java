
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class BuyuktenKucugeString implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        /*
            eger buyukten kucuge siralanacaksa, soldaki deger sagdaki degerden buyukse -1,
            kucukten buyuge ise +1,
            esitse 0.
        */

        return -o1.compareTo(o2); 
        /*
          compareTo o1, o2'den kucukse -1, buyukse +1 esitse 0 dondurur.
        */
    }
    
}

class KucuktenBuyugeSirala implements Comparator<Playerr>{

    @Override
    public int compare(Playerr o1, Playerr o2) {
        if(o1.getId() > o2.getId()){
            return 1;
        }else if(o1.getId() < o2.getId()){
            return -1;
        }
        return 0;
    }

}

class Playerr implements Comparable<Playerr>{
    private String isim;
    private int id;

    public Playerr(String isim, int id){
        this.isim = isim;
        this.id = id;
    }

    @Override
    public String toString() {
        return "| | | |  ID: " + id + ", isim: " + isim + "  | | | |";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((isim == null) ? 0 : isim.hashCode());
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Playerr other = (Playerr) obj;
        if (isim == null) {
            if (other.isim != null)
                return false;
        } else if (!isim.equals(other.isim))
            return false;
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public int compareTo(Playerr p) {
        //ister isme ister id ye gore karsilastirabiliriz.
        if(this.id < p.id){
            return -1; // - li herhangi bir deger de dondurebiliriz.
        }else if(this.id == p.id){
            return 0;
        }else{
            return 1; // pozitif herhangi bir deger dondurebilirz.
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    

}

public class listleri_siralama_comparable_interfacei_kullanma {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();

        arrayList.add("Z");
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("D");
        arrayList.add("C");

        // Collections.sort(arrayList);

        // for(String s : arrayList){
        //     System.out.println(s);
        // }

        List<Playerr> listPlayer = new ArrayList<>();

        listPlayer.add(new Playerr("Emre",1));
        listPlayer.add(new Playerr("Mert",8));
        listPlayer.add(new Playerr("Mehmet", 3));
        listPlayer.add(new Playerr("Cafer",15));

        // Collections.sort(listPlayer); Player classini sort edemedi. Cunku metod bulamadi.
        //suan Comparable interfaceini Player classina implemente edip compareTo metodunu da,
        //istegimiz uzerine id'nin karsilastirilmasi uzerine override sekilde yazarak.
        //Collection.sort() metoduna player gelince dogrudan id yi karsilastir dedik.
        

        Collections.sort(listPlayer);

        Playerr p1 = new Playerr("Erlik", 14);
        Playerr p2 = new Playerr("Jahrein",3);

        System.out.println(p1.compareTo(p2));

        // for(Playerr p : listPlayer){
        //     System.out.println(p.toString());
        // }

        // Collections.sort(arrayList, new BuyuktenKucugeString());
        // for(String s : arrayList){
        //     System.out.println(s);
        // }
        Collections.sort(listPlayer, new KucuktenBuyugeSirala());
        for(Playerr p : listPlayer){
            System.out.println(p);
        }
        //Collections.sort() metodunun yanina comparatoru inherit etmis bir class vererek ve
        //compareTo yu override etmemiz gerekir yoksa sadece kucukten buyuge dogru siralanirlar.
        //istedigimiz sekilde sort etmesini saglayabilirz.

        Collections.sort(listPlayer, new Comparator<Playerr>() {
            @Override
            public int compare(Playerr o1, Playerr o2) {
                return o1.getIsim().compareTo(o2.getIsim());
            }
        });
        System.out.println("******************************************");
        for(Playerr p : listPlayer){
            System.out.println(p);
        }
        

    
    }
}
