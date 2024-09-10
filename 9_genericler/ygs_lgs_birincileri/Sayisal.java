public class Sayisal extends Aday{

    public Sayisal(int turkce, int matematik, int sosyal, int fen, String isim) {
        super(turkce, matematik, sosyal, fen, isim);
    }

    
    @Override
    public int puanHesapla() {
        //net basi puan
        //turkce ve matematik 5 puan
        //sosyal 1 puan
        //fen 4 puan
        return getTurkce() * 5 + getMatematik() * 5 + getSosyal() + getFen() * 4; 
    }
}
