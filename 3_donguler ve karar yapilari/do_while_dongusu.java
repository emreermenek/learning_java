import java.util.Scanner;

public class do_while_dongusu {
    public static void main(String[] args) {
        /*
            do{
            
            }while(kosul);

            ilk do blogunu 1 kere calistir, devaminde kosul dogru oldugu surece do blogunu calistirmaya devam eder.
        */

        //do-while kullanarak bir sayinin rakamlar toplamini bulmaya calisalim
        
        //1234

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Bir sayi giriniz: ");
        int sayi = sc.nextInt();
        int toplam = 0;
        int i = 1;
        double kalan = 1;

        do { 
            kalan = sayi % Math.pow(10, i);
            kalan /= Math.pow(10, i-1);
            toplam += kalan;
            i++;
        } while (kalan!=0);
        System.out.println(sayi+"'nin rakamlari toplami = " + toplam);

        //veya sayinin üzerine kaydederek su sekilde yapabiliriz.

        do { 
            kalan = sayi % 10;
            sayi /= 10;
            toplam += kalan;
        } while (sayi>0);
        System.out.println("Girdiginiz sayinin rakamlari toplami = " + toplam);

    }
}
