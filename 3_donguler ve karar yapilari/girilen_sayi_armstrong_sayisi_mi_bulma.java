import java.util.Scanner;

public class girilen_sayi_armstrong_sayisi_mi_bulma {
    public static void main(String[] args) {
        /* 
          Armstrong sayisi basamaklarinin basamak sayisi ile ussu alinmis degerlerinin toplami kendisine esit olan sayidir:

          A = A^1
          *iki basamakli armstrong sayisi yoktur*
          ABC = A^3 + B^3 + C^3
          ABCD = A^4 + B^4 + C^4 + D^4
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi = sc.nextInt();
        int temp = sayi;
        int basamakSayisi = 0;
        int toplam = 0;
        int basamakDegeri = 0;
        //ilk hedefimiz basamak sayisini bulup basamaklarin kacinci katini alacagimizi bulmaktir.
        while(temp>0){
            if(temp>0){
                basamakSayisi += 1;
            }
            temp /= 10;
        }
        temp = sayi;
        System.out.println(basamakSayisi);
        //sonrasında da armstrong sayisi mi degil mi hesabini yapariz.
        for(int i = 1;i<=basamakSayisi;i++){
            basamakDegeri = temp % 10;
            temp /= 10;
            toplam += Math.pow(basamakDegeri, basamakSayisi);
        }
      
        if(toplam == sayi){
            System.out.println(sayi+" bir armstrong sayisidir.");
        }else{
            System.out.println(sayi+" bir armstrong sayisi degildir.");
        }

    }
}
