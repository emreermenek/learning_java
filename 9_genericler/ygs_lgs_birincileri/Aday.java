public abstract class Aday {
     //net sayisi
    private int turkce;
    private int matematik;
    private int sosyal;
    private int fen;
    private String isim;

    public Aday(int turkce, int matematik, int sosyal, int fen, String isim) {
        this.turkce = turkce;
        this.matematik = matematik;
        this.sosyal = sosyal;
        this.fen = fen;
        this.isim = isim;
    }
    public int getTurkce() {
        return turkce;
    }
    public void setTurkce(int turkce) {
        this.turkce = turkce;
    }
    public int getMatematik() {
        return matematik;
    }
    public void setMatematik(int matematik) {
        this.matematik = matematik;
    }
    public int getSosyal() {
        return sosyal;
    }
    public void setSosyal(int sosyal) {
        this.sosyal = sosyal;
    }
    public int getFen() {
        return fen;
    }
    public void setFen(int fen) {
        this.fen = fen;
    }

    abstract int puanHesapla();
    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }

    

}
