import java.util.Scanner;

public class WaitNotify {
    
    /* 
     * tabi burada this kullandik ama this kullanirsak diger metodlarim da bloklanabilir 
     *  o yuzden this yerine lock olusturmak daha mantikli bu iki metod icin
     * bunu yapsaydik soyle olurdu
     * private Object lock = new Object(); diye bir lock tanimlardik
     * this anahtar kelimesini lock ile degistirirdik
     * wait() yerine lock.wait() yazardik
     * notify() yerine lock.notify() yazardik.
    */
    

    public void thread1Fonksiyonu(){
         //bu locku bu objenin uzerinde yapicaz demek bunun icin
         //this anahtar kelimesini kullaniriz ve tek bir anahtar var simdi
        synchronized (this) {
            System.out.println("Thread 1 calisiyor.....");
            System.out.println("Thread 1 Thread 2 nin kendisini uyandirmasini bekliyor...");

            try {
                //burada ben burada wait yapicam ve anahtari teslim edicem ve baska birisi beni uyandirana kadar
                //daha ileri gitmicem demis oluyoruz..
                //yani anahtari teslim etmek istiyoruz ve bu waitten asagidaki kisimlari
                //kesinlikle calistiramicak cunku direk baska threadin bu threadi uyandirmasini bekleyecek
                //eger uyandirmazsa yani notify yapmazsa bu thread burada sonsuza kadar bekleyecek demek.
                wait(); 
            } catch (InterruptedException e) {
                System.out.println("Wait bolundu!");
            }

            System.out.println("Thread 1 uyandi. Devam ediyor.");
        }
    }

    public void thread2Fonksiyonu(){
        Scanner sc = new Scanner(System.in);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("sleep bolundu!");
        }

        synchronized (this) {
            System.out.println("Thread 2 calisiyor....");

            System.out.println("Devam etmek icin bir tusa basin....");
            sc.nextLine();
            notify();
            System.out.println("uyandirdim abi, ben gidiyorum!");
        }
    }
}
