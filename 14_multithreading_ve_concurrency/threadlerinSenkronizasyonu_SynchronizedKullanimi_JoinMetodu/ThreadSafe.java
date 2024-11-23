
public class ThreadSafe {
    
    private int count = 0;

    public synchronized void arttir(){ 
        //belli bir thread buraya ulastiginda benim isim bitene kadar baska hicbir thread
        //buraya giremesin diyecegiz bunu synchronized ile yapmis olduk.
        //burada anahtar kilit mantigi vardir, ilk gelen thread anahtari alir ve isi bitene kadar
        //bu anahtari baska threade vermez.
        count++;
    }

    public void threadleriCalistir(){
        // Thread thread1 = new Thread(new Runnable(){
        //     @Override
        //     public void run() {
        //         for(int i = 0; i < 5000; i++){
        //             count++;
        //         }
        //     }
        // });

        // Thread thread2 = new Thread(new Runnable(){
        //     @Override
        //     public void run() {
        //         for(int i = 0; i < 5000; i++){
        //             count++;
        //         }
        //     }
        // });

        // thread1.start();
        // thread2.start();

        // System.out.println("Count degiskeninin degeri: "+ count); 
        // //normalde threadlerimiz bitmeden calistigi icin 0 degeri doner, beklesin istersek: 

        // thread1.start();
        // thread2.start();

        // try {
        //     thread1.join();
        //     thread2.join();
        // } catch (InterruptedException e) {
        //     System.out.println("Threadlerin calismasi bolundu!");
        // }
        // System.out.println("Count degiskeninin degeri: "+ count); 
        //fakat simdi de her zaman 10000 degerini goremeyecegiz bazen farkli rakamlar gelicek
        //bu sorun threadlerdeki senkron sorunundan kaynaklanir,bir thread bellekteki degeri degistiremeden diger thread
        //islem yapabilir bu da bazi arttirma islemlerinin yapilamamasiyla sonuclanir..
        //bunu engellememiz icin bizim thread1 in islemi bitene kadar thread2 count'a dokunamaz seklinde
        //belirtme yapmamiz gerekir:




        Thread thread1 = new Thread(new Runnable(){
            @Override
            public void run() {
                for(int i = 0; i < 5000; i++){
                    arttir();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable(){
            @Override
            public void run() {
                for(int i = 0; i < 5000; i++){
                    arttir();
                }
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Threadlerin calismasi bolundu!");
        }
        System.out.println("Count degiskeninin degeri: "+ count); 

        
    }

    public static void main(String[] args) {
        ThreadSafe threadSafe = new ThreadSafe(); //main metodunda kendi classindan obje yaratilabilir

        threadSafe.threadleriCalistir();
    }
}
