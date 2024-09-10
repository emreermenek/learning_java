
import java.util.Scanner;

public class iki_sayinin_ebobunu_bulma {

    public static int ebob(int sayi1, int sayi2){
        int ebob = 1;
        for(int i=1;i<=sayi1&&i<=sayi2;i++){
            if((sayi1 % i == 0) && (sayi2 % i == 0)){
                ebob = i;
            }
        }
        return ebob;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("2 sayi girin: \n1. sayi: ");
        int sayi1 = sc.nextInt();
        System.out.print("2. sayi: ");
        int sayi2 = sc.nextInt();
        System.out.println("("+sayi1+","+sayi2+")"+"'un ebobu = " + ebob(sayi1, sayi2));
    }
}
