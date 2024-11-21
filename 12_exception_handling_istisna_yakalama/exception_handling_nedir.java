public class exception_handling_nedir {
    public static void main(String[] args) {
        /*
        
            Exception Handling (Hata ve Istisna Yakalama):

            -> Exception(Istisna), programlarimizin calisma zamaninda(runtime) normal akisini bozan olaylardir.

            -> Exception Handling(Istisna Yakalama) ise bu exceptionlarin yakalanmasi ve programlarimizin daha 
               guvenli calismasi icin gelistirilmis bir mekanizmadir.

            -> Exceptionlara ornek olarak Input Output hatalari, Veritabani baglanti hatasi ve Aritmetik hatalar verilebilir.

            ------------------------------------------------------------------------------------
            Exception ve Exception Handling Ornegi

            -Kod Parcacigi 1
            -Kod Parcacigi 2
            -Kod Parcacigi 3 //Exception Olustu
            -Kod Parcacigi 4
            -Kod Parcacigi 5

            -> 3. Kod parcaciginda olusabilecek herhangi bir exception sonucunda java calismasini durdurur ve
               4. ile 5. kod parcacigini calistirmaz. Ancak, Exception Handling mekanizmasi ile bu exception'i 
               yakalayip programimizi daha guvenli yazabiliriz.

            -----------------------------------------------------------------

            Exception Hiyerarsisi

                
                -----------------------------> Throwable <---------------------------------------
                |                                                                               |
                |                                                                               |
               Exception                                                                       Error
                |                                                                               |
                |--> IOException                                                                |--> StackOverflowError
                |                                                                               |
                |--> SQLException                                                               |--> VirtualMachineError
                |                                                                               |
                |--> ClassNot FoundException                                                    |--> OutOfMemoryError
                |
                |--> Runtime Exception
                         |
                         |--> ArithmeticException
                         |
                         |--> NullPointerException
                         |
                         |--> NumberFormatException
                         |
                         |--> IndexOutOfBoundsException
                                    |
                                    |--> ArrayIndexOutOfBoundsException


             -----------------------------------------------------------------

            Exception Turleri:

            -> Checked Exception: Runtime Exceptionlardan turemeyen her class "Checked Exception" kapsamina girer ve
               Java kodlarin exception firlatabilecegini ongorur. Bu hatalari yakalayamazsak Java bize bu hatalari
               yakalamamizi soyler. Ornek: IOException.SqlException

            -> UnChecked Exception: Runtime Exceptionlardan tureyen her class "Unchecked" kapsamina girer ve programi
               calistirmadan once kontrol edilemezler. Yani Java bu exception'i ongoremez. Hatalari yakalama programcinin
               sorumlugundadir. Ornek: ArithmeticException, NullPointerException

            Error: Geri donulmez ve tamir edilemeyen hatalardir. Ornek: OutOfMemoryError

            -------------------------------------------------------------------
            Exception Ornekleri

            *********
            String s = null;
            System.out.println(s.length());
            NullPointerException
            *********
            int b = 12/0; //ArithmeticException
            *********
            String s = "a12";
            int i = Integer.parseInt(s); //NumberFormatException
                                    
        */
    }
}
