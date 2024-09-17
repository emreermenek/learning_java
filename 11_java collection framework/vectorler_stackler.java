
import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class vectorler_stackler {
    public static void main(String[] args) {
        
        /*
           synchorized anahtar kelimesi: (vector ve arraylist farki)
           farkli threadlerimiz bir arraylistin uzerinde ugrasiyorsa ve metod sychronize degilse
           bu threadlerimiz karisikliga sebep olabilir, ayni objeye ayni anda erisebilir.

           Ancak,

           arraylistlere gore biraz daha yavas calisirlar.
        */

        Vector<String> vector = new Vector<>();

        vector.add("Java");
        vector.add("Python");
        vector.add("PHP");
        vector.add("Dart");

        // for(String s : vector){
        //     System.out.println(s);
        // }

        ListIterator<String> iterator = vector.listIterator();

        // while(iterator.hasNext()){
        //     System.out.println(iterator.next());
        // }

        //vektorumuz uzerinde gezinmek icin bir sinifimiz daha bulunuyor,
        //bu sinifimiz enumaration sinifi

        Enumeration<String> enumeration = vector.elements();

        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }

        System.out.println("Ilk eleman: " + vector.firstElement());
        System.out.println("Son eleman: " + vector.lastElement());

        //Stack:

        /*
            Stackler LIFO sekllinde calisir.(Last in first out)

        */

        Stack<String> stack = new Stack<>();

        stack.push("Java"); //ekle.
        stack.push("Python");
        stack.push("PHP");
        stack.push("Dart");

        /*
          
            |    Dart      | 
            |    PHP      | 
            |    Python  |
            |    Java   |
            |----------|
        */

        // for(String s : stack){
        //     System.out.println(s);
        // }

        Enumeration<String> stackEnumeration = stack.elements();

        // while(stackEnumeration.hasMoreElements()){
        //     System.out.println(stackEnumeration.nextElement());
        // }

        // System.out.println(stack.peek()); //stackin son giren elemaninia al demek.
        // System.out.println(stack.peek());
        // System.out.println(stack.pop()); //stackin icinden son elemani cikarir.
        // System.out.println(stack.peek());

        while(!stack.empty()){
            System.out.println("Eleman cikartiliyor: " + stack.pop());
        }
    }
}
