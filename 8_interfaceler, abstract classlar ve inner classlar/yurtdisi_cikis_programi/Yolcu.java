
import java.util.Scanner;

public class Yolcu implements YurtdisiKurallari {
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

    @Override
    public boolean yurtdisiHarciKontrol() {
        if(this.harc<15){
            System.out.println("Lutfen yurt disi cikis harcini yeterli miktarda yatirin!");
            return false;
        }else{
            System.out.println("Harc islemi tamamlandi.");
        }
        return true;
    }

    @Override
    public boolean siyasiYasakKontrol() {
        if(this.siyasiYasak == true){
            System.out.println("Siyasi yasaginiz bulunuyor!");
            return true;
        }else{
            System.out.println("Herhangi bir siyasi yasaginiz bulunmuyor.");
        }
        return false;
    }

    @Override
    public boolean vizeDurumuKontrol() {
        if(this.vize == true){
            System.out.println("Vize islemleriniz basariyla tamamlanmis.");
            return true;
        }else{
            System.out.println("Gideceginiz ulkeye vizeniz bulunmuyor!");
        }
        return false;
    }


}
