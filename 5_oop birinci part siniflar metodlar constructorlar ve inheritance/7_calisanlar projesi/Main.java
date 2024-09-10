import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            Calisanlar Programi

            Calisan sinifi seklinde bir ust sinif
            Calisan sinifindan tureyen Yazilimci adinda bir alt sinif
            Calisan sinifindan tureyen Yonetici adinda bir alt sinif
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Calisanlar Programina Hosgeldiniz..");
        String islemler = """
                         Islemler:
                         1-Yazilimci islemleri
                         2-Yonetici islemleri  
                         Cikis icin \"q\"'ya basiniz.
                          """;

        while (true) { 
            System.out.println("******************************************");
            System.out.println(islemler);
            System.out.println("******************************************");
            System.out.print("Islemi seciniz: ");
            String islem = sc.nextLine();
            if(islem.equals("q")){
                System.out.println("Cikis yapiliyor..");
                break;
            }else if(islem.equals("1")){
                Yazilimci1 yazilimci = new Yazilimci1("Emre", "Ermenek", 123, "Flutter Dart Java");
                String yazilimciIslem = """
                        1.Format at
                        2.Bilgileri goster
                        Cikis icin \"q\"'ya basiniz.
                        """;
                System.out.println(yazilimciIslem);
                while (true) { 
                    System.out.print("Islem seciniz: ");
                    String yIslem = sc.nextLine();
                    if(yIslem.equals("q")){
                        System.out.println("Yazilimci isleminden cikiliyor");
                        break;
                    }else if(yIslem.equals("1")){
                        System.out.print("Isletim Sistemi: ");
                        String isletimSistemi = sc.nextLine();
                        yazilimci.formatAt(isletimSistemi);
                        break;
                    }else if(yIslem.equals("2")){
                        yazilimci.bilgileriGoster();
                        break;
                    }else{
                        System.out.println("Gecersiz yazilimci islemi..");
                        break;
                    }
                }

            }else if(islem.equals("2")){
                Yonetici1 yonetici = new Yonetici1("Romulo", "Jose de Cardoso", 79, 5);
                String yoneticiIslem = """
                        Yonetici islemleri:
                        1-Zam yap
                        2-Bilgileri goster
                        Cikis icin \"q\"'ya basiniz.
                        """;

                System.out.println(yoneticiIslem);
                while (true) { 
                    System.out.print("Islemi seciniz: ");
                    String yIslem = sc.nextLine();
                    if(yIslem.equals("q")){
                        System.out.println("Yonetici isleminden cikiliyor");
                        break;
                    }else if(yIslem.equals("1")){
                        System.out.print("Zam miktari seciniz: ");
                        int zam = sc.nextInt();
                        sc.nextLine();
                        yonetici.zamYap(zam);
                        break;
                    }else if (yIslem.equals("2")) {
                        yonetici.bilgileriGoster();
                        break;
                    }else{
                        System.out.println("Gecersiz yonetici islemi..");
                    }

                    
                }


            }else{
                System.out.println("Gecersiz islem..");
            }
        }
    }    
}
