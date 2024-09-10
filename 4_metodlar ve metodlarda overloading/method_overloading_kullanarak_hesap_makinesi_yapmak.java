
import java.util.Scanner;

public class method_overloading_kullanarak_hesap_makinesi_yapmak {
    /*
        Method overloading kullanarak yap.
        toplama ve carpma methodlarini 2 veya 3 parametre olacak sekilde ayarlayin.
    */
    public static int bolme(int a, int b){
        return a/b;
    }
    public static int cikarma(int a, int b){
        return a-b;
    }
    public static int toplama(int a, int b){
        return a+b;
    }
    public static int toplama(int a, int b,int c){
        return a+b+c;
    }
    public static int carpma(int a, int b){
        return a*b;
    }
    public static int carpma(int a, int b,int c){
        return a*b*c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("*****************\n1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme\n*****************\nİslemi seciniz: ");
        int secenek = sc.nextInt();
        switch (secenek){
            case 1 -> { 
                System.out.print("1-2 sayi topla\n2-3 sayi topla\nSec: ");
                int sec = sc.nextInt();
                if(sec ==1){
                    System.out.print("1. sayi: ");
                    int sayi1 = sc.nextInt();
                    System.out.print("2. sayi: ");
                    int sayi2 = sc.nextInt();
                    System.out.print(sayi1+"+"+sayi2+"="+toplama(sayi1, sayi2));
                }else if(sec == 2){
                    System.out.print("1. sayi: ");
                    int sayi1 = sc.nextInt();
                    System.out.print("2. sayi: ");
                    int sayi2 = sc.nextInt();
                    System.out.print("3. sayi: ");
                    int sayi3 = sc.nextInt();
                    System.out.print(sayi1+"+"+sayi2+"+"+sayi3+"="+toplama(sayi1, sayi2, sayi3));
                }
            }
            case 2 -> {
                System.out.print("1. sayi: ");
                int sayi1 = sc.nextInt();
                System.out.print("2. sayi: ");
                int sayi2 = sc.nextInt();
                System.out.print(sayi1+"-"+sayi2+"="+cikarma(sayi1, sayi2));
            }
            case 3 -> {
                System.out.print("1-2 sayi carp\n2-3 sayi carp\nSec: ");
                int sec = sc.nextInt();
                if(sec ==1){
                    System.out.print("1. sayi: ");
                    int sayi1 = sc.nextInt();
                    System.out.print("2. sayi: ");
                    int sayi2 = sc.nextInt();
                    System.out.print(sayi1+"*"+sayi2+"="+carpma(sayi1, sayi2));
                }else if(sec == 2){
                    System.out.print("1. sayi: ");
                    int sayi1 = sc.nextInt();
                    System.out.print("2. sayi: ");
                    int sayi2 = sc.nextInt();
                    System.out.print("3. sayi: ");
                    int sayi3 = sc.nextInt();
                    System.out.print(sayi1+"*"+sayi2+"*"+sayi3+"="+carpma(sayi1, sayi2, sayi3));
                }
            }
            case 4 -> {
                System.out.print("1. sayi: ");
                int sayi1 = sc.nextInt();
                System.out.print("2. sayi: ");
                int sayi2 = sc.nextInt();
                System.out.print(sayi1+"/"+sayi2+"="+bolme(sayi1, sayi2));
            }
        }
        sc.close();
    }
}
