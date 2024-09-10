


public class arrayler_ve_arraylarin_ozellikleri {

    public static void arrayiYazdir(int[] a){
        for(int i = 0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

    public static double ortalamaBul(int[] a){
        int toplam = 0;
        for(int i = 0;i<a.length;i++){
            toplam += a[i];
        }
        return toplam/a.length;
    }

    public static void main(String[] args) {
        //arraylar sayesinde birden fazla degeri tek referansta tasiyabiliriz/depolayabiliriz.
        // int[] a = new int[10];
        //bellekte 10 tane int alacak bir array olusturduk ve a referansimiz bunlari gosteriyor.
        //icerisindeki degerlere ulasmak icin indexleri kullanicaz:
        //0 1 2 3.. seklinde (0. index 1. degerdir)
        // a[5] = 32;
        // a[9] = 50;
        //Bunun daha kolayi arrayi tanimlarken degerleri atamaktir:
        // int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // System.out.println(a[0]);
        // int[] a = new int[5];
        // for(int i = 0; i<5;i++){
        //     a[i] = (i+1)*6;
        //     System.out.println(a[i]);
        // }
        // Scanner sc = new Scanner(System.in);
        // int[] a = new int[3];
        // for(int i = 0;i<3;i++){
        //     a[i] = sc.nextInt();
        //     System.out.println(a[i]);
        // }
        int[] a = {1,2,3};
        System.out.println("Arrayin uzunlugu: "+a.length);
        arrayiYazdir(a);
        System.out.println(ortalamaBul(a));
    }
}
