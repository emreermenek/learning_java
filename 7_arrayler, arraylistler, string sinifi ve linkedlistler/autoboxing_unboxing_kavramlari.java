
import java.util.ArrayList;

public class autoboxing_unboxing_kavramlari {
    public static void main(String[] args) {
        /*
            Wrapper Class:
            İlkel veri tipleri: 
            boolean -> Boolean
            char -> Character
            byte -> Byte
            short -> Short
            int -> Integer
            long -> Long
            float -> Float
            double -> Double
        */

        
        //Java bunlari otomatik olarak yapar. 

        // ArrayList<String> arrayList = new ArrayList<String>();
        // ArrayList<int> arrayList2 = new ArrayList<int>(); //burada referans beklerken ilkel veri tipi verdin hatasi aliriz..
        // İlkel veri tipleriyle array list olusturmak icin wrapper classlari kullanicaz: 
        //int a; yerine:
        Integer a = 5;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0;i<10;i++){
            arrayList.add(Integer.valueOf(i)); 
            //ilkel veri tipini kutuya alip wrapper class seklinde array a atiyoruz buna autoboxing denir.
        }
        for(int i =0;i<10;i++){
            System.out.println(arrayList.get(i).intValue());
            //integer referansindaki int value yu aldik buna da unboxing denir.
        }

    }
}
