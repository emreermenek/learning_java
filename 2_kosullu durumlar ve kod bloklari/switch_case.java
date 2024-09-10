import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        /* 
         switch(durumlar){
            case durum1:
                islem1;
                break;
            case durum2:
                islem2;
                break;
            default:
                defaultislem;
                break; 
        }
        */
        Scanner sc = new Scanner(System.in);
        int islem = sc.nextInt();

        switch(islem){
            case 1:
                System.out.println("1. islem");
                break;
            case 2:
                System.out.println("2. islem");
                break;
            case 3:
                System.out.println("3. islem");
                break;
            case 4:
                System.out.println("4. islem");
                break;
            default:
                System.out.println("default islem");
                break;
                //break kullanmayınca sıradaki case e de girer.
        }
        //aynisini şu şekilde de yazabiliriz. boyle yapinca otomatik break koyar. rule switch denir.
        // switch(islem){
        //     case 1 -> System.out.println("1. islem");
        //     case 2 -> System.out.println("2. islem");
        //     case 3 -> System.out.println("3. islem");
        //     case 4 -> System.out.println("4. islem");
        //     default -> System.out.println("default islem");
        // }
    }
}
