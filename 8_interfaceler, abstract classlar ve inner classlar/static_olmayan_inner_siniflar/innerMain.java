
import java.util.Scanner;

public class innerMain{
    public static void main(String[] args) {
        /*
            Dort cesit inner class vardir:
            1-Statik olmayan inner class
            2-Statik inner class
            3-Lokal inner class
            4-Anonymous inner class
        */

        //Istedigimiz kadar inner classi birbirinin icerisine koyabiliriz.

        Matematik.Faktoriyel faktoriyel = new Matematik().new Faktoriyel();
        Matematik.Asal asal = new Matematik().new Asal();
        Matematik.Alan alan = new Matematik().new Alan();
        Matematik.Alan.DaireAlan daireAlan = new Matematik().new Alan().new DaireAlan();

        Scanner sc = new Scanner(System.in);
        faktoriyel.faktoriyel(sc);
        System.out.print("Bir sayi giriniz: ");
        int sayi = sc.nextInt();
        if(asal.asalMi(sayi)){
            System.out.println("Asal");
        }else{
            System.out.println("Asal degil");
        }

        System.out.print("Dairenin yaricapini giriniz: ");
        int r = sc.nextInt();
        daireAlan.daireninAlani(r);
    }
}