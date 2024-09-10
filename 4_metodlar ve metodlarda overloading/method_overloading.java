public class method_overloading {


    public static void toplama(String a, String b){
        System.out.println(a+" "+b);
    }
    public static void toplama(int a, int b){
        System.out.println("Toplami = "+ (a+b));
    }
    public static void toplama(int a, int b,int c){
        System.out.println("Toplami = "+ (a+b+c));
    }
    public static void main(String[] args) {
        //bir fonksiyonu birden fazla kez tanimlamaya denir
        toplama(1, 2);
        toplama(1, 2, 3);
        toplama("Emre","Ermenek");
        
    }
}
