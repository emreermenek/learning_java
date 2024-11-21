
import java.util.Scanner;

class SiyasiException extends Exception{

    @Override
    public void printStackTrace() {
        System.out.println("Siyasi yasaginiz bulunuyor...");
    }

}

class VizeException extends Exception{

    @Override
    public void printStackTrace() {
        System.out.println("Vizeniz bulunamadi...");
    }

}

class HarcException extends Exception{

    @Override
    public void printStackTrace() {
        System.out.println("Yurt disi cikis harcinizi yatiriniz...");
    }

}



public class Yolcu  {
    private int harc;
    private boolean siyasiYasak;
    private boolean vize;

    public Yolcu(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Yurtdisi cikis harcinizin miktarini giriniz: ");
        int harc = sc.nextInt();
        sc.nextLine();
        this.harc = harc;
        System.out.print("Siyasi yasaginiz var mi? ");
        String cevap1 = sc.nextLine();
        if(cevap1.equals("evet")){
            this.siyasiYasak = true;
        }else{
            this.siyasiYasak = false;
        }
        System.out.print("Vizeniz onaylandi mi? ");
        String cevap2 = sc.nextLine();
        if(cevap2.equals("evet")){
            this.vize = true;
        }else{
            this.vize = false;
        }
    }

    public void yurtdisiHarciKontrol() throws HarcException {
        if(this.harc<15){
           throw new HarcException();
        }else{
            System.out.println("Harc islemi tamamlandi.");
        }
        
    }

    public void siyasiYasakKontrol() throws SiyasiException {
        if(this.siyasiYasak == true){
          throw new SiyasiException();
        }else{
            System.out.println("Herhangi bir siyasi yasaginiz bulunmuyor.");
        }
       
    }

    public void vizeDurumuKontrol() throws VizeException {
        if(this.vize == true){
            System.out.println("Vize islemleriniz tamam.");
        }else{
            throw new VizeException();
        }
     
    }


}
