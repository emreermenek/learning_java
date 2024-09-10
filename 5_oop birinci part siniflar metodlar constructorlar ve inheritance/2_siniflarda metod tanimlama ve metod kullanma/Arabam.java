public class Arabam {
    private String renk;
    private int kapilar;
    private int tekerlekler;
    private String motor; 
    private String model;

    public void setModel(String model){ // modele deger atamamizi saglar
        this.model = model;  //this.model classin modeline erisir
    }
    // public void setModel(String modeleada){
    //     model = modeleada; //bu sever this kullanmadik cünkü isimler farkli
    // }
    
    public String getModel(){ //degere ulasmamizi saglar.
        return model; //this.model de diyebiliriz fark etmez.
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getKapilar() {
        return kapilar;
    }

    public void setKapilar(int kapilar) {

        if(kapilar<0){
            System.out.println("Kapilar 0 dan kucuk olamaz!");
        }else{
            this.kapilar = kapilar;
        }
        
    }

    public int getTekerlekler() {
        return tekerlekler;
    }

    public void setTekerlekler(int tekerlekler) {
        this.tekerlekler = tekerlekler;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }
}

//degerleri private yaparak encapsulation yapmis olduk yani:
//degerlere sadece dolayli olarak erisilebilir.