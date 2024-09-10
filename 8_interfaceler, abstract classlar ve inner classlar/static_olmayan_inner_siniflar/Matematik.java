import java.util.Scanner;

public class Matematik {
    private double PI = Math.PI;

    public class Faktoriyel{ //Inner class
        public void faktoriyel(Scanner sc){
            System.out.print("Faktoriyeli alinacak sayiyi giriniz:");
            int sayi = sc.nextInt();
            sc.nextLine();
            int faktoriyeli = 1;
            for(int i = 2; i<= sayi;i++){
                faktoriyeli *= i;
            }
            System.out.println(sayi+" faktoryeli = "+ faktoriyeli);
        }
    }

    public class Asal{
        public boolean asalMi(int sayi){
            for(int i = 2;i<sayi;i++){
                if(sayi%i==0){
                    return false;
                }
            }
            return true;
        }
    }

    public class Alan{
        public class DaireAlan{
             //inner classlar private degiskenlere de erisebilir.
            public void daireninAlani(int r){
                System.out.println(r+" yaricapli dairenin alani = "+(PI*r*r));
            }
        }
    }
}
