import java.sql.*;

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

    private Statement statement = null;

    public void calisanlariGetir(){
//        String sorgu = "Select * from calisanlar"; //calisanlardaki butun(*) verileri al
        String sorgu = "Select * from calisanlar where id > 2"; //calisanlardaki id'si 2 den buyuk olanlarin butun(*) verileri al

        try {
            statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(sorgu); //eger veritabaninda bir guncelleme yapmiyosak direk bu metodu kullanicaz
            while(resultSet.next()){
                int id = resultSet.getInt("id");
                String ad = resultSet.getString("ad");
                String soyad = resultSet.getString("soyad");
                String email = resultSet.getString("email");

                System.out.println("Id : "+id+" Ad : "+ad+" Soyad : "+soyad+" Email : "+email );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
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
        b.calisanlariGetir();
    }
}
