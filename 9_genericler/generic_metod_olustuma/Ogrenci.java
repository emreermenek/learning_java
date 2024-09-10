public class Ogrenci {
    private String isim;

    public Ogrenci(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    //javanin her classi object classindan turer.
    //object clasindaki bir metodu override edecegiz.

    @Override
    public String toString() {
        return "Isim: " + isim;
    }

}
