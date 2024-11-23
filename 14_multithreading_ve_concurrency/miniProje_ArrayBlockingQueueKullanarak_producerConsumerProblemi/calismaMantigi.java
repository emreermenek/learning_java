public class calismaMantigi{
    /* 
     * producer deger uretecek consumer da bu uretilen degeri alicak
     * producer: 10 uretti 20 uretti 30 uretti
     * |-----------------
     * | 10 | 20 | 30
     * |----------------
     * consumer 10 u alacak sonra 20 yi sonra 30 u
    * |-----------------
     * | 20 | 30
     * |----------------
     * o sirada da producer uretmeye devam edecek bu 
     * bu queumuzun 10 boyutu olacak
     * queuenin doldugu zaman producerin beklemesi gerekir
     * queue bosaldigi zaman ise consumerin beklemesi gerekir.
     * ArrayBlockingQueue kullanicaz bir boyur verir bu queue ya
     * put ve take metodlarini kullanicaz
     * put ile queuenin en sonuna bir deger ekliyoruz demektir.
     * take'i kullandigimiz zaman ise queue'nin en basindan deger aliriz demektir
     * bu ArrayBlockingQueue'lar threadSafe queue yapisidir.
    */
}