
import java.util.Scanner;

public class Main {
    public static Kart[][] kartlar = new Kart[4][4];
    public static void main(String[] args) {
        try ( //4 satir 4 sutundan olusan bir tabloda her harften 2 tane olacak ve kullanici tahmin etmeye calisacak.
                Scanner sc = new Scanner(System.in)) {
            kartlar[0][0] = new Kart('A');
            kartlar[0][1] = new Kart('D');
            kartlar[0][2] = new Kart('F');
            kartlar[0][3] = new Kart('B');
            kartlar[1][0] = new Kart('C');
            kartlar[1][1] = new Kart('G');
            kartlar[1][2] = new Kart('G');
            kartlar[1][3] = new Kart('H');
            kartlar[2][0] = new Kart('B');
            kartlar[2][1] = new Kart('H');
            kartlar[2][2] = new Kart('A');
            kartlar[2][3] = new Kart('E');
            kartlar[3][0] = new Kart('F');
            kartlar[3][1] = new Kart('D');
            kartlar[3][2] = new Kart('C');
            kartlar[3][3] = new Kart('E');
            
            while (oyunBittiMi()==false) {
                oyunTahtasi();
                tahminEt(sc);
            }
        }
        
    }   

    public static void tahminEt(Scanner sc){
      
        System.out.print("1. kartin satir ve sutun degerini arada bosluk birakarak giriniz: ");
        int i1 = sc.nextInt();
        int j1 = sc.nextInt();
        kartlar[i1-1][j1-1].setTahmin(true);
        oyunTahtasi();
        System.out.print("2. kartin satir ve sutun degerini arada bosluk birakarak giriniz: ");
        int i2 = sc.nextInt();
        int j2 = sc.nextInt();
        if(kartlar[i1-1][j1-1].getDeger()==kartlar[i2-1][j2-1].getDeger()){
            kartlar[i2-1][j2-1].setTahmin(true);
        }else{
            kartlar[i1-1][j1-1].setTahmin(false);
        }

       
    }
    
    public static boolean oyunBittiMi(){
        for(int i = 0;i<4;i++){
            for(int j =0;j<4;j++){
                if(kartlar[i][j].isTahmin()==false){
                    return false;
                }
            }
        }
            return true;
    }
    public static void oyunTahtasi(){
        System.out.println("------------------------\n");
        System.out.println("    | 1 | 2 | 3 | 4 |\n    _________________\n");
        for(int i = 0;i<4;i++){
            System.out.print(i+1+"-> |");
            for(int j =0;j<4;j++){
                if(kartlar[i][j].isTahmin()){
                    System.out.print(" "+kartlar[i][j].getDeger()+" |");
                }else{
                    System.out.print(" X |");
                }
            }
            System.out.println("");
            System.out.println("    _________________\n");
        }
        System.out.println("\n------------------------");
    }
}
