import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadlockOrnegi {
    private Hesap hesap1 = new Hesap();
    private Hesap hesap2 = new Hesap(); 
    private Random random = new Random();

    //iki lockumuz var cunku bizim 100 tane hesabimiz olsa bu sefer o kadar lockumuz olmasi gerekirdi
    //proje buyuk olsa her hesap icin kullanmak gerekecekti bu ornekte gerekmiyor diye dusunmemeliyiz.
    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();

    //Eger cok fazla lockumuz olursa locklarin yeri karisabilir bu da deadlock sorununa sebep olabilir

    public void locklariKontrolEt(Lock a, Lock b){

        boolean aEldeEdildi = false;
        boolean bEldeEdildi = false;

        //a elde edilip b elde edilmediyse a yi da birakmamiz gerekir.
        //hangi threadin bunu birakacagini isletim sistemi kendi belirleyecek:

        while (true) { 
            //sadece eger ikisini de elde edersem cikicam
            aEldeEdildi = a.tryLock(); //lock musaitse alabilirsin 
            bEldeEdildi = b.tryLock();

            if(aEldeEdildi == true && bEldeEdildi == true){
                return; // metod sonlandir
            }
            if(aEldeEdildi == true){
                //bir threadin fedakarlik yapip bunu birakmasi gerekir.
                a.unlock();
            }
            if(bEldeEdildi == true){
                b.unlock();
            }
        } 
    }

    public void thread1Fonksiyonu(){
        // lock1.lock();
        // lock2.lock();
        locklariKontrolEt(lock1, lock2);
        for(int i = 0; i<5000;i++){
            Hesap.paraTransferi(hesap1, hesap2, random.nextInt(100));
        }
        lock1.unlock();
        lock2.unlock();
    }

    public void thread2Fonksiyonu(){
        // lock2.lock();
        // lock1.lock(); 
        //ters sirayla yazarsak yukaridaki gibi deadlock olabilir
        // lock1.lock();
        // lock2.lock();
        //bu sorunu cozmek icin reentrent lock icindeki trylock metodunu kullanicaz:
        //locklardan ikisini aldıysa bir thread devam etmesini soyleyebiliriz, birinia aldisya digerini 
        // birakmasini soyleyebiliriz
        locklariKontrolEt(lock1, lock2);
        for(int i = 0; i<5000;i++){
            Hesap.paraTransferi(hesap2, hesap1, random.nextInt(100));
        }
        // lock2.unlock();
        // lock1.unlock();
        //ters sirayla yazarsak yukaridaki gibi deadlock olabilir
        lock1.unlock();
        lock2.unlock();
    }

    public void threadOver(){
        System.out.println("Hesap1 Bakiye : "+ hesap1.getBakiye() + " Hesap2 Bakiye : "+ hesap2.getBakiye());
        System.out.println("Toplam Bakiye : " + (hesap1.getBakiye() + hesap2.getBakiye()));
    }

}
