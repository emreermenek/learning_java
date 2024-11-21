import java.util.Scanner;

public class mini_proje_iterable_interfacei_ile_kumanda_projesi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Kumanda uygulamasina hosgeldiniz..");

        String islemler = """
                Islemler:
                1- Kanallari Goster
                2- Kanal Ekle
                3- Kanal Sil
                4- Kanal Sayisini Ogren 
                q- Cikis icin basiniz..
                
                Yapmak istediginiz islemi seciniz: """;

        Kumanda kumanda = new Kumanda();

        boolean cikis = false;

        while (!cikis) { 
            System.out.print(islemler);
            char secim = sc.nextLine().charAt(0);
            switch(secim){
                case '1' -> kanallariGoster(kumanda);
                case '2' -> kanalEkle(kumanda,sc);
                case '3' -> kanalSil(kumanda, sc);
                case '4' -> kanalSayisiniOgren(kumanda);
                case 'q' -> {
                    System.out.println("Cikis yapiliyor..");
                    cikis = true;
                }
            }
            System.out.println("***************");
        }
         sc.close();
    }

    private static void kanalSayisiniOgren(Kumanda kumanda) {
        System.out.println("***************");
        System.out.println(kumanda.kanalSayisiniGoster() + " adet kanal bulunuyor!");
    }

    private static void kanalEkle(Kumanda kumanda, Scanner sc) {
        System.out.println("***************");
        System.out.print("Eklemek istediginiz kanalin ismini giriniz: ");
        String kanal = sc.nextLine();
        if(!kumanda.getKanallar().contains(kanal)){
            kumanda.kanalEkle(kanal);
            System.out.println(kanal + " isimli kanal eklendi!");
        }else{
            System.out.println("Eklemek istediginiz "+ kanal +" isimli kanal listede zaten var..");
        }
       
    }

    private static void kanalSil(Kumanda kumanda, Scanner sc) {
        System.out.println("***************");
        System.out.print("Silmek istediginiz kanalin ismini giriniz: ");
        String kanal = sc.nextLine();
        if(kumanda.getKanallar().contains(kanal)){
            kumanda.kanalSil(kanal);
            System.out.println(kanal + " isimli kanal silindi!");
        }else{
            System.out.println("Silmek istediginiz "+ kanal +" isimli kanal listede bulunmuyor..");
        }
        
    }

    public static void kanallariGoster(Kumanda kumanda){
        System.out.println("***************");
        if(kumanda.getKanallar().isEmpty()){
            System.out.println("Hicbir kanal yok!");
        }else{
            System.out.println("Kanallar:");
            for(String k : kumanda.getKanallar()){
                System.out.println(k);
            }
        }
    }
}
