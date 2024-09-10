import java.util.Scanner;



public class atm_main{
       
    public static void main(String[] args) {
        //Login Classi kullanici girisini kontrol eder.
        //Hesap Classi hesap islemlerini yapacak
        //ATM ise atmmizi calistiricak
        try(Scanner sc = new Scanner(System.in)){
            ATM atm = new ATM();
            atm.calis(sc);
        }

    }
}