public class collection_framework_ozet {
    public static void main(String[] args) {
        /*
            List Interface'i Implement'e Eden Classlar

            Elementleri liste halinde depolar.
            Bir element birden fazla bulunabilir.
            Elementler indeks ile tutulur.
            Elementler ekleme sirasini korur.
            Bir elemani aramak cok yavastir.
            Bir eleman'a indeks degeri ile ulasmak hizlidir.
            Listeler Collections.sort() metoduyla siralanabilir.

            Thread Islemlerinde Kullanılabilecek Veri Yapisi

            Vectorler ---> Cunku bazi metodlari "synchronized" anahtar kelimesiyle yazilmistir.

            Elemani Sadece Sona Ekledigimiz Durumlarda

            ArrayList ---> Cunku sadece sona eklemek arraylistlerde daha hizlidir.

            Elemani Ortalara Ekleyecegimiz Durumlar Varsa

            LinkedList ---> Cunku sadece o bolgenin referanslari uzerinde islem yapilir.
            ---------------------------------------------------------------------------------

            Set Interface'ini Implemente Eden Classlar

            Bir elemani sadece bir defa depolar.
            Bir elemanin sadece bir defa depolanmasini istiyorsak Listler(ArrayList, LinkedList vs. ) yerine kullanilabilir.
            Elemanlar listler gibi indekslenmezler.
            Bir elemani setlerde olup olmadigini sorgulama listlere gore oldukca hizlidir.

            Elemanlarin Sirasi Onemli Degilse ve Sorgulama İslemlerinin Hizli Olmasi Isteniyorsa

            HashSet ---> Elemanlari ekleme sirasina gore depolamaz ve bir elemanin olup olmadigini sorgulama 
                         hash fonksiyonuyla yapildigi icin her zaman hizli ve sabit kalmaya calisir.
            
            Elemanlarin Ekleme Sirasi Onemliyse ve Sorgulama Islemlerinin Hizli Olmasi Isteniyorsa

            LinkedHashSet ---> LinkedList ve HashSet implementasyonu gibi calistigi icin degerleri ekleme
                               sirasina gore depolar. Ayrica elemanlari sorgulama cok hizlidir ve sabit zamanda calisir.
            
            Elemanlarin Siralamasi Onemliyse

            TreeSet ---> Verileri agac yapisinda depoladigi icin veriler her zaman siralidir. Ancak bir elemanin
                         var olup olmadigini sorgulama zamani icindeki eleman sayisiyla dogru orantilidir. (O(logn))

            Eger kendi objelerimizi setlerde kullanmak istiyorsak hashCode() ve equals() metodlarini override etmeliyiz.

            ----------------------------------------------------------------------------------------------
            Map Interface'ini Implement Eden Classlar

            Veriler Anahtar Deger iliskisiyle depolanir.
            Bir key'e karsilik gelen yalnizca bir deger bulunur.
            Bir key birden fazla bulunamaz.
            Bir degere bir key uzerinden erismek cok hizlidir.
            Degerlerin uzerinde tek tek gezinmek cok yavastir.
            Eger kendi objelerimizi maplerde kullanmak istiyorsak hashCode() ve equals() metodlarini override etmeliyiz.


            HashMap

            Anahtarlar ve Degerler Sirali Degildir.

            LinkedHashMap

            Anahtarlar ve Degerler ekleme sirasina gore depolanir.

            TreeMap

            Anahtarlar ve Degerler "Anahtarlara Gore" sirali depolanir.

            ---------------------------------------------------------------------
            Queue Interface'ini Implement'e eden Classlar

            LinkedList

            Eger Queue Interface'inden bir referans ile LinkedList olusturulursa bu linkedlist ayni zamanda bir
            Queue gibi davranir.

            First in First Out(Ilk gelen ilk cikar mantigiyla calisir)

            PriorityQueue

            Queue Interface'ini implemente etmesine ragmen First In First Out mantigiyla calismaz. Degerler oncelik
            sirasina gore kuyrugun basina gecer.

            --------------------------------------------------------------------------------------------

            Vector Classlarindan Extend Eden Stackler

            LIFO (Last In First Out mantigiyla calisir.) Bilgisayarlarda Recursive Fonksiyonlar calistirilirken kullanilir.

            ---------------------------------------------------------------------------------------------

            Kendi Objelerimizle Olusturdugumuz bir Veri Yapisini Siralamak

            Collections.sort() metoduyla kendi Objelerimizle olusturdugumuz bir veri yapisini siralamak icin
            ya Comparable Interface'ini ya da Comğarator interfaceini implemenete etmek zorundayiz.

            ----------------------------------------------------------------------------------------------

            Iteratorlar ve Iterable

            Bir veri yapisindan iterator olusturarak veri yapisinin elemanlari uzerinden kolayca gezinebiliriz.

            Aslinda For Each Dongusu kendi icinde iterator kullanir.

            O yuzden bizim de bir classimizdan olusturdugumuz objelerin uzerinde gezinebilmemiz icin Iterable Sinifini
            implemente etmemiz ve Classimiza ait vir tane iterator class yazmamiz gerekmektedir.

            ----------------------------------------------------------------------------------------------------

        */
    }
}
