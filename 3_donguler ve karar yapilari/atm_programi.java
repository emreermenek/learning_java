import java.util.Scanner;

public class atm_programi {
    public static void main(String[] args) {
        /* 
          ATM Programi yapmaya calisicaz:
          Fonksiyonlar:
            1-Bakiye Ogrenme
            2-Para Cekme
            3-Para Yatirma
            4-Cikis
        */

        Scanner sc = new Scanner(System.in);
        double bakiye = 10000;
        String islem = "q";
        
        do { 
            System.out.print("*********************\nIslemler:\n1-Bakiye Ogrenme\n2-Para Cekme\n3-Para Yatirma\n->Cikis(q)<-\n*********************\nNe yapmak istersiniz? ");
            islem = sc.nextLine();
            switch(islem){
                case "1" -> System.out.println("Bakiyeniz: "+ bakiye);
                case "2" -> {
                    System.out.println("Cekebileceginiz tutar: "+ bakiye);
                    System.out.print("Cekilecek miktari giriniz: ");
                    double cekilecekPara = sc.nextDouble();
                    if (cekilecekPara<bakiye&&cekilecekPara>0) {
                        bakiye -= cekilecekPara;
                        System.out.println("Para Cekildi... ");
                    } else {
                        System.out.println("Bakiyeniz yetersiz! Tekrar deneyin!!! ");
                    }
                    sc.nextLine();
                }
                    
                    
                case "3" -> {
                    System.out.print("Yatirmak istediginiz miktari giriniz: ");
                    double yatirilacakPara = sc.nextDouble();
                    bakiye += yatirilacakPara;
                    System.out.println("Para yatirildi... ");
                    sc.nextLine();
                }
                case "q" -> System.out.println("iyi gunler dileriz.. ");
                default -> System.out.println("Hatali giris yaptiniz!!!");
            }
        } while (!islem.equals("q"));
        sc.close();

    }
}
