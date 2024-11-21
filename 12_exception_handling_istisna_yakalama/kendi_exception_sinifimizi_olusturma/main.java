import java.util.Scanner;

public class main {

    public static void mekanaGirme(int yas){
        if(yas<18){
            throw new InvalidAgeException("Invalid age hatasi");
        }
    }
    public static void main(String[] args) {
        /*
             Kendi exception classimizi yazmak icin kendi exception classimizi bir
             ust exception classindan turetmemiz gerekir.
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("yas giriniz: ");
        int yas = sc.nextInt();
        try{
            mekanaGirme(yas);
        }catch(InvalidAgeException e){
            e.printStackTrace();
            System.out.println(e);
        }
        

    }
}
