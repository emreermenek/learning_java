public class Kare extends Sekil{
    private int kenar;

    public Kare(String isim, int kenar){
        super(isim);
        this.kenar = kenar;
    }

    @Override
    void alanHesapla() {
        double alan = kenar*kenar;
        System.out.println("Kenar uzunlugu: "+kenar+" olan karenin alani: "+ alan);
    }

}
