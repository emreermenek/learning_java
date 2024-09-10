public class byte_short_int_long {
    public static void main(String[] args) {
        //int 32 bit yani 4 byte yer kaplar
        int a = 1; //-2^31 ile 2^31-1 arasında değer alabilir.
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        byte b = 3; //8 bit yer kaplar
        System.out.println(Byte.MAX_VALUE); //127 ile -128 arası değr alır
        System.out.println(Byte.MIN_VALUE);
        short c = 4; //16 bit yer kaplar.
        System.out.println(Short.MAX_VALUE); 
        System.out.println(Short.MIN_VALUE);
        long d = 5; //64 bit
        System.out.println(Long.MAX_VALUE); 
        System.out.println(Long.MIN_VALUE);

        //byte -> short -> int -> long

        short j = 1000;
        int i = j/2; 
        int k = j;
        //java otomatik j yi int değere çevirir.
        byte ab = 100;
        //byte ba = (ab/2) int sonucu kendi otomatik byte a dönüştüremez.
        byte ba = (byte)(ab/2);
        
        byte f = 1;
        short g = 2;
        int h = 3;
        long l = f + g + h;
        //java otomatik dönüştürmeyi yaptı yukarda verilen sırada yapabilir tersine otomatik yapamaz kısaca.
        
    }
}
