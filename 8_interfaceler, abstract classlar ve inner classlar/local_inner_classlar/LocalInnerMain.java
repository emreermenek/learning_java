
import java.util.Scanner;

public class LocalInnerMain {
    public static void main(String[] args) {
        //Local inner classlar metodlarin bir uyesidir. Baska metodlardan erisilemez, metoda ozgudur.
        //public static kullanamayiz

        class Alan{
            public void daireAlani(){
                Scanner sc = new Scanner(System.in);
                System.out.print("Yaricapi giriniz: ");
                int r = sc.nextInt();
                System.out.println(r+" yaricapli dairenin alani = "+(r*r*Math.PI));
            }
        }

        Alan alan = new Alan();
        alan.daireAlani();

        //bir classi sadece bir metodda kullancaksak kullanimi mantiklidir.

    }
    // public static void alaniKullan(){ //baska metoddan veya classtan erisemeyiz.
    //     Alan alan = new Alan();
    // }
}
