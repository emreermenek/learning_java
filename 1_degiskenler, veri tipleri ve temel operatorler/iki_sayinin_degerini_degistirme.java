
import java.util.Scanner;

public class iki_sayinin_degerini_degistirme {
    public static void main(String[] args) {
        //kullanıcıdan aldığınız iki sayının degerini değiştirin.
        Scanner sc = new Scanner(System.in);
        System.out.print("A sayisini giriniz: ");
        int a = sc.nextInt();
        System.out.print("B sayisini giriniz: ");
        int b = sc.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.err.println("A degeri: " + a);
        System.err.println("B degeri: " + b);
        
   }
}
