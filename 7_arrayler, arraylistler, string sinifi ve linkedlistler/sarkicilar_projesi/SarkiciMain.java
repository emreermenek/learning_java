
import java.util.Scanner;

public class SarkiciMain {
    private static Sarkici sarkicilar = new Sarkici();
    private static Scanner sc = new Scanner(System.in);
    private static boolean cikis = false;
    public static void islemleriGoster(){
        System.out.println("-------------------------");
        System.out.println("Islemler: ");
        System.out.println("1-Sarkicilari Yazdir");
        System.out.println("2-Sarkici Ekle");
        System.out.println("3-Sarkici Degistir");
        System.out.println("4-Sarkici Sil");
        System.out.println("5-Sarkici Ara");
        System.out.println("q-Cikis");
        System.out.println("-------------------------");
    }
    
    public static void sarkicilariYazdir(){
        sarkicilar.sarkicilariYazdir();
    }
    public static void sarkiciEkle(){
        System.out.print("Eklemek istediginiz sarkicinin ismini giriniz: ");
        String isim = sc.nextLine();
        sarkicilar.sarkiciEkle(isim);
    }
    public static void sarkiciDegistir(){
        sarkicilariYazdir();
        System.out.print("Degistirmek istediginiz sarkicinin listedeki sirasini giriniz: ");
        int sira = sc.nextInt();
        sc.nextLine();
        System.out.print("Yeni ismi giriniz: ");
        String isim = sc.nextLine();
        sarkicilar.sarkiciDegistir(isim, sira);
    }
    public static void sarkiciSil(){
        sarkicilariYazdir();
        System.out.print("Sarkicinin sirasini giriniz: ");
        int sira = sc.nextInt();
        sc.nextLine();
        sarkicilar.sarkiciSil(sira);
    }
    public static void sarkiciAra(){
        System.out.print("Aramak istediginiz sarkicinin ismini giriniz: ");
        String isim = sc.nextLine();
        sarkicilar.sarkiciAra(isim);
    }
    public static void cikisYap(){
        System.out.println("Cikis yapiliyor..");
        cikis = true;
    }
    public static void main(String[] args) {

        while(!cikis){
            islemleriGoster();
            System.out.print("Yapmak istediginiz islemi giriniz: ");
            String islem = sc.nextLine();
            switch(islem){
                case "1" -> sarkicilariYazdir();
                case "2" -> sarkiciEkle();
                case "3" -> sarkiciDegistir();
                case "4" -> sarkiciSil();
                case "5" -> sarkiciAra();
                case "q" -> cikisYap();
                default -> System.out.println("Hatali giris! Tekrar deneyiniz..");
            }
        }
    }
}
