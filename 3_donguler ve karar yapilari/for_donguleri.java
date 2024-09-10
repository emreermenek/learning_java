import java.util.Scanner;

public class for_donguleri {
    public static void main(String[] args) {
        // int i;
        // for(i=1;i<5;i++){
        //     System.out.println("4 kere masallah");
        // }

     
        // for(int i = 1;i<15;i*=2){
        //     System.out.println("i = " + i);
        // }

        //faktoriyel alma yapalım
        Scanner sc = new Scanner(System.in);
        System.out.print("Faktoriyelini alinacak sayiyi giriniz: ");
        int sayi = sc.nextInt();
        int faktoryel = 1;
        for(int i = 1; i<=sayi;i++){
            faktoryel *= i;
        }
        System.err.println(sayi+"'nin faktoryeli = " + faktoryel);
    }
}
