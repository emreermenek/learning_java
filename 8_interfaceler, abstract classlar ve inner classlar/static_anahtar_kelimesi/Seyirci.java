public class Seyirci {
    private String isim;
    public static int seyirciSayisi;

    public Seyirci(String isim) {
        this.isim = isim;
        seyirciSayisi++;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void seyret(){
        System.out.println(getIsim()+" oyun seyrediyor");
    }

    public int getSeyirciSayisi(){
        return seyirciSayisi;
    }
    
}
