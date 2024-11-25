import java.util.concurrent.Semaphore;

class SemaphoreOrnegi{
    //Daha onceki synchoronize kod bloklari ve reentrant lock orneklerinde sadece tek bir threadin 
    //oraya girmesine izin veriyorduk ancak semaphore kullanarak birden cok threadin bir yere girmesini ,
    //saglayabiliriz. Ayni anda 1, 2, 3 , 5 threadi ayni anda calistirabiliriz veya baska threadlerimiz varsa
    //bunlari buradan engelleyebiliriz.

    private Semaphore sem = new Semaphore(3); //ayni anda kac threade izin verilir onu yazicaz
    //mesela 1 yazarsak snychronize kod blogu gibi calisir.

    public void threadFonksiyonu(int id){

        try {
            sem.acquire(); //bu degerimiz 0 sa ben alt tarafa giremeyecegim eger 0 dan buyukse buraya gecebilcem demek.
            //eger asagğiya gecebilirse de semaphore icindeki degerimiz 1 azalir.
            //boylece semaphorein icindeki deger kadar threadin calismasini saglariz.
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 

        System.out.println("Thread basliyor... ID : " + id);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("Thread cikiyor.... ID : " + id);
        sem.release(); //semaphoreun degere 0 sa bunu 1 arttirir baska threadler girebilsin diye izin verir.

    }

}