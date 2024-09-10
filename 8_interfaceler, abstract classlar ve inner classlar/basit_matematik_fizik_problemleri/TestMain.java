import java.util.Scanner;

public class TestMain {

        //Basit matematik ve Fizik Problemler
        //Daire alan - matematik
        //Ucgen cevresi - matematik
        //3 boyutlu vektorlerin ic carpimi - fizik

        public static void daireninAlaniniHesapla(Scanner sc){
            System.out.println("---------------------------------------");
            System.out.print("Daire alanini hesaplama...\nDairenin yaricapini giriniz: ");
            int r = sc.nextInt();
            sc.nextLine();
            Problem.Matematik.daireAlan(r);
          
        }
        public static void ucgeninCevresiniHesapla(Scanner sc){
            System.out.println("---------------------------------------");
            System.out.println("Ucgenin alanini hesaplama...");
            System.out.print("1. kenar: ");
            int birinciKenar = sc.nextInt();
            System.out.print("2. kenar: ");
            int ikinciKenar = sc.nextInt();
            System.out.print("3. kenar: ");
            int ucuncuKenar = sc.nextInt();
            sc.nextLine();
            Problem.Matematik.ucgeninCevresiniHesapla(birinciKenar, ikinciKenar, ucuncuKenar);
     
        }
        public static void vektorIcCarpim(Scanner sc){
            System.out.println("---------------------------------------");
            System.out.println("Iki vektorun ic carpimini hesaplama...");
            Vec vec1 = new Vec("Vec1", sc);
            Vec vec2 = new Vec("Vec2",sc);
            Problem.Fizik.vektorCarpimi(vec1, vec2);
        
        }


       public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Matematik ve Fizik programina hosgeldiniz.");
            String islemler = """
                    Islemler:
                    1-Daire Alan
                    2-Ucgen Cevresi
                    3-3 Boyutlu 2 Vektorin Ic Carpimi
                    q-Cikis
                    """;

            boolean cikis = false;

            while(!cikis){
                System.out.println("---------------------------------------");
                System.out.println(islemler);
                System.out.print("Yapmak istediginiz islemi giriniz: ");
                char islem = sc.nextLine().charAt(0);
                switch(islem){
                    case '1' -> daireninAlaniniHesapla(sc);
                    case '2' -> ucgeninCevresiniHesapla(sc);
                    case '3' -> vektorIcCarpim(sc);
                    case 'q' -> {System.out.println("Cikis yapiliyor.."); cikis = true;}
                    default -> System.out.println("Hatali giris! Tekrar deneyiniz..");
                }
               
            }
       }
}
