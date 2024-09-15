
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class map_interface_hashmap_linkedhashmap_treemap_farkliliklari {

    public static void mapYazdir(Map<Integer, String> map){

        map.put(10, "C++");
        map.put(5, "Java");
        map.put(1, "Python");
        map.put(2, "Php");
        map.put(100, "C");

        // for(Map.Entry<Integer, String> entry : map.entrySet()){
        //     System.out.println("Key: "+ entry.getKey()+", Value: "+ entry.getValue());
        // }

        //ya da

        for(Integer key : map.keySet()){
            System.out.println("Key: "+ key +", Value: "+ map.get(key));
        }

        // Collection<String> values = map.values();

        // for(String v : values){
        //     System.out.println("Value: "+v);
        // }

    }
    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();

        System.out.println("***********************");
        mapYazdir(hashMap);
        System.out.println("***********************");
        mapYazdir(linkedHashMap);
        System.out.println("***********************");
        mapYazdir(treeMap);

    }
}
