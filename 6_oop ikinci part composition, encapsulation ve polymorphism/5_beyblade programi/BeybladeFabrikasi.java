public class BeybladeFabrikasi {
    public Beyblade beybladeUret(String beybladeTuru){
        if(beybladeTuru.equals("Dragon")){
            return new Dragon("Emre", 800, 300, "Mavi Ejderha", "Kutsal Canavarlarla Konusma");
        }else if(beybladeTuru.equals("Dranza")){
            return new Dranza("Mehmet", 600, 400, "Kirmizi Anka Kusu");
        }else if(beybladeTuru.equals("Drayga")){
            return new Drayga("Abdu", 800, 250, "Beyaz Kaplan");
        }else if(beybladeTuru.equals("Draciel")){
            return new Draciel("Max", 400,1000, "Kara Kaplumbaga");
        }else{
            return null;
        }
    }
}
