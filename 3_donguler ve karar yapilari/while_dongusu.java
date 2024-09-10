import java.util.Scanner;

public class while_dongusu {
    public static void main(String[] args) {
        // int i = 1;
        // while(i<10){
        //     System.out.println("i = " +i);
        //     i++;
        // }

        //faktoriyel alalim
        Scanner sc = new Scanner(System.in);
        System.out.print("Faktoriyelini alinacak sayiyi giriniz: ");
        int sayi = sc.nextInt();
        int faktoryel = 1;
        int i = 1;
        while(i<=sayi){
            faktoryel *= i;
            i++;
        }
        System.err.println(sayi+"'nin faktoryeli = " + faktoryel);
    }
}
