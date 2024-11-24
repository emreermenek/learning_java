public class deadlock_nedir{
    /*
     * Deadlockta bircok thread birbirini bekliyor ve hicbir yere ilerleyemiyor.
     * Bircok thread belirli bir locku aliyor fakat diger locklar kapildigi icin deadlock olayi olusuyor.
     * Mesela kavsakta arabalar sikisirsa birbirlerinin geri cikmasi lazim ki sikisan araba devam edebilsin
     * Bircok araba birbirini bekleyip kimsenin bir yere gidememesi gibi
     * Threadlerde nasil olusur?
     * Thread 1 ve Thread 2 miz var bi de lock 1 ve lock 2 var ve threadlerimizin islemlerini gerceklestirebilmeleri icin
     * bu iki anahtara ayni anda sahip olmalari gerekiyor. Ancak oyle bir durum olabilir ki, eger thread 1 birinci anahtari aliyorsa
     * ve thread 2 de de ikinci anahtarimiz varsa, bunlar birbirlerini bekledikleri icin, deadlock olusur.
     * Neden sorunlu bir konu?
     * deadlock her zaman olusmaz cunku threadlerin calismasi islemci ve JVM'e bagli oldugu icin kimi zaman sorunlu durum olsmaz
     * kimi zaman da olusur. Mesela 100 defa calisinca 1 defa olabilir.
    */
}