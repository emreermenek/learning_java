
import java.util.Scanner;

public class ATM {
    public void calis(Scanner sc){
        
        hesap hesap1 = new hesap("Emre", 1000, "1234");
        login log = new login();
        System.out.println("*********************\nATM'ye HOSGELDINIZ!!!\n*********************");
        System.out.println("Giris:");
        boolean girToken = log.giris(hesap1,sc);
        boolean kal = true;
        while (kal) { 
            if(girToken==true){
                System.out.print("Islemler:\n1-Bakiye Ogrenme\n2-Para Yatir\n3-Para Cek\nCikis(q)\nYapmak istediginiz islemi seciniz: ");
                String tercih = sc.nextLine();
                switch(tercih){
                    case "1"-> {
                        System.out.println("******************************");
                        System.out.println("Bakiyeniz: "+hesap1.getBakiye());
                        System.out.println("******************************");
                    }
                    case "2" -> {
                        System.out.println("******************************");
                        System.out.print("Yatirmak istediginiz miktari giriniz: ");
                        double miktar = sc.nextDouble();
                        sc.nextLine();
                        hesap1.paraYatir(miktar);
                        System.out.println("******************************");
                    }
                    case "3" -> {
                        System.out.println("******************************");
                        System.out.print("Cekmek istediginiz miktari giriniz: ");
                        double miktar = sc.nextDouble();
                        sc.nextLine();
                        hesap1.paraCek(miktar);
                        System.out.println("******************************");
                    }
                    case "q" ->{
                            kal = false;
                        }                   
                }
            }else{
                System.out.println("******************************");
                System.out.print("1-Tekrar deneyin\nCikis(q)\nSeciminizi girin: ");
                String secim = sc.nextLine();
                switch(secim){
                    case "1" -> {
                        girToken = log.giris(hesap1,sc);
                    }
                    case "q" -> {
                        kal = false;
                    }
                }
            }
            
        }
       

    }
}
