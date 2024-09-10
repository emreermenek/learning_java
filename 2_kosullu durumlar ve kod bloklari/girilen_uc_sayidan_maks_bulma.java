import java.util.Scanner;

public class girilen_uc_sayidan_maks_bulma {
    public static void main(String[] args) {
        //kullanıcan alınan 3 sayidan en buyugunu bulma
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayi 1'i gir: ");
        int sayi1 = sc.nextInt();
        System.out.print("Sayi 2'yi gir: ");
        int sayi2 = sc.nextInt();
        System.out.print("Sayi 3'u gir: ");
        int sayi3 = sc.nextInt();
        if(sayi1>sayi2 && sayi1>sayi2){
            System.out.println("Sayi 1 en buyuk");
        }else if (sayi2>sayi1 &&sayi2>sayi3) {
            System.out.println("Sayi 2 en buyuk");
        }else if (sayi3>sayi1&&sayi3>sayi2) {
            System.out.println("Sayi 3 en buyuk");
        }else{
            System.out.print("hepsi ayni");
        }
        sc.close();
    }
}
