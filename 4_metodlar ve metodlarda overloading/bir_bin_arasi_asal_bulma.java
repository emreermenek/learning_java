public class bir_bin_arasi_asal_bulma {

    public static boolean asalMi(int sayi){
        for(int i =2;i<sayi;i++){
            if(sayi % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("1-1000 arasi asal sayilar: ");
        for(int i = 1;i<=1000;i++){
            if(asalMi(i)){
                System.out.println(i);
            }
        }
    }
}
