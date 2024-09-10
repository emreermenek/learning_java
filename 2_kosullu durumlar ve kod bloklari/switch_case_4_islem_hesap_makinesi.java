import java.util.Scanner;

public class switch_case_4_islem_hesap_makinesi {
    public static void main(String[] args) {
        //switch case kullanarak 4 islem hesap makinesi yapma

        Scanner sc = new Scanner(System.in);
        System.out.print("Yapmak istediginiz islemi secin:\n1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme\nSecimi giriniz: ");
        int secim = sc.nextInt();
        System.out.print("1. sayiyi girin: ");
        double sayi1 = sc.nextDouble();
        System.out.print("2. sayiyi girin: ");
        double sayi2 = sc.nextDouble();
        double sonuc=0;
        switch(secim){
            case 1 -> sonuc = sayi1 + sayi2;
            case 2 -> sonuc = sayi1 - sayi2;
            case 3 -> sonuc = sayi1 * sayi2;
            case 4 -> sonuc = sayi1 / sayi2;
            default -> System.out.println("yanlis secim yaptiniz! 1-4 arasi seciniz!!!");    
        }
        System.out.println("Sonuc = " + sonuc);
    }
}
