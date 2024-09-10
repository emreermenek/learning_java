public class Monitor {
    private String model;
    private String uretici;
    private String boyut;
    private Resolution resulation;
    public Monitor(String model, String uretici, String boyut, Resolution resulation) {
        this.model = model;
        this.uretici = uretici;
        this.boyut = boyut;
        this.resulation = resulation;
    }
    public void monitoruKapat(){
        System.out.println("Monitor kapatiliyor..");
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getUretici() {
        return uretici;
    }
    public void setUretici(String uretici) {
        this.uretici = uretici;
    }
    public String getBoyut() {
        return boyut;
    }
    public void setBoyut(String boyut) {
        this.boyut = boyut;
    }
    public Resolution getResulation() {
        return resulation;
    }
    public void setResulation(Resolution resulation) {
        this.resulation = resulation;
    }
    
}

//burada composition yaptik, Monitor objemize Resolution ozelligi ekledik.
