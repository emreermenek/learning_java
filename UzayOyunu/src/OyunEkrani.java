
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
public class OyunEkrani extends JFrame{
    
    public OyunEkrani(String title) throws HeadlessException{
        super(title);
    }
    
    public static void main(String[] args){
        OyunEkrani ekran = new OyunEkrani("Uzay Oyunu");
        
        ekran.setResizable(false);
        ekran.setFocusable(false);
        ekran.setSize(800, 600);
        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Oyun oyun = new Oyun();
        //Bu fonksiyonlarin sirasi da onemli.
        oyun.requestFocus(); //klavyeden işlemleri ver demek
        //klavye işlemlerş takibi için key listener tanimlicaz
        oyun.addKeyListener(oyun);
        oyun.setFocusable(true); //oyun ekranindan deger alicaz.
        oyun.setFocusTraversalKeysEnabled(false); //bu da klavyeden almak icin gerekli bir adim
        
        ekran.add(oyun);
        
        ekran.setVisible(true);
        
    }
}
