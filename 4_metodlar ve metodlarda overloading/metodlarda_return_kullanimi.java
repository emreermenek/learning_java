public class metodlarda_return_kullanimi {

    public static int ikiilecarp(int a){
        return a*2;
    }
    public static int deneme(int a){
        System.out.println("Cikti veriliyor..");
        return a*2;
    }
    public static void main(String[] args) {
        //return fonksiyonu bitiren koddur, devamindaki hicbir satir calismaz
        System.out.println("iki ile iki kere carp = " + ikiilecarp(ikiilecarp(2)));
        System.out.println("Sonuc = " + deneme(2));
    }
}
