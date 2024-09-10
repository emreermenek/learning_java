
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Idman programi yapma programina hosgeldiniz:");
        String idmanlar = """
                          Gecerli hareketler:
                          ->Burpee
                          ->Pushup
                          ->Squad
                          ->Situp
                          """;
        System.out.println(idmanlar);
        System.out.print("Burpee sayisi: ");
        int burpee = sc.nextInt();
        System.out.print("Pushup sayisi: ");
        int pushup = sc.nextInt();
        System.out.print("Squad sayisi: ");
        int squad = sc.nextInt();
        System.out.print("Situp sayisi: ");
        int situp = sc.nextInt();
        sc.nextLine();
        Idman idman = new Idman(burpee,pushup,squad,situp);
        System.out.println("***************\nEgitim programiniz basariyla olusturuldu\n***************");
        while (true) { 
            System.out.println(idmanlar);
            System.out.print("Yapmak istediginiz hareketi yaziniz(Cikis icin \"q\"): ");
            String hareketTuru = sc.nextLine();
            if(hareketTuru.equals("q")){
                break;
            }
            System.out.print("Kac tane yapmak istersiniz: ");
            int sayi = sc.nextInt();
            sc.nextLine();
            idman.hareketYap(hareketTuru.toLowerCase(), sayi);
            System.out.println("***********************");
            if(idman.idmanBittiMi()==true){
                System.out.println("Idman bitti!\nTebrikler!!!");
                break;
            }
        }
       
        
    }    
}
