import java.util.Scanner;

public class gelismis_not_hesaplama {
    public static void main(String[] args) {
        /* 
        vize 1 ve 2 %30 ardan %60 etkileyecek
        final %40 etkileyecek.
        Sistem nota göre tavsiye verecek

         gelismis not hesaplama:
            toplam not(tn) >= 85 -> AA
            toplam not(tn) >= 80 -> BA
            toplam not(tn) >= 75 -> BB
            toplam not(tn) >= 70 -> CB
            toplam not(tn) >= 65 -> CC
            toplam not(tn) >= 60 -> DC
            toplam not(tn) >= 55 -> DD
            toplam not(tn) >= 50 -> DF
            toplam not(tn) < 45 -> FF
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("1. Vize notunuzu girin: ");
        double vize1 = sc.nextDouble();
        System.out.print("2. Vize notunuzu girin: ");
        double vize2 = sc.nextDouble();
        System.out.print("Final notunuzu girin: ");
        double finalnotu = sc.nextDouble();
        double not = vize1*(3/10.0) + vize2*(3/10.0) + finalnotu*(4/10.0);
        System.out.println(not);
        if(not>100||not<0){
            System.out.println("not 0 ile 100 arasinda olmalidir(Daha not giremion!)");
            
        }else{
            if(not>=85){
                System.out.println("AA");
                System.out.println("Kopya çektin kesin o yüzden kaliyorsun");
            }else if (not>=80) {
                System.out.println("BA");
                System.out.println("Naptin arkadasina mi cozdurdun");
            }else if (not>=75) {
                System.out.println("BB");
                System.out.println("Supheli");
            }else if (not>=70) {
                System.out.println("CB");
                System.out.println("Rekorunu kirdin tebrik ederim");
            }else if (not>=65) {
                System.out.println("CC");
                System.out.println("bu zekaya cok bile");
            }else if (not>=60) {
                System.out.println("DC");
                System.out.println("Discord mu kurcan cen");
            }else if (not>=55) {
                System.out.println("DD");
                System.out.println("Gectin ama bune olm kalaydin bari");
            }else if (not>=50) {
                System.out.println("DF");
                System.out.println("Gectin derrrrmisim");
            }else{
                System.out.println("FF");
                System.out.println("Adam ol calis");
            }
        }
      
        sc.close();
    }
}
