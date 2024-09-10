public class hesap {
    private String kullaniciAdi;
    private double bakiye;
    private String sifre;

    public hesap(String kullaniciAdi, double bakiye, String sifre) {
        this.kullaniciAdi = kullaniciAdi;
        this.bakiye = bakiye;
        this.sifre = sifre;
    }

    public void paraYatir(double miktar){
        bakiye += miktar;
        System.out.println("Güncellenen bakiyeniz: " + bakiye);
    }

    public void paraCek(double miktar){

        if(miktar>bakiye){
            System.out.println("Bakiyeniz yetersiz!\nBakiyeniz: "+bakiye);
        }else if(miktar>5000){
            System.out.println("Tek seferde 5000TL den fazla cekemezsiniz!");
        }else{
            bakiye -= miktar;
            System.out.println("Güncellenen bakiyeniz: " + bakiye);
        }

    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }
    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }
    public double getBakiye() {
        return bakiye;
    }
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }
    public String getSifre() {
        return sifre;
    }
    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    
}
