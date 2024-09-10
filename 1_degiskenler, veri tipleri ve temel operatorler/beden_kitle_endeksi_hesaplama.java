
import java.util.Scanner;

public class beden_kitle_endeksi_hesaplama {
    public static void main(String[] args) {
        /*
         kullanıcıdan alınan değere göre beden kitle endeksini bulucaz.
         beden kitle endeksi = Kilo / boy(m) x boy(m)
         */

        Scanner sc = new Scanner(System.in);
         
        System.out.print("Kilonuz? ");
        int kilo = sc.nextInt();
        System.out.print("Boyunuz? (ornek 1,72) ");
        double boy = sc.nextDouble();
        double sonuc = kilo / (boy * boy);
        System.out.println("Beden Kitle Endeksiniz: " + sonuc);
    }
}
