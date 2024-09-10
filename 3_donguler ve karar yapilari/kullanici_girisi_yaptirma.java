import java.util.Scanner;

public class kullanici_girisi_yaptirma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userName = "Emre";
        String password = "emret";
        String nameEntry = "";
        String passwordEntry = "";
        System.out.println("************************\nKullanici Girisi\n************************");
        do { 
            System.out.print("Kullanici ismi girin: ");
            nameEntry = sc.nextLine();
            if(!userName.equals(nameEntry)){
                System.out.println("Yanlis girdiniz! Tekrar deneyin!!!");
            }
        } while (!userName.equals(nameEntry));
        do { 
            System.out.print("Sifreyi girin: ");
            passwordEntry = sc.nextLine();
            if(!password.equals(passwordEntry)){
                System.out.println("Yanlis girdiniz! Tekrar deneyin!!!");
            }
        } while (!password.equals(passwordEntry));
        System.out.println("Giris yaptiniz tebrikler..");

    }
}
