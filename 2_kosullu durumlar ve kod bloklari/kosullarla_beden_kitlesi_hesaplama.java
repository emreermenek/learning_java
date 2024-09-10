import java.util.Scanner;

public class kosullarla_beden_kitlesi_hesaplama {
    public static void main(String[] args) {
        /*
         Beden kitle endeksi hesabı(bke): kilo / (boy(m)*boy(m))
         
            bke<18.5 çok zayıf
            18.5<=bke<25 normal
            25<=bke<30 biraz kilolu
            30<=bke obez
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("kilonuz: ");
        int kilo = sc.nextInt();
        System.out.print("boyunuz(ornek: 1,75): ");
        double boy = sc.nextDouble();
        double bke = kilo/(boy*boy);
        System.out.println("beden kitle endeksiniz: "+bke);
        if(bke<18.5){
            System.out.print("Çok zayif");
        }else if(18.5<=bke&&bke<25){
            System.out.print("Normal");
        }else if(25<=bke&&bke<30){
            System.out.print("Biraz kilolu");
        }else{
            System.out.print("obez");
        }
        sc.close();
    }
}
