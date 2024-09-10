
import java.util.Arrays;
import java.util.Scanner;

public class arrayleri_siralamak_kopyalamak_array_sinifi_ek_detaylar {

    public static int[] arrayiDoldur(int boyut){
        Scanner sc = new Scanner(System.in);
        int[] array = new int[boyut];
        System.out.println(boyut+" tane sayi alacak arrayi doldurun:");
        for(int i=0;i<boyut;i++){
            System.out.print((i+1)+". indexi giriniz: ");
            array[i] = sc.nextInt();
        }
        sc.close();
        return array;
    }

    public static void sortArray(int [] array){
        Arrays.sort(array);
        arrayiBastir(array);
    }

    public static void arrayiBastir(int[] array){
        for(int i =0;i<array.length;i++){
            System.out.println((i+1) + ". index = "+array[i]);
        }
    }
    public static void main(String[] args) {
        // int[] a = arrayiDoldur(5);
        // arrayiBastir(a);
        // sortArray(a);

        int[] a1 = {1,2,3,4,5,6};
        int[] a2 = {1,2,3,4,5,6};

        if(a1==a2){  //Burada bellekte gosterdikleri yer ayni mi diye kontrol eder bu sebeple esit degildir doner!
            System.out.println("Esitler");
        }else{
            System.out.println("Esit degiller..");
        }

        if(Arrays.equals(a1, a2)){  //boylece iki arrayin icini kiyaslayabilirz.
            System.out.println("Esitler");
        }else{
            System.out.println("Esit degiller..");
        }

    }
}
