import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class thread_mpuckopyalama {
     private static ArrayList<Integer> icerik = new ArrayList<Integer>();

    public static void dosyaOku(){
        try {
            FileInputStream fis = new FileInputStream("mars.mp3");
            int oku;

            while((oku = fis.read()) != -1){
                icerik.add(oku);
            }
        } catch(FileNotFoundException e){
            System.out.println("Dosya bulunamadi!");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void kopyala(String dosyaIsmi){
        try {
            FileOutputStream fos = new FileOutputStream(dosyaIsmi);

            for(int deger : icerik){
                fos.write(deger);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        //bir array list kullanip dosyanin tum icerigini ona aticaz.
        dosyaOku();

        //Thread kullanarak 12 tane kopyalama:

        // Thread thread1 = new Thread(new Runnable(){
        //     @Override
        //     public void run() {
        //         kopyala("mars2.mp3");
        //     }
        // });
        // Thread thread2 = new Thread(new Runnable(){
        //     @Override
        //     public void run() {
        //         kopyala("mars3.mp3");
        //     }
        // });
        // Thread thread3 = new Thread(new Runnable(){
        //     @Override
        //     public void run() {
        //         kopyala("mars4.mp3");
        //     }
        // });
        // Thread thread4 = new Thread(new Runnable(){
        //     @Override
        //     public void run() {
        //         kopyala("mars5.mp3");
        //     }
        // });
        // Thread thread5 = new Thread(new Runnable(){
        //     @Override
        //     public void run() {
        //         kopyala("mars6.mp3");
        //     }
        // });
        // Thread thread6 = new Thread(new Runnable(){
        //     @Override
        //     public void run() {
        //         kopyala("mars7.mp3");
        //     }
        // });
        // Thread thread7 = new Thread(new Runnable(){
        //     @Override
        //     public void run() {
        //         kopyala("mars8.mp3");
        //     }
        // });
        // Thread thread8 = new Thread(new Runnable(){
        //     @Override
        //     public void run() {
        //         kopyala("mars9.mp3");
        //     }
        // });
        // Thread thread9 = new Thread(new Runnable(){
        //     @Override
        //     public void run() {
        //         kopyala("mars10.mp3");
        //     }
        // });
        // Thread thread10 = new Thread(new Runnable(){
        //     @Override
        //     public void run() {
        //         kopyala("mars11.mp3");
        //     }
        // });
        // Thread thread11= new Thread(new Runnable(){
        //     @Override
        //     public void run() {
        //         kopyala("mars12.mp3");
        //     }
        // });
        // Thread thread12 = new Thread(new Runnable(){
        //     @Override
        //     public void run() {
        //         kopyala("mars13.mp3");
        //     }
        // });
        // long baslangic = System.currentTimeMillis();
        // thread1.start();
        // thread2.start();
        // thread3.start();
        // thread4.start();
        // thread5.start();
        // thread6.start();
        // thread7.start();
        // thread8.start();
        // thread9.start();
        // thread10.start();
        // thread11.start();
        // thread12.start();

        // try {
        //     thread1.join();
        //     thread2.join();
        //     thread3.join();
        //     thread4.join();
        //     thread5.join();
        //     thread6.join();
        //     thread7.join();
        //     thread8.join();
        //     thread9.join();
        //     thread10.join();
        //     thread11.join();
        //     thread12.join();
        // } catch (InterruptedException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }
        // long bitis = System.currentTimeMillis();
        // System.out.println("Kopyalama islemi "+(bitis-baslangic) / 1000+" saniye aldi!");

        //thread kullanmadan 12 tane kopyalama: 

        long baslangic = System.currentTimeMillis();
        System.out.println(baslangic);
        // kopyala("mars2.mp3");
        // kopyala("mars3.mp3");
        // kopyala("mars4.mp3");
        // kopyala("mars5.mp3");
        // kopyala("mars6.mp3");
        // kopyala("mars7.mp3");
        // kopyala("mars8.mp3");
        // kopyala("mars9.mp3");
        // kopyala("mars10.mp3");
        // kopyala("mars11.mp3");
        // kopyala("mars12.mp3");
        // kopyala("mars13.mp3");
        long bitis = System.currentTimeMillis();
        System.out.println("Kopyalama islemi "+(bitis-baslangic) / 1000+" saniye aldi!");
    }
}
