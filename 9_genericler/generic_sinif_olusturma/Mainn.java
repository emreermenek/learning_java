

public class Mainn {

    public static void main(String[] args) {
        //turden bagimsiz islem yaptigimiz metodlar ve classlardir.
        Character[] charDizi = {'j','a','v','a'}; 
        Integer[] intDizi = {1,2,3,4,5,6};
        String[] stringDizi = {"Java","Python","HTML","Javascript"};
        Ogrenci[] ogrenciDizi = {new Ogrenci("Emre"),new Ogrenci("Mehmet"),new Ogrenci("Mert")};

        // CharYazdir.yazdir(charDizi);
        // IntegerYazdir.yazdir(intDizi);
        // StringYazdir.yazdir(stringDizi);
        // OgrenciYazdir.yazdir(ogrenciDizi);

        //ayni islem icin veri tipi degistirmek icin farkli classlar olusturduk.
        //generic class yazsaydik tek bir classla butun veri tiplerini yazdirabilirdik.
        
        GenericYazdir<Character> charYazdirma = new GenericYazdir<Character>();
        GenericYazdir<Integer> integerYazdirma = new GenericYazdir<Integer>();
        GenericYazdir<String> stringYazdirma = new GenericYazdir<String>();
        GenericYazdir<Ogrenci> ogrenciYazdirma = new GenericYazdir<Ogrenci>();

        charYazdirma.yazdir(charDizi);
        integerYazdirma.yazdir(intDizi);
        stringYazdirma.yazdir(stringDizi);
        ogrenciYazdirma.yazdir(ogrenciDizi);

        //Tek classla 4 farkli veri tiplerinin referans objesini olusturup
        //farkli veri tipindeki array referanslarini bastirmis olduk


    }
}
