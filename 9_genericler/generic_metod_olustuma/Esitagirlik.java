public class Esitagirlik extends Aday{

    public Esitagirlik(int turkce, int matematik, int sosyal, int fen) {
        super(turkce, matematik, sosyal, fen);
    }

    @Override
    public int puanHesapla() {
        //net basi puan
        //turkce ve matematik 5 puan
        //sosyal 4 puan
        //fen 1 puan
        return getTurkce() * 5 + getMatematik() * 5 + getSosyal() * 4 + getFen(); 
    }
    
}
