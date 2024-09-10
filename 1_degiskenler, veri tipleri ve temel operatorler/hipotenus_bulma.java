
import java.util.Scanner;

public class hipotenus_bulma {
    public static void main(String[] args) {
        //dik üçgenin hipotenüsünü bulma

        Scanner sc = new Scanner(System.in);
        System.out.println("Dik ücgenin hipotenusunu bulucaz:");
        System.out.print("1. koseyi girin: ");
        int a = sc.nextInt();
        System.out.print("2. koseyi girin: ");
        int b = sc.nextInt();
        double dik = Math.sqrt(a*a + b*b);
        System.out.print("Dik kose: " + dik);
    }
}
