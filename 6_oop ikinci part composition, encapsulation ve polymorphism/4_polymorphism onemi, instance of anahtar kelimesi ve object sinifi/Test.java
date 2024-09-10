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

public class Test{

    public static void konustur(Object object){
        if(object instanceof Kopek){
            Kopek kopek = (Kopek)object;
            System.out.println(kopek.konus());

        }else if(object instanceof Kedi){
            Kedi kedi = (Kedi)object;
            System.out.println(kedi.konus());
        }else if(object instanceof At){
            At at = (At)object;
            System.out.println(at.konus());
        }else if(object instanceof Hayvan){
            Hayvan hayvan = (Hayvan)object;
            System.out.println(hayvan.konus());
        }
        
    }
    public static void main(String[] args) {
        //instanceOf -> bir objenin hangi classtan oldugunu anlamamizi saglar
        // Kopek kopek = new Kopek("Durust");
        // // if(kopek instanceof Kopek){  //true
        // //     System.out.println("Bu nesne kopek sinifindan..");
        // // }
        // if(kopek instanceof Hayvan){ //true
        //     System.out.println("Bu nesne hayvan sinifindan..");
        // }
        Hayvan kopek = new Kopek("Kopek");
        Hayvan kedi = new Kedi("Basur");
        Hayvan at = new At("Gulbatur");
        Hayvan hayvan = new Hayvan("Duldul");
        konustur(kopek);
        konustur(kedi);
        konustur(at);
        konustur(hayvan);


        //kopek. yazdigimizda class a yazmadigimiz metodlar goruruz bunlar object sinifindan gelen metodlardir.
    }
}

//polymorphism: Bir nesnenin birden fazla nesne gibi davranmasi, turkcesi cok bicimlilik
