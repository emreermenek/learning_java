import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutureMain {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(1);
        //bir tane threade bir tane task atamamiz lazim

        // executor.submit(new Runnable(){
        //     @Override
        //     public void run() {
        //         Random random = new Random();
        //        System.out.println("Thread calisiyor.....");
        //        int sure = random.nextInt(1000) + 2000;
        //        try {
        //         Thread.sleep(sure);
        //     } catch (InterruptedException e) {
        //         // TODO Auto-generated catch block
        //         e.printStackTrace();
        //     }
        //     System.out.println("Thread cikiyor......");
        //     }});

         //herhangi bir deger dondurebilmek icin Runnable Interfacei yerince callable interfacei dondurmemiz gerekicek:

        Future<Integer> future = executor.submit(new Callable<Integer>(){
            //futurein turden bagimsiz kullanilmasini istiyorsak su sekilde de yazabiliriz
            //Future<?> bu da sorunsuz calisir.
            @Override
            public Integer call() throws Exception {
                 Random random = new Random();
               System.out.println("Thread calisiyor.....");
               int sure = random.nextInt(1000) + 2000;

            //    if(sure > 2500){
            //         throw new IOException("Thread cok uzun sure uyudu!"); //keyfi hata firlattik
            //         //bu hata olunca ne olacak future.get()'te exception vericek.
            //    }
               try {
                Thread.sleep(sure);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("Thread cikiyor......");
            return sure;
        }
        });
        executor.shutdown();

        try {
            System.out.println("Donen deger : " + future.get());
        } catch (InterruptedException | ExecutionException e) {
            System.out.println(e);
        }
    }
}
