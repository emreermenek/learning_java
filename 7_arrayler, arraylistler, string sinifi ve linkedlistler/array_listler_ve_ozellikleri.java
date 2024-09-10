import java.util.ArrayList;

public class array_listler_ve_ozellikleri {
    public static void yazdir(ArrayList<String> array){
        for(int i = 0;i<array.size();i++){
            System.out.println(array.get(i));
        }
    }
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Emre");
        arrayList.add("Mehmet");
        arrayList.add("Mert");
        arrayList.add("Emre");
        for(int i = 0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
        // arrayList.remove(0); //Veya
        // arrayList.remove("Emre");
        System.out.println(arrayList.indexOf("Emre")+"\n"+arrayList.lastIndexOf("Emre")+"\n"+arrayList.indexOf("Salih"));
        System.out.println(arrayList.get(1));
        arrayList.set(1, "Salih");
        System.out.println(arrayList.get(1));
        yazdir(arrayList);
    }
}
