
public class Daire extends Sekil{
    private int yaricap;

    public Daire(String isim, int yaricap) {
        super(isim);
        this.yaricap = yaricap;
    }

    @Override
    void alanHesapla() {
        double alan = Math.PI * yaricap * yaricap;
        System.out.println("Dairenin alani = "+ alan );
    }


}
