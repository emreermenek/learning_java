
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emree
 */
class Ates{
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Ates(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Oyun extends JPanel implements KeyListener, ActionListener{
    Timer timer = new Timer(5, this);
    
    private int gecenSure = 0;
    private int harcananAtes = 0;
    
    private BufferedImage image;
    private ArrayList<Ates> atesler = new ArrayList<>();
    
    private int atesdirY = 5; 
    //her ates oldugunda atesdirY'yi ateslerimizin y koordinatina ekleyecegiz
    //ve boylece atesleri hareket ettirecegiz
    
    private int topX = 0; //topun hareketi
    
    private int topdirX = 5; //surekli topX'e eklicez ve belli bir limite carpinca sola donucek
    private int uzayGemisiX = 0; //uzay gemisi 0 dan baslasin
    private int dirUzayX = 20; //saga/sola basinca 20 birim kayicak;
    
    public boolean kontrolEt(){
        for(Ates ates : atesler){
            if(new Rectangle(ates.getX(),ates.getY(),5,10).intersects(new Rectangle(topX, 0, 20, 20))){
                return true;
            }
        }
        return false;
    }
    
    public Oyun(){
        try {
            image = ImageIO.read(new FileImageInputStream(new File("uzay_gemisi.png")));
        } catch (IOException ex) {
            Logger.getLogger(Oyun.class.getName()).log(Level.SEVERE, null, ex);
        }
        setBackground(Color.black);
        timer.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        gecenSure += 5;
        g.setColor(Color.red);
        g.fillOval(topX, 0, 20, 20);
        g.drawImage(image, uzayGemisiX, 490, image.getWidth() / 10, image.getHeight() / 10, this);
        Iterator<Ates> iterator = atesler.iterator();
        while(iterator.hasNext()){
            Ates ates = iterator.next();
            if(ates.getY() < 0){
                iterator.remove();
            }
        }
        
        g.setColor(Color.blue);
        
        for(Ates ates : atesler){
            g.fillRect(ates.getX(), ates.getY(), 5, 10);
        }
        
        if(kontrolEt()){
            timer.stop();
            String message = "Kazandınız..\nAtes sayisi : " + harcananAtes + 
                             "\nGeçen Süre : " + (gecenSure/1000.0)+" saniye";
            JOptionPane.showMessageDialog(this, message);
            System.exit(0);
        }
    }

    @Override
    public void repaint() {
        //java her repaint cagrildiginda painti de cagirir ve biz bunu action performed yazdigimiz zaman
        //repainti onun en sonunda cagiricaz.
        super.repaint(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void keyTyped(KeyEvent e) {
      
    }

    @Override
    public void keyPressed(KeyEvent e) {
         int c = e.getKeyCode();
        
        if(c == KeyEvent.VK_LEFT){
            if(uzayGemisiX <= 0){
                uzayGemisiX = 0;
            }else{
                uzayGemisiX -= dirUzayX;
            }
        }else if(c == KeyEvent.VK_RIGHT){
            if(uzayGemisiX >= 715){
                uzayGemisiX = 715;
            }else{
                uzayGemisiX += dirUzayX;
            }
        }else if(c == KeyEvent.VK_SPACE){
            atesler.add(new Ates(uzayGemisiX+33, 490));
            harcananAtes++;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(Ates ates : atesler){
            ates.setY(ates.getY()-atesdirY);
        }
        
        topX += topdirX;
        
        if(topX >= 750){
            topdirX = -topdirX;
        }
        if(topX <= 0){
            topdirX = -topdirX;
        }
        repaint();
    }
    
    
}
