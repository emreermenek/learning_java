
public class Yonetici extends Calisan{ //subclass
    
    private int sorumluKisi;

    public Yonetici(String isim,int maas,String departman,int sorumluKisi){
        //"super" diyerek miras aldigim clasin icindeki constructora erisiriz:
        super(isim,maas,departman);
        this.sorumluKisi = sorumluKisi;
    }

    public void zamYap(int zamMiktari){
        System.out.println("Calisanlara "+zamMiktari+"TL zam yapildi!");
    }
    @Override
    public void bilgileriGoster(){
        // System.out.println("Isim: "+getIsim());
        // System.out.println("Maas: "+getMaas());
        // System.out.println("Departman: "+getDepartman());
        //veya:
        super.bilgileriGoster();
        System.out.println("Sorumlu Oldugu Kisi Sayisi: "+sorumluKisi);
    }

}

//overriding:
//miras aldigimiz metodlari subclassta tekrar tanimlarsak biz bu metodu cagirinca,
//artik override ettigimiz subclasstaki method cagirilacak buna overriding denir.
