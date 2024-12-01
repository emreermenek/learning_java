
import java.awt.HeadlessException;
import javax.swing.JFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emree
 */
public class AnaEkran extends JFrame{

    public AnaEkran(String title) throws HeadlessException {
        super(title);
    }
    
  
    public static void main(String[] args){
        GrafikKullanimi grafik = new GrafikKullanimi();
        
        AnaEkran ekran = new AnaEkran("Grafik Kullanımı");
            
        ekran.setVisible(true);
        ekran.setResizable(true);
        ekran.setSize(600, 800);
        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ekran.add(grafik);
    }
    
}
