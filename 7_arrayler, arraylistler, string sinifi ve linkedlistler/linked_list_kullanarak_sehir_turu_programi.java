
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class linked_list_kullanarak_sehir_turu_programi {
    public static void islemleriGoster(){
        System.out.println("1-Bir sonraki sehri gez.");
        System.out.println("2-Bir onceki sehri gez.");
        System.out.println("q-Cikis icin \"q\".");
    }
    public static void sehirleriGez(LinkedList<String> sehirler, Scanner sc){
        ListIterator<String> iterator = sehirler.listIterator();
        if(!iterator.hasNext()){
            System.out.println("Gezecek sehir bulunmuyor!");
        }
        boolean cikis = false;
        boolean ileri = true;

        while(!cikis){
            System.out.println("-----------------------");
            islemleriGoster();
            System.out.println("-----------------------");
            System.out.print("Yapilacak islemi giriniz: ");
            String islem = sc.nextLine();
            switch(islem){
                case "1" -> {
                    if(!ileri){
                        if(iterator.hasNext()){
                            iterator.next();
                        }
                        ileri = true;
                    }
                    if(iterator.hasNext()){
                        System.out.println(iterator.next()+" sehri geziliyor!");
                    }else{
                        System.out.println("Listedeki son sehirdesin..");
                    }
                }
                case "2" -> {
                    if(iterator.hasPrevious()){
                        iterator.previous();
                    }
                    ileri = false;
                    if(iterator.hasPrevious()){
                        System.out.println(iterator.previous()+" sehri geziliyor.");
                    }else{
                        System.out.println("Listedeki ilk sehirdesin..");
                    }
                }
                case "q" -> {
                    System.out.println("Cikis yapiliyor..");
                    cikis = true;
                }
                default -> System.out.println("Hatali tuslama!");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> sehirler = new LinkedList();
        sehirler.add("Izmir");
        sehirler.add("Ankara");
        sehirler.add("Denizli");
        sehirleriGez(sehirler,sc);
        sc.close();

    }
}
