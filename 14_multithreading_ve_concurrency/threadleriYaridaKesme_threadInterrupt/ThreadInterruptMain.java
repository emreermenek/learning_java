import java.util.LinkedList;
import java.util.List;

public class ThreadInterruptMain {
    public static void main(String[] args) {
        List<Integer> liste = new LinkedList<>();
        Thread thread = new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println("Thread calisiyor....");

                for(int i = 0; i < 10000000; i++){

                    if(Thread.currentThread().isInterrupted()){
                        System.out.println("Thread kesintiye ugradi");
                        return;
                    }
                    liste.add(i);
                }

                System.out.println("Thread kesintiye ugramadan islem bitti!");

                // for(int i = 1; i <= 10; i++){
                //     System.out.println("Thread yaziyor : " +  i);

                //     try {
                //         Thread.sleep(1000);
                //         System.out.println("Uykumun " + i + ". saniyesindeyim...");
                //     } catch (InterruptedException e) {
                //         //Interrupted Exception iki sekilde olusabilir ya bilgisayar kendi threadi yarida kesiyordur
                //         //ya da programci threadi belli bir sure interrupt etmek istiyor olabilir.
                //         //bir threadin calismasini bitirmez, sadece o threadi yarida keser, thread uyuyorsa uyandiriyor
                //         //bir yerde bekliyorsa onu uyandiriyor
                //         System.out.println("Uykum bolundu!");
                //     }
                // }


            }
        });

        thread.start();

        try {
            Thread.sleep(1000); //bu surede thread bitmezse kesilecek!
        } catch (InterruptedException e) {
            System.out.println("Uyku!");
        }
        thread.interrupt(); //burada 1 kere kesiyor sonra normal devam ediyor.
        //tamamen calismasini durdurmak istersek ne yapicaz: yukarida interrupt olursa fonksiyonu bitir dedik yeni for dongusunde
        // for(int x : liste){
        //     System.out.println(x);
        // }
    }  
}
