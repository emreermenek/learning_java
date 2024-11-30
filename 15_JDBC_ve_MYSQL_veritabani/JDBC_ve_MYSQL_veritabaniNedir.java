public class JDBC_ve_MYSQL_veritabaniNedir{
    /*
        Veritabani nedir?

        -> Veritabani uygulamalar icinde kullandigimiz verilerin belli sunucularin icinde depolanmasini saglayan yapilardir.
        Veritabanlarini kullanarak verilerimizi saklayabilir ve istedigimiz yerden ulasabiliriz.

        ------------------------

        Gunumuzde kullanilan bazi veritabani turleri sunlardir:

        -> Relational Databases(Iliskisel Veritabanlari): Verileri tablolarda depolarlar. Mysql ve Sqlite gibi veritabanlari
        bu kategoriye girer.

        -> Document Based Databases(Doküman Bazli Veritabanlari): Verileri dokumanlar halinde depolarlar. MongoDb ve Azure
        Document Db bu kategoriye girer.

        Biz bu bolum boyunca Mysql Veritabani uzerinde islemler gerceklestirmeye calisacagiz.
        ----------------------
        MySql Veritabani:
        -> Verileri tablolar halinde depolarlar:
        Isim               | Yazar          | YayinEvi     | Sayfa Sayisi
        ------------------ ---------------- --------------- -------------
        Istanbul Hatirasi | Ahmet Umit     | Everest      | 561
        Cerrah            | Tess Gerritsen | Dogan Kitap  | 270
        Budala            | Dostoyevski    | Sonsuz Kitap | 712

        -------------------
        Veritabani Islemleri:

        -> Mysql Veritabanindaki tablolar ve veriler uzerinde islem yapmak icin SQL(Structured Query Language) 
        sorgulari kullanilir. SQL kapsamli bir dil oldugu icin bu bolumde sadece belli basli sorgulari kullanacagiz.
        --------------------
        JDBC Nedir?

        -> JDBC, Java Projelerimizin iliskisel veritabanlarina baglanabilmesi icin olusturulmus bir yapidir. Biz bolum
        boyunca, JDBC uzerinden SQL sorgularini calistirip Mysql veritabani uzerinden islemler gerceklestirmeye calisacagiz.
        ----------------
        JDBC Ozellikleri:

        -> Farkli iliskisel veritabanlarina(SqlServer, PostgreSql) uyumludur ve her veritabani icin ayri ayri kod gelistirmemiz
        gerekmez.
        -> JDBC Driver sayesinde veritabanlarina baglanmamizi saglar.
        -> JDBC Driver ayni zamanda veritabani icin gerekli fonksiyon cagrilarimizi farkli veritabanlarina uygun hale getirir.
     */
}