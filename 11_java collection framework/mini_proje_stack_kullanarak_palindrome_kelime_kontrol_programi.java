
import java.util.Scanner;
import java.util.Stack;

public class mini_proje_stack_kullanarak_palindrome_kelime_kontrol_programi {
    public static void main(String[] args) {
        /*
            Bir cumlenin palindrome olup olmadini bulmak
        */

        //bir Stringin yarisina kadar gidip her bir karakteri stack'e atayacagiz.
        //sonra degerleri sirayla cikaricam ve ayni mi diye kontrol edecegim.
        Stack<Character> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String cumle = sc.nextLine();

        for(int i = 0;i<cumle.length()/2;i++){
            stack.push(cumle.charAt(i));
        }

        if(palindromeMu(cumle, stack)){
            System.out.println(cumle+" palindromdur");
        }else{
            System.out.println("\""+cumle+"\" palindrom degildir.");
        }
    }

    public static boolean palindromeMu(String cumle, Stack<Character> stack){
       

        for(int i = (cumle.length()/2)+1;i<cumle.length();i++){
            if(cumle.charAt(i) != stack.pop()){
                return false;
            }
        }

        return true;
    }
}
