
import java.util.Scanner;

public class scanner_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt(); //Sayı
        // String b = sc.nextLine(); //string
        // if(sc.hasNextInt()){ // sayu mı kontrol etmek için
        //     int sayi = sc.nextInt();
        //     System.out.println(sayi);
        // }else{
        //     System.out.println("Sayi girin");
        // }

        // int yas = sc.nextInt();
        // sc.nextLine();//bunu diyerek yaşı girip enter a basınca isimi almadan atlamasını engelleriz.3
        // String isim = sc.nextLine();
        // //ilk isim sonra yas istesek de sorun olmazdı çünkü enter ı nextline algılasada da zaten ilk nextline ı almış olacaktık.

        // System.out.println("Yas: " + yas);
        // System.out.println("isim: " + isim);

        int yas1 = sc.nextInt();
        int yas2 = sc.nextInt();
        int yas3 = sc.nextInt();
        System.out.println("yas1: " + yas1 + " yas2: "+ yas2 + " yas3: " + yas3);
        //degeri sırayla enter diyerek de girebilirz 1 boşluk bırakarak da girebiliriz.
    }
}
