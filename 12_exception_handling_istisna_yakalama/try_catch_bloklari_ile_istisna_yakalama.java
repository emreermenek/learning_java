
public class try_catch_bloklari_ile_istisna_yakalama {
    public static void main(String[] args) {
        /* 
            try{
                // Exception olusturabilecek Kodlar    
            }

            catch(ExceptionTuru e){
                // Exception Durumunda Yapilacak Islemler
            }
        */

        // int a = 30/0; //unchecked exception

        // int[] a = {1,2,3,4};

        // System.out.println(a[6]); yine unchecked exception

        try {
            // int a = 30 / 0; // ArithmeticException

            int[] b = {1,2,3,4};

            System.out.println(b[6]);
            
        } catch (ArithmeticException e) {
            System.out.println("Bu sayi 0 a bolunemez.");
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Arrayin boyunu astiniz..");
        } 
        // catch(RuntimeException e){
        //     e.printStackTrace();
        // }

        System.out.println("Burasi calisiyor..");
    }
}
