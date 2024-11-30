import java.sql.*;
import java.util.Scanner;

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
    private PreparedStatement preparedStatement = null;

    /*
        Database Transaction

        Cogu zaman programlarimizda bir cok veritabani islemini ard arda yapariz.
        Ornegin elimizde birbirleriyle baglantili 3 tane tablo guncelleme islemimiz var(delete, update).
        Bu islemleri ve sorgulari ard arda calistirdigimizi dusunelim.

        statement.executeUpdate(sorgu1);
        statement.executeUpdate(sorgu2); //Burada herhangi bir hata oldu ve programimiz sona erdi.
        statement.executeUpdate(sorgu3);

        Boyle bir durumda 2. sorgumuzda herhangi bir hata oluyor.
        Ancak 1. sorguda hata olmadigi icin bu sorgumuz veritabanimizi guncelledi
        Ancak bu sorguşar birbiriyle baglantili ise 1.sorgunun da calismamasi gerekiyor.
        Iste biz boyle durumlarin onune gecmek icin Transactionlari kullaniyoruz.

        (ATM Ornegi)

        Transaction mantigini kullanmak icin bu sorgularin sadece hicbir sorun olusmadiginda toplu calismasini istiyoruz.

        Java bu sorgulari yazdigimiz andan itibaren otomatik olarak sorgulari sorgusuz sualsiz calistirir. Onun icin ilk
        olarak con.setAutoCommit(false) seklinde bir sey yaparak bu durumu engelliyoruz.

        commit() : Butun sorgulari calistirir. Sorun olmadigi zaman hepsini calistirmak icin kullaniyoruz.
        rollback() : Butun sorgulari iptal et. Sorun oldugu zaman hicbirini calistirmak icin kullaniyoruzç

        Yani bu sefer programlarimizi biraz daha guvenli yazmis oluyoruz.

        Not: setAutoCommit(false) yazsak bile Veritabanini guncellemeyen bir sorgumuz varsa herhangi bir guvenlik
        sikintisi olmayacagindan calistirabiliriz.
    */
    public void preparedCalisanlariGetir(int id){
//        try {
//            statement = con.createStatement();
//            String sorgu = "Select * From calisanlar where ad like 'M%'"; //sadece m ile baslayanlari al dedik.
//
//            ResultSet rs = statement.executeQuery(sorgu);
//            while(rs.next()){
//                System.out.println("Ad : " + rs.getString("ad"));
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }

        try {

//            String sorgu = "Select * From calisanlar where id = ?"; // bu soru isareti sonrasinda yerine yazacagimiz degeri alir
            String sorgu = "Select * From calisanlar where id > ? and ad like ?";
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, id); //1. soru isareti yerine id yi al dedik.
            preparedStatement.setString(2, "S%");
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                String ad = resultSet.getString("ad");
                String soyad = resultSet.getString("soyad");
                String email = resultSet.getString("email");
                System.out.println("Ad : " + ad + ", Soyad : " + soyad + ", Email : " + email);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void commitverollback(){
        Scanner sc = new Scanner(System.in);
        try {
            con.setAutoCommit(false); //commitleri otomatik yapma kontrolu bize ver dedik.
            String sorgu1 = "Delete from calisanlar where id = 3";
            String sorgu2 = "Update calisanlar set email = 'emreermenek1234@gmail.com' where id = 12";
            System.out.println("Guncellemeden once: ");
            calisanlariGetir(); // delete veya update olmadigi icin calisir.

            statement = con.createStatement();
            statement.executeUpdate(sorgu1);
            statement.executeUpdate(sorgu2);
            //suanda bunlar bizim kontrolumuzde oldugu icin calismaz, istedigimiz zaman kendimiz calistiricaz
            System.out.println("Islemleriniz kaydedilsin mi? (yes/no)");
            String cevap = sc.nextLine();
            if(cevap.equals("yes")){
                con.commit(); //bundan sonra sorgular calisir.
                calisanlariGetir();

                System.out.println("Veritabani guncellendi!");
            }else{
                con.rollback();
                System.out.println("Veritabani guncellenmesi iptal edildi...");
                calisanlariGetir();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void calisanEkle(){
        try {
            statement = con.createStatement();
            String ad = "Semih";
            String soyad = "Kılıcsoy";
            String email = "semih@gmail.com";
            String sorgu = "Insert Into calisanlar (ad,soyad,email) Values('"+ad+"','"+soyad+"','"+email+"')";
            //guncelleme yaparken:
            statement.executeUpdate(sorgu);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void calisanlariGuncelle(){
        try {
            statement = con.createStatement();
            String sorgu = "Update calisanlar Set email = 'example@gmail.com' Where id > 3";
            statement.executeUpdate(sorgu);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void calisanlariGetir(){
        String sorgu = "Select * from calisanlar"; //calisanlardaki butun(*) verileri al
//        String sorgu = "Select * from calisanlar where id > 2"; //calisanlardaki id'si 2 den buyuk olanlarin butun(*) verileri al

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

    public void calisanSil(){
        try {
            statement = con.createStatement();
            String sorgu = "Delete from calisanlar where id > 3";
            int deger = statement.executeUpdate(sorgu); // kac deger silindigini de doner.
            System.out.println(deger +" kadar veri etkilendi!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public Baglanti(){
//        String url = "jdbc:mysql://" + host + ":" + port + "/" + db_ismi;
        //kodu guvenceye almak icin: turkce karakter gonderince
        String url = "jdbc:mysql://" + host + ":" + port + "/" + db_ismi+"?useUnicode=true&characterEncoding=UTF-8";

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
//        System.out.println("Calisanlar:");
//        b.calisanlariGetir();
//        System.out.println("**************");
//        System.out.println("Silinmeden sonra calisanlar: ");
//        b.calisanSil();
//        b.calisanlariGetir();
          b.commitverollback();
    }
}
