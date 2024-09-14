import java.util.ArrayList;
import java.util.List;

public class ArraylistMain {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        List<String> list = new ArrayList<>();


        //ekleme
        list.add("Emre");
        list.add("Mert");
        list.add("Mehmet");

        System.out.println(list.get(1));

        for(int i = 0; i<list.size();i++){
            System.out.println((i)+". index = "+list.get(i));
        }
        System.out.println("1. index "+list.get(1)+" siliniyor.");
        list.remove(1);
        for(int i = 0; i<list.size();i++){
            System.out.println((i)+". index = "+list.get(i));
        }


    }
}
