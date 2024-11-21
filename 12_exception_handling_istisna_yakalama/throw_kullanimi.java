
import java.util.Scanner;

public class throw_kullanimi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lutfen yasinizi giriniz: ");
        int yas = sc.nextInt();
        try{
            mekanKontrol(yas);
        }catch(ArithmeticException e){
            System.out.println("18 yasindan kucukler mekana giremez..");
        }
    }

    public static void mekanKontrol(int yas){
        if(yas<18){
            throw new ArithmeticException();
        }else{
            System.out.println("Mekana hosgeldiniz!");
        }
    }
}
