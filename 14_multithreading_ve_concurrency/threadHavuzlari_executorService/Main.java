
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


/* 
 * Daha once yaptigimiz orneklerde bir tane mainden 2 tane de bizim olusturdugumuz maks 3 thread bulunuyordu
 * ancak buyuk java projelerinde 100'lerce thread bulunabilir ve bu threadlerin kontrolunu saglamak angarya olabilir.
 * hepsinin ayni anda calismasi sistemi yorabilir ve bellek hacmini arttirir.
 * Boyle durumlarda sadece 2 thread ayni calissin 3 tane vya 10 tane ayni anda calissin diyebiliyoruz..
 * Bunlarin kontrolunu de kendimiz yapmak yerine Executor Service diye bir service'e verebiliyoruz.
 * bu sayede hem kod sayimiz azalir hem de uzerimizdeki yuk azalir.
*/

public class Main {
    public static void main(String[] args) {
        // Thread t1 = new Thread(new Worker("1",1));
        // Thread t2 = new Thread(new Worker("2",2));
        // Thread t3 = new Thread(new Worker("3",3));
        // Thread t4 = new Thread(new Worker("4",4));
        // Thread t5 = new Thread(new Worker("5",5));
        
        // //ilk t1 le t2 calissin, sonra t3 t4 sonra t5 calissin istiyoruz:
        // System.out.println("Butun isler teslim edildi");
        // t1.start();
        // t2.start();
    
        // try {
        //     t1.join();
        //     t2.join();
        // } catch (InterruptedException e) {
        //     System.out.println("Thread bolundu!");
        // }

        // t3.start();
        // t4.start();
    
        // try {
        //     t3.join();
        //     t4.join();
        // } catch (InterruptedException e) {
        //     System.out.println("Thread bolundu!");
        // }

        // t5.start();
        // try {
        //     t5.join();
        // } catch (InterruptedException e) {
        //     System.out.println("Thread bolundu!");
        // }
        // System.out.println("Butun isler bitti!");


        //simdi bir thread havuzu olusturup buna gore executor service olusturup islemleri executor service uzerinden yapacagiz.

        //bu executor'a maks 2 thread aynia nda calissin dedik ve bunu executor referansi uzerinden kontrol edebiliriz.
        ExecutorService executor = Executors.newFixedThreadPool(2); 

        for(int i = 1; i<=5;i++){
            executor.submit(new Worker(String.valueOf(i),i));
        }

        executor.shutdown(); //baska hicbir is atamasi yapmayacagim threadlerin isi bitince kapat executori
        //belki 1-2 gun suren bir is threade vermis olabilirim fakat threadin belli bir sure sonra kapanmasini
        //istiyorsam bir tane daha method kullanmam gerekir:

        try {
            executor.awaitTermination(1, TimeUnit.DAYS);//en fazla bir gun beklerim demek
        } catch (InterruptedException e) {
            System.out.println("Surec erken kesildi!");
        } 
    }
}
