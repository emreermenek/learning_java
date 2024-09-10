public class Problem {
    
    public static class Matematik{
        public static void daireAlan(int r){
            System.out.println(r+" yaricapli dairenin alani = "+(Math.PI*r*r));
        }
        public static void ucgeninCevresiniHesapla(int a, int b, int c){
            System.out.println("Kenar uzunluklari "+a+", "+b+" ve "+c+" olan ucgenin cevresi = "+(a+b+c));
        }
    }

    public static class Fizik{

        public static void vektorCarpimi(Vec vec1, Vec vec2){
            int carpim = vec1.getI() * vec2.getI() + vec1.getJ() * vec2.getJ() + vec1.getK() * vec2.getK();
            System.out.println(vec1.getIsim()+" ile "+vec2.getIsim()+" vektorlerinin vektor carpimi = "+carpim);
        }

    }
}
