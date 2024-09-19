
import java.util.PriorityQueue;
import java.util.Queue;

class Playerrr implements Comparable<Playerrr>{
    private String isim;
    private int id;

    public Playerrr(String isim, int id){
        this.isim = isim;
        this.id = id;
    }

    @Override
    public int compareTo(Playerrr o) {
        if(o.id > this.id){
            return -1;
        }else if(o.id > this.id){
            return 1;
        }
        return 0;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}

public class queueInterface_priorityQueue {
    public static void main(String[] args) {
        /*

            Queue Interface ve PriorityQueue Sinifi:

            PriorityQueue normal Queue mantigi gibi davranmaz. 
            Elemanlar oncelik siralarina gore yuksek oncelik kazanip,
            -> Integerlarda en yuksek oncelik en kucuk sayida, en dusuk oncelik en buyuk sayidadir.
               Stringlerde en yuksek oncelik alfabetik olarak sozlukte en once gelen stringte,
               en dusuk oncelik alfabetik olarak sozlukte en son gelen stringtedir.
            
            Kuyrukta onlere gecer (Tipki hastanadeki acil servisler gibi)

            -> add() veya offer() metodlari: Kuyruga eleman ekler. (Onceden gordugumuz ozellikleri tasirlar.)
            -> clear() metodu: Kuyrugu temizler.
            -> contains(Objects o): o objesi kuyrugun icindeyse true, degilse false doner.
            -> peek(): Kuyrugun basindaki elemani cikartir ve deger olarak doner. Eger kuyruk bossa null referans doner.
            -> pol(): Kuyrugun basindaki elemani cikartir ve deger olarak doner. Eger kuyruk bossa null referans doner.
            -> size(): Kuyrugun icindeki eleman sayisini doner.

            sirasiyla 2-1-5-4 eklersek:
             ------------------
            | 2 | 
            ------------------
            2'yi siler 1 i yazar, sonra 2 yi tekrar ekler.
             ------------------
            | 1 | 2 |
            ------------------
            2'den buyuk oldugu icin 5'i dogrudan ekler.
             ------------------
            | 1 | 2 | 5 |
            ------------------
             5'i siler 4 u yazar, sonra 5 i tekrar ekler.
             ------------------
            | 1 | 2 | 4 | 5 |
            ------------------

        */

     

        // Queue<Integer> queue = new PriorityQueue<>();

        // queue.offer(5);
        // queue.offer(1);
        // queue.offer(2);
        // queue.offer(100);

        // System.out.println(queue.peek());
        // System.out.println(queue.contains(5));
        // System.out.println(queue.contains(1));
        // // queue.clear();

        // while(!queue.isEmpty()){
        //     System.out.println("Eleman cikartiliyor: " + queue.poll());
        // }

        // // for(Integer i : queue){
        // //     System.out.println(i);
        // // }

        Queue<Playerrr> queue = new PriorityQueue<>();

        queue.offer(new Playerrr("Emre", 5));
        queue.offer(new Playerrr("Mehmet", 1));
        queue.offer(new Playerrr("Mert", 100));

        while(!queue.isEmpty()){
            System.out.println("Eleman cikartiliyor: " + queue.poll().getId());
        }

        
    }
}
