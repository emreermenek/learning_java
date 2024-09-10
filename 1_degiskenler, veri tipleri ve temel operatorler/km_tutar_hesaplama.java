import java.util.Scanner;

public class km_tutar_hesaplama {
    public static void main(String[] args) {
        /*
         Bir aracın km da ne kadar yaktığı ve kaç km yaptığı bilgilerini alın
         sürücünün ne kadar ödenemesi gerektiğini hesaplayın 
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("Ne kadar yakiyor? ");
        int masraf = sc.nextInt();
        System.out.print("Kac km yaptin? ");
        int km = sc.nextInt();
        System.out.println("Borcunuz: " + masraf*km);
        
    }
}
