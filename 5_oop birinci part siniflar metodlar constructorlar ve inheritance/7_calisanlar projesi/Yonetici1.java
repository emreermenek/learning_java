public class Yonetici1 extends Calisan {
    private int yonettigiKisiSayisi;

    public Yonetici1(String ad,String soyad,int id,int yonettigiKisiSayisi) {
        super(ad, soyad, id);
        this.yonettigiKisiSayisi = yonettigiKisiSayisi;
    }
    @Override
    public void bilgileriGoster(){
        super.bilgileriGoster();
        System.out.println("Yoneticinin yonettigi kisi sayisi: "+yonettigiKisiSayisi);
    }
    public void zamYap(int zamMiktari){
        System.out.println("Yonetici "+zamMiktari+"TL zam yapti..");
    }
}
