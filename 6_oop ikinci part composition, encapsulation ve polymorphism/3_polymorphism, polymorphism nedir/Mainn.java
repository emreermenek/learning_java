class Hayvan{
    private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }

    public String konus(){
        return isim + " konusuyor..";
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}
class Kopek extends Hayvan{

    public Kopek(String isim) {
        super(isim);
    }

    @Override
    public String konus(){
        return getIsim() + " havliyor..";
    }
    
}

class Kedi extends Hayvan{

    public Kedi(String isim){
        super(isim);
    }

    @Override
    public String konus(){
        return getIsim() + " miyavliyor..";
    }

}

class At extends Hayvan{

    public At(String isim){
        super(isim);
    }

    @Override
    public String konus(){
        return getIsim() + " kisniyor..";
    }

}

public class Mainn{

    public static void konustur(Hayvan hayvan){
        System.out.println(hayvan.konus());
    }
    public static void main(String[] args) {
        // Hayvan hayvan = new Hayvan("Durust");
        // Hayvan hayvan = new Kedi("Puskul");
        // Hayvan hayvan2 = new Kopek("Durust");
        // Hayvan hayvan3 = new At("Gulbatur");
        // System.out.println(hayvan.konus());
        // System.out.println(hayvan2.konus());
        // System.out.println(hayvan3.konus());

        konustur(new Kedi("Duman"));
        konustur(new Kopek("Duldul"));
        konustur(new At("Sahbatur"));
        
    }
}

//polymorphism: Bir nesnenin birden fazla nesne gibi davranmasi, turkcesi cok bicimlilik
