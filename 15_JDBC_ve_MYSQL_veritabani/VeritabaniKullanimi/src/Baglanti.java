import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/*
* Bu dersten once xampp kurduk sonra mysql-connector-jari librariese ekledik.
* Devaminda demo adli bir database actik, bu kod calismadan once de
* xampp control panel den ilk apache sonra mysqli aktif ettik.
*/
//kullanici adi otomatik root ve sifre bos -> ""
public class Baglanti {
    private String kullaniciAdi = "root";
    private String parola = "";

    private String db_ismi = "demo";
    //databasein adresini vermemiz gerekir uzak bir sunucuysa adresi lokalse asagidaki gibi:
    private String host = "localhost";

    private int port = 3306;

    private Connection con = null;

    public Baglanti(){
        String url = "jdbc:mysql://" + host + ":" + port + "/" + db_ismi;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver bulunamadi!");
        }

        try {
            con = DriverManager.getConnection(url, kullaniciAdi, parola);
        } catch (SQLException e) {
            System.out.println("Baglanti basarisiz!");
        }
        System.out.println("Baglanti basarili.");
    }

    public static void main(String[] args) {
        Baglanti b = new Baglanti();
    }
}
