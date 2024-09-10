
//dogalgaz abonesi
public class Abone {
    public String isim;
    public int bakiye;
    public String sehir;

    public void dogalgazKullan(int miktar){
        if(miktar>bakiye){
            System.out.println("Bakiye yetersiz");
        }else{
            bakiye -= miktar;
            if(bakiye<=0){
                System.out.println("""
                                   Bakiyeniz bitmistir. Lutfen en yakin merkeze gidip kredi yukleyiniz..
                                   Kredi limiti = 120TL""");
            }else{
                System.out.println("Yeni bakiye = "+bakiye);
            }
        }
    }
    public void bakiyeOgren(){
        System.out.println("Bakiye: "+bakiye);
    }
}
