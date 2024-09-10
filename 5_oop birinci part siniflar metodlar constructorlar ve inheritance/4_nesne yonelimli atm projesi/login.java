import java.util.Scanner;

public class login {
    public boolean giris(hesap hesap,Scanner sc){
        System.out.print("Kullanici adinizi giriniz: ");
        String kullaniciAdi = sc.nextLine();
        System.out.print("Sifrenizi giriniz: ");
        String sifre = sc.nextLine();
        if(kullaniciAdi.equals(hesap.getKullaniciAdi())&&sifre.equals(hesap.getSifre())){
           return true;
        }else{
            System.out.println("Kullanici adi ya da sifresi hatali!");
        }

        return false;
    }    
}
