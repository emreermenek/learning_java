public class multitasking_ve_multithreading_nedir{
    /*
    ->Uyari ogrenmesi zor o yuzden dersteki kodlari degistirerek farkli ornekler yapmaya calismali..<-

        Java MultiTasking ve MultiThreading nedir?

        -> Gercek hayattaki multitasking gibi bir cok isi ayni anda yapmaktir, yemek yerken sohbet etmektir mesela.
        -> Bilgisayarlarimizda da multitasking sayesinde ayni anda bircok program calistirabiliriz.

        -> MultiTasking, bilgisayarin bircok process'i(islem) ayni anda calistirmasidir. Ornegin hem Web Browseri calistirirken
           ayni zamanda Spotifyi calistirmasi gibi.

        -> MultiThreading ise bir process icinde bir cok calisma unitesi olusturup(thread) bircok isi bir arada yapmaktir.
           Ornegin, wordde yazi yazarken ayni anda Word icinde yazdiklarimizin kontrol edilmesi buna birer ornektir.
        ----------------------------------
        Process ve Thread Kavramlari:

        Process:

        -> Process, bilgisayarda calisabilecek her turlu uygulamamizdir. Ornek: Spotify, Windows Media Player, Google Chrome

        -> Her process bellekte kendi memory space'ine(bellek alanina) sahiptir.

        -> Biz bir Java uygulamasini calistirdigimiz zaman bu uygulama JVM(Java Virtual Machine) uzerinde calisacak bir 
           process'e donusur.

        -> Java projeleri process'e donustukleri zaman kendi memory space'ini veya diger adiyla heap'ini olusturur. 
           Eger elimizde 2 tane calisir durumda uygulamamiz(process) varsa bu uygulamalar birbirlerinin bellek alanlarina
           (memory space) ya da heaplerine erisemezler.
        ********
        Thread: 

        -> Thread bir processin icinde bulunan bir calisma unitesidir ve her Java programi en az bir thread'e sahiptir.
           Eger biz hic thread olusturmazsak bile Java projeleri main metodunu calistirirken bir tane main thread olusturur.
           Bu main threadinin uanina kendimiz degisik islemler yaptirmak icin kendi threadlerimizi olusturabiliriz.

        -> Threadler processlerin icinde olustugu icin processlerin olusturdugu bellek alanina direk olarak erisim saglayabilirler.
           
        -> Ayrica bellek alanindan ayri olarak her threadin sadece kendinin erisebilecegi bir tane thread stack'i bulunur.
        ----------------------------------
        MultiThreading'e Neden Ihtiyac Duyuyoruz?

        -> Ornegin elinizde internetten bir dosya indirme gibi uzun zaman alacak bir is var ve bu islemden sonra yapacaginiz daha
           bir cok is bulunuyor. Eger biz bu islemi multithreading kullanmayip sadece uygulamayi main thread ile yazarsak, 
           main thread(main metodu) bu islem bitene kadar baska herhangi bir islem gerceklestiremeyecek. Ancak eger siz dosya
           indirme islemini bir tane thread olusturup yaparsaniz, main thread diger islerine zaman ayirabilir. Yani bizim 
           uygulamamiz bir cok islemi paralel yapacak seviyeye gelmis olur.

        -> Bunun gibi biz daha bir cok islemimizi threadler yardimiyla paralel yapabiliriz ve biz threadlerin paralel calismasina
           concurrency(eszamanlilik) diyoruz.
        --------------------------------
        Threadlerin Calismasi:

        -> Biz programlarimizda bir cok thread olusturudugumuzda Java Virtual Machine ve Isletim Sistemi bu threadlerin ne
           zaman calisacagini ve ne zaman baslayacagini kendisi belirler. Ayrica threadlerin calisma sirasi ve baslatilma
           sirasi farkli olabilecegi icin programlarimizda ortaya cikan ciktilar farklilik gosterebilir.

           Ornek: 
           thread1.start();
           thread2.start();
           thread3.start();
           -> Buradaki threadlerin islemlerine ne zaman baslayacagi JVM'e ve Isletim Sistemine baglidir.

     */
}