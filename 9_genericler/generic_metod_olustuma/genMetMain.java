
public class genMetMain {
    public static void main(String[] args) {
        //farkli veri tiplerinden olan dizileri tek metodla bastirmayi gorerek
        //generic metod olusturmayi ogrenmis olacagiz.

        // Character[] charDizi = {'j','a','v','a'}; 
        // Integer[] intDizi = {1,2,3,4,5,6};
        // String[] stringDizi = {"Java","Python","HTML","Javascript"};
        // Ogrenci[] ogrenciDizi = {new Ogrenci("Emre"),new Ogrenci("Mehmet"),new Ogrenci("Mert")};

        // yazdir(charDizi);
        // yazdir(intDizi);
        // yazdir(stringDizi);
        // yazdir(ogrenciDizi);

        Sayisal sayisal1 = new Sayisal(30, 40, 10, 20);
        Sayisal sayisal2 = new Sayisal(20, 30, 15, 10);
        Sayisal birinci = birinci(sayisal1, sayisal2);

        System.out.println("Birinci ogrencinin puani: "+ birinci.puanHesapla());

        Esitagirlik esitagirlik1 = new Esitagirlik(30, 20, 20, 10);
        Esitagirlik esitagirlik2 = new Esitagirlik(40, 10, 15, 12);

        Esitagirlik birinci2 = birinci(esitagirlik1, esitagirlik2);

        System.out.println("Birinci ogrencinin puani: "+ birinci2.puanHesapla());

    }

    //burada yalniz E diyemeyiz 
    //cunku cok fazla farkli veri tipi gonderebilirz demek.
    //bu da ornegin int gonderirsek puanHesapla() calismayacagi icin hata aliriz.
    //burada sadece Adayi extend edenleri gondermek istiyoruz diyecegiz:
    public static <E extends Aday> E birinci(E e1, E e2){
        if(e1.puanHesapla()>e2.puanHesapla()){
            return e1;
        }
        return e2;
    }

    // public static <E> void yazdir(E[] array){ //E bir veri tipi yerine gecer ve javaya gonderdigimiz veri tipini E yerine yaz dedik
    //     for(E i : array){
    //         System.out.println(i);
    //     }
    //}

}
