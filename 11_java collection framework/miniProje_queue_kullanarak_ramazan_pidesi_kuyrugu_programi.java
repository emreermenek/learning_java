import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class miniProje_queue_kullanarak_ramazan_pidesi_kuyrugu_programi {
    public static void main(String[] args) {
        // Ramazan Pidesi Uygulamasi

        // Firindan 1(dahil) ile 10(dahil) arasi pide cikacak. Kuyruktakiler Pideyi almayaca calisacak.

        /*
            pideKuyrugu.offer("Murat");
            pideKuyrugu.offer("Hasan");
            pideKuyrugu.offer("Okan");
            pideKuyrugu.offer("Ayse");
            pideKuyrugu.offer("Merve");
            pideKuyrugu.offer("Ezgi");
            pideKuyrugu.offer("Gizem");
            pideKuyrugu.offer("Mehmet");
            pideKuyrugu.offer("Oguz");
            pideKuyrugu.offer("Azer");
        */

        Random random = new Random();

        Queue<String> pideKuyrugu = new LinkedList<>();

        pideKuyrugu.offer("Murat");
        pideKuyrugu.offer("Hasan");
        pideKuyrugu.offer("Okan");
        pideKuyrugu.offer("Ayse");
        pideKuyrugu.offer("Merve");
        pideKuyrugu.offer("Ezgi");
        pideKuyrugu.offer("Gizem");
        pideKuyrugu.offer("Mehmet");
        pideKuyrugu.offer("Oguz");
        pideKuyrugu.offer("Azer");

        int pideSayisi = random.nextInt(10)+1;
        System.out.println("Cikan pide sayisi: " + pideSayisi);
        System.out.println("********************"); 

        for(int i = 1; i<= pideSayisi;i++){
            System.out.println(pideKuyrugu.poll() + " adli kisiye pide veriliyor");
        }

        System.out.println("\t  ***********");
        System.out.println("\t  Pide bitti!");
        System.out.println("\t  ***********");
    

        while(!pideKuyrugu.isEmpty()){
            System.out.print(pideKuyrugu.poll());
            if(!pideKuyrugu.isEmpty()){
                System.out.print(", ");
            }else{
                System.out.println(" pide alamadi");
            }
        }






    }
}
