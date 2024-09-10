
import java.util.Scanner;



public class metodlara_giris {


    public static void selamlama(){
        System.out.println("Merhaba Nasilsiniz?");
        System.out.println("Selamlar");
    }

    public static void faktoriyel(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Faktoriyeli alinacak sayiyi giriniz: ");
        int sayi = sc.nextInt();
        int faktoriyel = 1;
        for(int i = 1;i<=sayi;i++){
            faktoriyel*=i;
        }
        System.out.println(sayi+"'nin faktoryeli = "+faktoriyel);
    }
    public static void main(String[] args) {
        /*
            method -> fonksiyon
            Erisim belirleyiciler(Opsiyonel) -> public, private
            Ekstra ozellikler(opsiyonel) -> static, final
            Donus tipi -> void,string,int...
            Fonksiyon adi(Parametreler) parametre gondermek mecburi degildir
        */

        selamlama();
        faktoriyel();
    }
}
