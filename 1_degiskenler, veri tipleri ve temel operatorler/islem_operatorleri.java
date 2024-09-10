public class islem_operatorleri {
    public static void main(String[] args) {
        //toplama
        int a = 3;
        int b = a + 2; 
        b += 2;
        //çıkarma;
        b -= 2;
        b = b - 2;
        //bölme
        double c = b/7;
        c /= 2;
        //çarpma
        c *= b;
        c = c *b;
        //kalan
        c %=b;
        c = c%b;

        System.out.println(a);
        System.out.println(--a);//çıkar sonra a yı işleme al
        System.out.println(a--);//çıkar sonra a yı işleme al
        System.out.println(a);

        System.out.println(a);
        System.out.println(++a);//topla sonra a yı işleme al
        System.out.println(a++);//topla sonra a yı işleme al
        System.out.println(a);



    }
}
