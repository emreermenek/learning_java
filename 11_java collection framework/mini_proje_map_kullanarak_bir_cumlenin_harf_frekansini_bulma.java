
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class mini_proje_map_kullanarak_bir_cumlenin_harf_frekansini_bulma {
    public static void main(String[] args) {
        //Treemap kullanarak bir stringin icindeki harflerin frekansini bulma

        Scanner sc = new Scanner(System.in);

        System.out.print("Cumleyi giriniz: ");
        String cumle = sc.nextLine();
        Map<Character, Integer> frekans = new TreeMap<>();
        //eger karakterimiz daha onceden gorulmemisse bu karakteri ekleyecegiz,
        //eger karakterimiz var ise yanindaki int degeri guncelleyecegiz..

        for(int i=0;i<cumle.length();i++){
            char c = cumle.charAt(i);
            if(frekans.containsKey(c)){
                frekans.replace(c, frekans.get(c) + 1);
            }else{
                frekans.put(c, 1);
            }
        }

        for(Map.Entry<Character, Integer> entry : frekans.entrySet()){
            System.out.println("Harf: " + entry.getKey() + " " + entry.getValue() + " kere cumle icinde geciyor.");
        }

        sc.close();

    }
}
