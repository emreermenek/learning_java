
import java.io.IOException;
import java.util.Scanner;

public class checkedException_uncheckedException_farki {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lutfen yasinizi giriniz: ");
        int yas = sc.nextInt();
        try {
            mekanKontrol(yas);
        } catch (IOException e) {
            System.out.println("IO Exception olustu");
        } //simdi bu hatayı firlattigi icin method bunu handle etmezsek kodumuz hata verir.

        //eger bu kodu bir apiye donusturursek main metoduna da throws ekleriz ve bu apiyi kullanan
        //kisinin exception handling yapmasi gerekir.
    }

    public static void mekanKontrol(int yas) throws IOException{
        if(yas<18){
            //ArithmeticException unchecked exceptiondur ama IOException gibi checkedException kullanirsak
            //java bunu method basinda belirtmemizi ister: bu method bu exceptioni firlatabilir seklinde.
            //unchecked exceptionlarda da kullanabiliriz throws u ama zorunlu değildir.
            throw new IOException();
        }else{
            System.out.println("Mekana hosgeldiniz!");
        }
    }
}
