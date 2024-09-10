import java.util.Scanner;

public class MainSekil {

    public static void kareninAlaniniHesapla(Scanner sc){
        System.out.println("-------------------------------");
        System.out.print("Karenin kenarini giriniz: ");
        int kenar = sc.nextInt();
        sc.nextLine();
        Sekil kare = new Kare("Kare", kenar);
        kare.alanHesapla();
    }

    public static void daireninAlaniniHesapla(Scanner sc){
        System.out.println("-------------------------------");
        System.out.print("Dairenin yaricapini giriniz: ");
        int yaricap = sc.nextInt();
        sc.nextLine();
        Sekil daire = new Daire("Daire", yaricap);
        daire.alanHesapla();
    }

    public static void ucgeninAlaniniHesapla(Scanner sc){
        System.out.println("-------------------------------");
        System.out.print("Ucgenin 1. kenarini giriniz: ");
        int kenar1 = sc.nextInt();
        System.out.print("Ucgenin 2. kenarini giriniz: ");
        int kenar2 = sc.nextInt();
        System.out.print("Ucgenin 3. kenarini giriniz: ");
        int kenar3 = sc.nextInt();
        sc.nextLine();
        Sekil ucgen = new Ucgen("Ucgen", kenar1, kenar2, kenar3);    
        ucgen.alanHesapla();    
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        String islemler = """
                Islemler:
                1-Kare alani hesaplama
                2-Daire alani hesaplama
                3-Ucgen alani hesaplama
                q-Cikis
                """;

        boolean cikis = false;
        while (!cikis) { 
            System.out.println("-------------------------------");
            System.out.println(islemler);
            System.out.print("Yapmak istediginiz islemi seciniz: ");
            char secim = sc.nextLine().charAt(0);
            switch(secim){
                case '1' -> kareninAlaniniHesapla(sc);
                case '2' -> daireninAlaniniHesapla(sc);
                case '3' -> ucgeninAlaniniHesapla(sc);
                case 'q' -> {System.out.println("Cikis yapiliyor"); cikis=true;}
                default -> System.out.println("Hatali giris yaptiniz! Tekrar deneyiniz..");
                
            }
        }
    
    }
}
