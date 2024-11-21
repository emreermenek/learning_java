import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Radyo implements Iterable<String>{
    
    private ArrayList<String> kanallarListesi = new ArrayList<>();


    class RadyoIterator implements Iterator<String>{

        private int index = 0;

        @Override
        public boolean hasNext() {
            if(index < kanallarListesi.size()){
                return true;
            }
            return false;
        }

        @Override
        public String next() {
            String deger = kanallarListesi.get(index);
            index++;

            return deger;
        }
        
    }

    public Radyo(String[] kanallar){
        kanallarListesi.addAll(Arrays.asList(kanallar));
        //bu satir assagidaki islemi yapar: 
        // for(String k : kanallar){
        //     kanallarListesi.add(k);
        // }
    }

    @Override
    public Iterator<String> iterator() {
        // return kanallarListesi.iterator();
        //ya da yazdigimiz RadyoIterator classini kullanicaz.

        return new RadyoIterator();
    }
}
