public class Yazilimci1 extends Calisan{
    private String diller;
    public Yazilimci1(String ad,String soyad,int id,String diller){
        super(ad, soyad, id);
        this.diller = diller;
    }
    public void formatAt(String isletimSistemi){
        System.out.println(getAd()+" "+isletimSistemi+"'ni yukluyor.");
    }
    @Override
    public void bilgileriGoster(){
        super.bilgileriGoster();
        System.out.println("Yazilimcinin bildigi diller: "+diller);
    }
}
