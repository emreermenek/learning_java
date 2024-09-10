//implement ettigimiz interface in icindeki metodlari yazmak zorundayiz.

public class PCMuhendisi implements IMuhendis{
    private boolean askerlik;
    private boolean adliSicil;

    public PCMuhendisi(boolean askerlik, boolean adliSicil) {
        this.askerlik = askerlik;
        this.adliSicil = adliSicil;
    }

    @Override
    public void askerlikDurumuSorgula() {
       if(askerlik){
            System.out.println("Askerligimi yaptim.");
       }else{
            System.out.println("Askerligimi henuz yapmadim");
       }
    }

    @Override
    public String mezuniyetOrtalamasi(double derece) {
        return "Ortalamam: "+derece;
    }

    @Override
    public void adliSicilSorgula() {
        if(adliSicil){
            System.out.println("Adli sicil kaydim bulunuyor.");
        }else{
            System.out.println("Herhangi bir adli sicil kaydim bulunmuyor");
        }
    }

    @Override
    public void isTecrubesi(String[] array) {
        System.out.println("Bilgisayar muhendisi olarak su sirketlerle calistim:");
        for(String a : array){
            System.out.println(a);
        }
    }
    
}
