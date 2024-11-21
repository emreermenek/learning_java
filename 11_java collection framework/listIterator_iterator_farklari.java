
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class listIterator_iterator_farklari {
    public static void main(String[] args) {
        /*
            List Iterator:

            -> Sadece List Interface'i implemente eden classlarda kullanilir.
               next() ve previous() metodu vardir. Ekstradan add() metodu bulunur.

            Iterator:

            -> Set, Queue ve List Interface'i implemente eden classlarda kullanilabilir.
               previous() metodu yoktur.

        */

        // Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("PHP");
        list.add("Go");
        list.add("Dart");

        ListIterator<String> listIterator = list.listIterator();
        

        // while(listIterator.hasNext()){
        //     System.out.println(listIterator.next());
        // }
        // System.out.println("***********************");
        // while(listIterator.hasPrevious()){
        //     System.out.println(listIterator.previous());
        // }

        while(listIterator.hasNext()){
            String value = listIterator.next();
            if(value.equals("Go")){
                listIterator.remove();
            }
        }

        for(String s : list){
            System.out.println(s);
        }
        



        // set.add("Java");
        // set.add("PHP");
        // set.add("Go");
        // set.add("Dart");


        // Iterator<String> iterator1 = set.iterator();
        // Iterator<String> iterator2 = list.iterator();

        // while(iterator1.hasNext()){
        //     System.out.println(iterator1.next());
        // }
        // System.out.println("*********************************");
        // while(iterator2.hasNext()){
        //     System.out.println(iterator2.next());
        // }
        // //tekrar iterator2'yi dondurursek bos donecek, cunku zaten sona geldi
        // System.out.println("*********************************");
        // while(iterator2.hasNext()){
        //     System.out.println(iterator2.next());
        // }
    }
}
