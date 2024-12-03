

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emree
 */
public class CalisanIslemleri {
     private Connection con = null;

    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
       
    public boolean girisYap(String kullaniciAdi, String parola){
        String sorgu = "Select * From adminler where username = ? and password = ?";
        
         try {
             preparedStatement = con.prepareStatement(sorgu);
             preparedStatement.setString(1, kullaniciAdi);
             preparedStatement.setString(2, parola);
             
             ResultSet rs = preparedStatement.executeQuery();
             return rs.next(); //kullanıcı bulunamadı demek
         } catch (SQLException ex) {
             Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
         }
      return false;
    }
    public CalisanIslemleri(){
        String url = "jdbc:mysql://" + Database.host + ":" + Database.port + "/" + Database.db_ismi+"?useUnicode=true&characterEncoding=UTF-8";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver bulunamadi!");
        }

        try {
            con = DriverManager.getConnection(url, Database.kullaniciAdi, Database.parola);
        } catch (SQLException e) {
            System.out.println("Baglanti basarisiz!");
        }
        System.out.println("Baglanti basarili.");
    }
    
    public static void main(String[] args){
        CalisanIslemleri islemler = new CalisanIslemleri();
    }
    
    public ArrayList<Calisan> calisanlariGetir(){
        
        
         try {
             ArrayList<Calisan> cikti = new ArrayList<>();
             String sorgu = "Select * From calisanlar";
             statement = con.createStatement();
             ResultSet rs = statement.executeQuery(sorgu);
             
             while(rs.next()){
                 int id = rs.getInt("id");
                 String ad = rs.getString("ad");
                 String soyad = rs.getString("soyad");
                 String departman = rs.getString("departman");
                 String maas = rs.getString("maas");
                 
                 cikti.add(new Calisan(id,ad,soyad,departman,maas));
             }
             return cikti;
             
         } catch (SQLException ex) {
             Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
         }
        return null;
    }
}
