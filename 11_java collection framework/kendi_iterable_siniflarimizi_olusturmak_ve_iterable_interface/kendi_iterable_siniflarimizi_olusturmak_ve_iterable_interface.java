
import java.util.Iterator;


public class kendi_iterable_siniflarimizi_olusturmak_ve_iterable_interface {
    public static void main(String[] args) {
        
        String[] kanallar = {"Radyo Viva", "Radyo Fenomen", "Kral Pop", "Radyo Hacettepe", "Alem FM"};

        Radyo radyo = new Radyo(kanallar);

        //for each objeden dogrudan iterator olusturmaya calisir. 
        //Ancak objemizin herhangi bir iterator objesi yoksa hata aliriz.
        //Cozmenin yolu sinifa iterable sinifini implemente etmektir.
        //bu islemi yapinca hatanin kalktigini gorebilirsiniz.
        for(String s : radyo){ 
            System.out.println(s);
        }

        Iterator<String> iterator = radyo.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
