public abstract class AOgrenci {

    private String isim;
    private int yas;
    public AOgrenci(String isim, int yas) {
        this.isim = isim;
        this.yas = yas;
    }
    abstract void kayitYaptir();
    public void selamla(){
        System.out.println("Selam..");
    }
    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }
    public int getYas() {
        return yas;
    }
    public void setYas(int yas) {
        this.yas = yas;
    }
}
