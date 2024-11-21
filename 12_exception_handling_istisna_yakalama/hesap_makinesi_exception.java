import java.util.InputMismatchException;
import java.util.Scanner;



public class hesap_makinesi_exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
        try{
        System.out.print("Yapmak istediginiz islemi secin:\n1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme\nSecimi giriniz: ");
        int secim = sc.nextInt();
        if(secim>4||secim<1){
            System.out.println("yanlis secim yaptiniz! 1-4 arasi seciniz!!!");  
            continue;
        }
        System.out.print("1. sayiyi girin: ");
        double sayi1 = sc.nextDouble();
        System.out.print("2. sayiyi girin: ");
        double sayi2 = sc.nextDouble();
        double sonuc=0;
        switch(secim){
            case 1 -> {sonuc = sayi1 + sayi2; break;}   
            case 2 -> {sonuc = sayi1 - sayi2; break;}   
            case 3 -> {sonuc = sayi1 * sayi2; break;}   
            case 4 ->{ sonuc = sayi1 / sayi2; break;}    
        }
        System.out.println("Sonuc = " + sonuc);  
        }catch(ArithmeticException e){
            System.out.println("Bir sayi 0 a bolunemez.");
        }catch(InputMismatchException e){
            System.out.println("Lutfen inputlari dogru formatta girin.");
        }
    }
         
    }
}
