
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

     
        String idmanlar = """
                          Gecerli hareketler:
                          ->Burpee
                          ->Pushup
                          ->Squad
                          ->Situp
                          """;
            Idman idman;
            try (Scanner sc = new Scanner(System.in)) {

                while(true){
                    try{

                        System.out.println("Idman programi yapma programina hosgeldiniz:");
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
                        idman = new Idman(burpee,pushup,squad,situp);
                        break;

                    }catch(InputMismatchException e){
                        System.out.println("Gecerli bir sayi giriniz!");
                        System.out.println("***************");
                        sc.nextLine();
                    }catch(NoSuchElementException e){
                        System.out.println("Gecerli bir sayi giriniz!");
                        System.out.println("***************");
                        sc.nextLine();
                    }
                    
                }

                System.out.println("***************\nEgitim programiniz basariyla olusturuldu\n***************");
                int i = 1;
                while (true) { 

                    try(FileWriter writer = new FileWriter("log.txt",true)){
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
                        writer.write((i++)+". islem: "+hareketTuru.toLowerCase()+": " +sayi+" kere yapildi.\n");
                        System.out.println("***********************");
                        if(idman.idmanBittiMi()==true){
                            System.out.println("Idman bitti!\nTebrikler!!!");
                            break;
                        }

                        }catch(IOException e){
                            System.out.println("Dosya olusturulurken bir sorun olustu!");
                            System.out.println("***************");
                            sc.nextLine();
                        }catch(InputMismatchException e){
                            System.out.println("Gecerli sayi giriniz!");
                            System.out.println("***************");
                            sc.nextLine();
                        }catch(NoSuchElementException e){
                            System.out.println("Gecerli sayi giriniz!");
                            System.out.println("***************");
                            sc.nextLine();
                        }
                    
                }
            }
        
       
        
    }    
}
