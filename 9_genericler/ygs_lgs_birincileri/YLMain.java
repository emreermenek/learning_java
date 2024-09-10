
import java.util.Scanner;


public class YLMain {
    public static void main(String[] args) {
        //uc ogrenciden puani yuksek olani dondurucez.
        //kullanici ilk ogrenci mf mi tm mi onu belirleyecek, 
        //sonra ogrencilerin isimlerini ve netlerini girecek.
        Scanner sc = new Scanner(System.in);
        System.out.println("Hosgeldiniz...");
        String islemler = """
                Ogrenciler Sayisal mi Sozel mi?
                1-Sayisal
                2-Sozel
                q-Cikis
                """;
        boolean cikis = false;


        while (!cikis) {
            System.out.println("-------------------------------------------");
            System.out.println(islemler);
            System.out.print("Secim: ");
            char islem = sc.nextLine().charAt(0);
            switch (islem) {
                case '1', '2' -> {
                    Aday ogrenci1 = ogrenciUret(islem, sc, 1);
                    Aday ogrenci2 = ogrenciUret(islem, sc, 2);
                    Aday ogrenci3 = ogrenciUret(islem, sc, 3);
                    Aday birinci = birinci(ogrenci1, ogrenci2, ogrenci3);
                    System.out.println("Birinci ogrencinin ismi: "+birinci.getIsim());
                    System.out.println("Birinci ogrencinin puani: "+birinci.puanHesapla());
                }
                case 'q' -> {
                    cikis = true;
                }
                default -> System.out.println("Hatali giris yaptiniz! Tekrar deneyiniz..");
            }
        }

    }

    public static Aday ogrenciUret(int islem, Scanner sc, int ogrencininSirasi){
        System.out.println("-------------------------------------------");
        System.out.print( ogrencininSirasi + ". ogrencinin ismini giriniz: ");
        String isim = sc.nextLine();
        System.out.print("Netlerini giriniz:\nTurkce: ");
        int turkce = sc.nextInt();
        System.out.print("Matematik: ");
        int matematik = sc.nextInt();
        System.out.print("Sosyal: ");
        int sosyal = sc.nextInt();
        System.out.print("Fen: ");
        int fen = sc.nextInt();
        sc.nextLine();
        if(islem==1){
            return new Sayisal(turkce, matematik, sosyal, fen, isim);
        }
        return new Esitagirlik(turkce, matematik, sosyal, fen, isim);      
    }

    public static <E extends Aday> E birinci(E e1, E e2, E e3){

        if(e1.puanHesapla()>e2.puanHesapla()&&e1.puanHesapla()>e3.puanHesapla()){
            return e1;
        }else if(e2.puanHesapla()>e1.puanHesapla()&&e2.puanHesapla()>e3.puanHesapla()){
            return e2;
        }
        return e3;
        //esitlik durumunda da e3 donecegiz..
    }
}
