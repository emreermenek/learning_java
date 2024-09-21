
import java.util.PriorityQueue;
import java.util.Queue;


public class mini_proje_priorityQueue_comparableInterface_acil_servis_uygulamasi {
    public static void main(String[] args) {
        /*
            Acil Servis Uygulamasi

            Hastalar Acil serviste sikayetlerine gore kuyrukta en one gececekler.(PriorityQueue)

            Apandisit -> En yuksek oncelik
            Yanik -> Orta Oncelik
            Bas Agrisi -> En dusuk oncelik

            
        */

        Queue<Hasta> acilServis = new PriorityQueue<>();

        acilServis.offer(new Hasta("Murat Bey", "Yanik"));
        acilServis.offer(new Hasta("Okan Bey", "Bas Agrisi"));
        acilServis.offer(new Hasta("Elif Hanim", "Apandisit"));
        acilServis.offer(new Hasta("Oguz Bey", "Yanik"));
        acilServis.offer(new Hasta("Merve Hanim", "Yanik"));
        acilServis.offer(new Hasta("Gizem Hanim", "Apandisit"));

        int i = 1;
        for(Hasta h : acilServis){
            
            System.out.println(i+". sirada: ");
            System.out.println(h);
            System.out.println("*****************************");
            i++;
        }
    }
}
