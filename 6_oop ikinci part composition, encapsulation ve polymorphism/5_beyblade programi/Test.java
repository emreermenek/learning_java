
import java.util.Scanner;

public class Test{
    public static void main(String[] args) {
        //polymorphism kullanarak beyblade programi
        Scanner sc = new Scanner(System.in);
        System.out.println("Beyblade programina hosgeldiniz!!!");
        System.out.println("Cikis icin \"q\" ya basiniz!");

        while(true){
            System.out.print("Hangi beyblade'i uretmek istiyorsunuz: ");
            String beybladeTuru = sc.nextLine();
            if(beybladeTuru.equals("q")){
                System.out.println("Cikis yapiliyor..");
                break;
            }else{
                BeybladeFabrikasi beybladeFabrikasi = new BeybladeFabrikasi();
                Beyblade beyblade = beybladeFabrikasi.beybladeUret(beybladeTuru);
                if(beyblade == null){
                    System.out.println("Lutfen gecerli bir beyblade ismi giriniz!");
                }else{
                    beyblade.bilgileriGoster();
                    beyblade.saldir();
                    beyblade.kutsalCanavariOrtayaCikar();
                }
            }

            
        }
    }
}