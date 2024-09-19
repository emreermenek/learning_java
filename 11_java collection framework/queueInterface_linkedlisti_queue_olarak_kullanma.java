import java.util.LinkedList;
import java.util.Queue;

public class queueInterface_linkedlisti_queue_olarak_kullanma {
    public static void main(String[] args) {
        /*
            Queue'de FIFO(First in first out) mantigi vardir,
            Ramazan pidesi sirasi gibi siraya ilk giren ilk cikar.

            -> Queue(Kuyruk) Interface'ini implemente eden LinkedList Classi FIFO(First in first out) mantigiyla calisir.
            -> add(Eleman): Elemani kuyruga ekler. Ekleyemezse hata firlatir.
            -> offer(Eleman): Elemani kuyruga ekler. Eklerse true doner, ekleyemezse false doner.
            -> remove(): Kuyrugun en basindaki elemani kuyruktan cikarir. Kuyruk bossa, hata firlatir.
            -> poll(): Kuyrugun en basindaki elemani kuyruktan cikarir. Kuyruk bossa, null referans doner.
            -> element(): Kuyrugun en basindaki elemani doner. Kuyruk bossa, hata firlatir.
            -> peek(): Kuyrugun en basindaki elemani doner. Kuyruk bossa, null referans doner.

        */

        Queue<String> queue = new LinkedList<>();

        queue.offer("Java");
        queue.offer("Python");
        queue.offer("PHP");
        queue.offer("C++");

        /*
             --------------------------------
            | Java | Python | PHP | C++ |
            --------------------------------
        */

        for(String s : queue){
            System.out.println(s);
        }

        System.out.println("******************************");
        System.out.println("Eleman cikartiliyor : "+ queue.poll());
        System.out.println("******************************");
        for(String s : queue){
            System.out.println(s);
        }
        System.out.println("******************************");
        System.out.println(queue.isEmpty());
        System.out.println("******************************");
        while(!queue.isEmpty()){
            System.out.println("Eleman cikartiliyor : "+ queue.poll());
        }
    }
}
