
import java.util.HashSet;
import java.util.Set;


class Player{
    private String isim;
    private String id;

    public Player(String isim, String id){
        this.isim = isim;
        this.id = id;
    }

    @Override
    public String toString() {
        return "| | | |  ID: " + id + ", isim: " + isim + "  | | | |";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((isim == null) ? 0 : isim.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Player other = (Player) obj;
        if (isim == null) {
            if (other.isim != null)
                return false;
        } else if (!isim.equals(other.isim))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

}


public class kendi_objelerimizi_maplerde_kullanmak_hashCode_equals_metodlari {
    public static void main(String[] args) {
        
        // Set<String> hashSet = new HashSet<>();
        Set<Player> hashSet = new HashSet<>(); 

        Player player1 = new Player("Emre", "1");
        Player player2 = new Player("Mert", "2");
        Player player3 = new Player("Mehmet", "3");
        Player player4 = new Player("Emre", "1"); //p1 ve p4 ayni 

        hashSet.add(player1);
        hashSet.add(player2);
        hashSet.add(player3);
        hashSet.add(player4);

        // hashSet.add("Java");
        // hashSet.add("Python");
        // hashSet.add("C++");

        // hashSet.add("C++"); 
        /*
             ikinci kez ayni deger ekleyemez,
             peki bunu nasil yaparlar?
             -> Bir tane degerimizi bir tane hash fonksiyonuna gider ve bu hash fonksiyonu
                bir tane hashcode uretir. Bu hashcode uretmesine gore bizim hashcodeumuz bir hashbucketina 
                direk yerlesir. Java equals metoduyla bu iki degerin ayni olup olmadigini ayni hashbucketta sorgular.
                Ayni degilse depolar, ayniysa depolamaz.


        */
       
        for(Player p : hashSet){ //p1 ve p4 ayni olmasina ragmen ikiside depolandi.
            System.out.println(p.toString());
        }
        //boyle bir sey olmasini istemiyorsak, classta hashcode ve equals metodunu ayni anda override etmemiz gerekir.
        //metodlari override edince sorunun duzeldigini gorebilirsiniz..
    }
}
