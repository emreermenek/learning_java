//bunlar synchronized locklara alternatif gelistirilmislerdir.
//bunu asil kullanma amacimiz deadlocklari cozmektir... o baska dersin konusu

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockOrnegi {
    private int say = 0; //Bunu 20 bin e esitlemek istiyorum yani 10 bin thread1 10 bin thread2 arttiricak.
    private Lock lock = new ReentrantLock();
    //bunda da synchronized daki gibi wait ve notifyin benzeri vardir ama bunun icin bir condition eklememiz gerekir:
    private Condition condition = lock.newCondition();
    //artik lock.lock() ve lock.unlock() arasinda bu threadlerimizi istedigimiz zaman bekletebiliriz.

    public void arttir(){
        for(int i = 0; i<10000;i++){
            say++;
        }
    }

    public void thread1Fonksiyonu(){

        lock.lock(); //artik bu anahtari kitlemis oluyoruz 
        // arttir(); //burada herhangi bir exception oldugunda bizim mutlaka lock.unlock() yapmamiz gerekir
        // //o sebeple soyle yazmaliyiz try finally icine yazmaliyiz lock.unlock() u..
        // lock.unlock(); //bu anahtarimizi artik teslim ederiz.
       
        try {
            System.out.println("Thread 1 uyandirilmnayi bekliyor");
            condition.await();
            System.out.println("Thread 1 uyandirildi ve islemine devam ediyor!");
            arttir();
        }catch(InterruptedException e){
            System.out.println("Bekleme bozuldu!");
        }finally {
            lock.unlock();
        }
    }

    public void thread2Fonksiyonu(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Bekleme bozuldu!");
        }
        Scanner sc = new Scanner(System.in);
        
        lock.lock();

        
        try {
            System.out.println("Thread 2 calisiyor...");
            arttir();
            System.out.println("Say degiskenin degeri: " + say);
            System.out.print("Devam etmek icin bir tusa basin...");
            sc.nextLine();
            condition.signal();
        } finally {
            lock.unlock();
        }
    }

    public void threadOver(){
        System.out.println("Say degiskenin degeri : "+ say);
    }
}
