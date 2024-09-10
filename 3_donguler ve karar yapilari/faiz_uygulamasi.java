import java.util.Scanner;

public class faiz_uygulamasi {
    public static void main(String[] args) {
        /*
            kullanicidan ana para miktarini alin sonra kac sene yatirmak istedigini sorun.
            Her sene sonu para miktarini yazdiriniz.

            Faiz %6
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("Faize ne kadar para yatirmak istersiniz: ");
        double anaPara = sc.nextDouble();
        System.out.print("Kac sene yatirmak istersiniz: ");
        int yil = sc.nextInt();
        for(int i = 0;i<yil;i++){
            anaPara += anaPara*(6.0/100);
            System.out.println(i+1+". Yil sonu paraniz " + anaPara + "TL olmustur!");
        }

    }
}
