
import java.util.HashSet;
import java.util.Set;

public class setinterface_hashSet_linkedHashSet_treeSet_farklari {
    public static void main(String[] args) {
        /*

            Set Interface ----> HashSet, LinkedHashSet, TreeSet

            Set Interface ile List Interface'in farki:
            List interface'i implemente eden classlar bir elementten birden fazla depolayabilirken,
            Set interface'i implement eden classlar bir elementten sadece bir tane depolarlar.

            HashSet Sinifi:

            HashSet extends AbstractSet implements Set Interface extends Collection extends Iterable

            1. HashSet elementleri "hashing" yani hash table mekanizmasina uygun bir bicimde depolarlar.
               (Her element belli bir key'e gore depolanir.)
               
            2. HashSet bir element'i sadece bir defa depolar.(Set Interface)

            3. Elementlerin eleme sirasina gore depolamaz.


            LinkedHashSet Sinifi:

            LinkedHashSet extends HashSet extends AbstractSet implements Set Interface extends Collection extends Iterable

            1. LinkedHashSet hem HashTable hem de Set Interface'in LinkedList implementasyonu gibi davranir.

            2. HashSette oldugu gibi bir elementi sadece bir defa depolar.(Set Interface)

            3. Elementleri ekleme sirasina gore depolar.


            TreeSet Sinifi:

            TreeSet sinifi NavigableSet interface'ini impelemente eder ve AbstractSet sinifindan miras alir.
            NavigableSet interface'i de SortedSet interfaceinden miras alir.

            1. Elementleri depolamak icin Tree yani Agac yapisini kullanir.

            2. Elementleri alfabetik olarak siralarlar.


            HashSet vs LinkedHashSet vs TreeSet

            HashSet, Hash Table mekanizmasini uyguladigi icin elementler sirali degildir. Ekleme, Cikarma ve
            Arama metodlari sabit zamanda( Time Complexity: O(1) ) calisir.

            TreeSet, elementleri tree yapisina yani agac yapisina uygun depolar. Ekleme, Cikarma ve Arama metodlari
            O(log(n)) complexity ile calisir.

            LinkedHashSet sinifi hashtable ile linked list yapisini kullanarak elementleri depolar. Bu yuzden,
            elementler ekleme sirasina gore depolanir. Ekleme, Cikarma ve Arama metodlari sabit zamanda
            ( Time Complexity : O(1) ) calisir.

        */

        // Set<String> set1 = new HashSet<>();
        // Set<String> set2 = new LinkedHashSet<>();
        // Set<String> set3 = new TreeSet<>();

        // //HashSet
        // set1.add("Java");
        // set1.add("Python");
        // set1.add("C++");
        // set1.add("Javascript");
        // set1.add("Php");

        // //LinkedHashSet
        // set2.add("Java");
        // set2.add("Python");
        // set2.add("C++");
        // set2.add("Javascript");
        // set2.add("Php");

        // //TreeSet
        // set3.add("Java"); 
        // set3.add("Python");
        // set3.add("C++");
        // set3.add("Javascript");
        // set3.add("Php");
        // set3.add("Php"); //set'e ayni sey tekrar eklenemez.



        // System.out.println("\nHashSet\n*************************************");
        // for(String i : set1){
        //     System.out.println(i);
        // }
        // System.out.println("\nLinkedHashSet\n*************************************");
        // for(String i : set2){
        //     System.out.println(i);
        // }
        // System.out.println("\nTreeSet\n*************************************");
        // for(String i : set3){
        //     System.out.println(i);
        // }

        // System.out.println(set1.contains("Go"));
        // System.out.println(set1.contains("Java"));
        // System.out.println(set1.isEmpty());

        // set1.remove("Java");
        // for(String i: set1){
        //     System.out.println(i);
        // }

        //Set interface'ini implemente eden butun classlarimiz kume gorevi gorur.

        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        set1.add("Java");
        set1.add("C++");
        set1.add("Python");
        set1.add("Javascript");
        set1.add("Php");

        set2.add("Go");
        set2.add("Java");
        set2.add("CSS");

        // Set<String> fark = new HashSet<>(set2); //farki set2 ye esitledik
        // System.out.println(fark);
        // //hangi karakterler farkli bakar cikan kume bossa false doluysa true doner.
        // System.out.println(fark.removeAll(set1));
        // //ve farkli olanlari doner ve fark kumesine esitler
        // System.out.println(fark);

        Set<String> kesisim = new HashSet<>(set2); //kesisimi set2 ye esitledik
        //kesisim varsa true degilse false doner, 
        System.out.println(kesisim.retainAll(set1));
        //sonra kesisen degerleri kesisimin uzerine yazar.
        System.out.println(kesisim);


        /*  hashset, linkedhashset, treeset e surekli sirali degerler eklersek,

            ->1 den 1 milyona kadar integer degeri gibi bu durumda treeset cok daha avanatajli olur, 
            Cunku direk alfabetik ya da sirali sekilde siralar. HAshset hashing yapar daha uzun surer.

            ->Eger farkli degerler koyarsak hashset en hizlisi olur, linkedhashset ise hep bunlarin arasinda
             performans gısterir.
         
        */
    }
}
