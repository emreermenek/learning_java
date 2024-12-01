
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emree
 */
public class GrafikKullanimi extends JPanel{
    //(0,0) noktasi sol ust kosedir.
    
    @Override
    public void paint(Graphics g){
        super.paint(g); 
        g.setColor(Color.red);
        g.drawRect(100, 100, 30, 40);
        g.fillRect(200, 200, 30, 40);
        g.setColor(Color.blue);
        g.drawOval(150, 150, 30, 30);
        g.fillOval(300, 300, 60, 30);
        g.setColor(Color.yellow);
        g.drawLine(150, 150, 300, 300);
    }

    public GrafikKullanimi() {
        setBackground(Color.black);
    }
}
