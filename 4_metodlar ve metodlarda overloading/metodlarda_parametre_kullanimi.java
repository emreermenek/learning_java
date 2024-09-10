public class metodlarda_parametre_kullanimi {

    public static void selamlama(String isim){
        System.out.println("Selamlar "+ isim);
    }

    public static void toplama(int a,int b,int c){
        System.out.println("Toplami = " + (a+b+c));
    }
    public static void main(String[] args) {
        
        selamlama("Emre");
        toplama(1, 2, 3);
    }
}
