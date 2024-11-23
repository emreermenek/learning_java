import java.util.ArrayList;
import java.util.Random;



public class ListWorker {
    
    Random random = new Random();
    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();

    // public void list1Olustur(){
    //     for(int i = 0; i < 2000; i++){
    //         list1.add(i);
    //         try {
    //             Thread.sleep(1);
    //         } catch (InterruptedException e) {
    //             System.out.println("Islem bolundu!");
    //         }
    //     }
    // }

    // public void list2Olustur(){
    //     for(int i = 0; i < 2000; i++){
    //         list2.add(i);
    //         try {
    //             Thread.sleep(1);
    //         } catch (InterruptedException e) {
    //             System.out.println("Islem bolundu!");
    //         }
    //     }
    // }

    // public void degerAta(){
    //     list1Olustur();
    //     list2Olustur();
    //     System.out.println("List1 : "+ list1.size() + " List2 : " + list2.size());
    // }

    //simdi yukaridaki islemin suresini yariya indiricez 2 thread kullanarak:

    // public synchronized  void list1Olustur(){
    //     try {
    //         Thread.sleep(1);
    //     } catch (InterruptedException e) {
    //         System.out.println("Islem kesildi!");
    //     }
    //     list1.add(random.nextInt(100));
    // }

    // public synchronized void list2Olustur(){
    //     try {
    //         Thread.sleep(1);
    //     } catch (InterruptedException e) {
    //         System.out.println("Islem kesildi!");
    //     }
    //     list2.add(random.nextInt(100));
    // }

    // public void degerAta(){
    //     //1000 kereyi 2 farkli threadden cagirarak sureyi yariya inidirp yine 2000lik listeyi olusturucaz
    //     for(int i = 0; i < 1000; i++){ 
    //         list1Olustur();
    //         list2Olustur();
    //     }
    // }

    // public void calistir(){
    //     Thread thread1 = new Thread(new Runnable(){
    //         @Override
    //         public void run() {
    //             degerAta();
    //         }
    //     });
    //     //yukaridaki kullanimin aynisini soyle de yazabiliriz thread1 le ayni isi yapar: (member reference)
    //     Thread thread2 = new Thread(this::degerAta);
    //     long baslangic = System.currentTimeMillis();
    //     thread1.start();
    //     thread2.start();

        
    //     try {
    //         thread1.join();
    //         thread2.join();
    //     } catch (InterruptedException ex) {
    //         System.out.println("Thread islemi bolundu!");
    //     }
    //     long bitis = System.currentTimeMillis();
    //     System.out.println("List1 size : " + list1.size() + " List2 size : "+ list2.size());
    //     System.out.println("Gecen sure: "+(bitis-baslangic));
    // }
    /*
     * normalde calisinca thread senkronizasyon konusunda bahsettigimiz sorun olustugundan
     * list1Olustur ve list2Olustur metodalarina synchronized anahtar kelimesi ekledik fakat
     * surenin cok uzadigini eklemeden once ve sonraya bakarsak gorebiliriz. Bunun sebebi
     * synchronized anahtar kelimesi ile obje icin bir anahtar uretilmesi ve thread1 in
     * list1Olustur ve list2Olustur'u birer kere kullandiktan sonra anahtari thread2'ye vermesi
     * sonrasinda thread2 nin aynisini yapmasi ve surecin boyle devam etmesi, yani iki threadin bu durumda
     * bir anlami kalmiyor, peki bunu nasil cozebiliriz?
    */

    /*
     * Cozum: icin 2 anahtara sahip olmamiz lazim thread1'in birinci anahtari kullanip list1Olusturu acmasi sonra
     * 1. anahtari thread2 ye verip 2. anahtari alip list2Olustur metodunua acmasi lazim bu sirayla devam ederek 
     * birbirlerini ekstra beklememis olurlar!
     * 
     * Bunu yapmak icin: 2 anahtar olusturucaz, synchronized metod yazmayacagiz sadece synchronized kod blogu yazacagiz.
    */

    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public  void list1Olustur(){
       synchronized (lock1) {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            System.out.println("Islem kesildi!");
        }
        list1.add(random.nextInt(100));
       }
    }

    public void list2Olustur(){
       synchronized (lock2) {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            System.out.println("Islem kesildi!");
        }
        list2.add(random.nextInt(100));
       }
    }

    public void degerAta(){
        //1000 kereyi 2 farkli threadden cagirarak sureyi yariya inidirp yine 2000lik listeyi olusturucaz
        for(int i = 0; i < 1000; i++){ 
            list1Olustur();
            list2Olustur();
        }
    }

    public void calistir(){
        Thread thread1 = new Thread(new Runnable(){
            @Override
            public void run() {
                degerAta();
            }
        });
        //yukaridaki kullanimin aynisini soyle de yazabiliriz thread1 le ayni isi yapar: (member reference)
        Thread thread2 = new Thread(this::degerAta);
        long baslangic = System.currentTimeMillis();
        thread1.start();
        thread2.start();

        
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException ex) {
            System.out.println("Thread islemi bolundu!");
        }
        long bitis = System.currentTimeMillis();
        System.out.println("List1 size : " + list1.size() + " List2 size : "+ list2.size());
        System.out.println("Gecen sure: "+(bitis-baslangic));
    }
}
