
public class FinalTest {
    public final int objeSayisi;
    private static int say = 0;
    private final String isim;
    private final String soyisim = "Ermenek";

    public FinalTest(String isim){
        this.isim = isim;
        say++;
        objeSayisi = say;
    }

    

}
