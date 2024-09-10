
import java.util.ArrayList;


public class Sarkici {
    private final ArrayList<String> sarkicilar = new ArrayList<>();
    public void sarkicilariYazdir(){
        System.out.println("-------------------------");
        System.out.println("Sarkici Listesi: ");
        for(int i =0;i<sarkicilar.size();i++){
            System.out.println((i+1)+"-"+sarkicilar.get(i));
        }
    }
    public void sarkiciEkle(String sarkici){
        sarkicilar.add(sarkici);
        System.out.println("Sarkici listesi guncellendi..");
    }
    public void sarkiciDegistir(String sarkiciIsmi, int pozisyon){
        System.out.print("Sarkici: "+sarkicilar.get(pozisyon-1));
        sarkicilar.set(pozisyon-1, sarkiciIsmi);
        System.out.println(" "+sarkicilar.get(pozisyon-1)+" ile degistirildi");
    }
    public void sarkiciSil(int pozisyon){
        String isim = sarkicilar.get(pozisyon-1);
        sarkicilar.remove(pozisyon-1);
        System.out.println(isim+" isimli sarkici listeden silindi!");
    }
    public void sarkiciAra(String isim){
        int index = sarkicilar.indexOf(isim);
        if(index==-1){
            System.out.println("Boyle bir sarkici yok");
        }else{
            System.out.println(isim+"'li sarkici listede "+(index+1)+". sirada bulundu!!!");
        }
    }
}
