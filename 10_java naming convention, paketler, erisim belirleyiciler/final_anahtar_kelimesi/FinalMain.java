public class FinalMain {
    public static void main(String[] args) {
        /*

            ->final anahtar kelimesi ile tanimlanan bir ozelligin degeri sadece
            bir defa belirlenebiliyor. 

            ->Bu deger sadece tanimlanirken ya da obje olusturulurken yani 
            constructor'in icinde verilebiliyor.

            ->Degistirilmesini istemedigimiz degerler icin kullanabiliriz.

        */

        FinalTest finalTest = new FinalTest("Emre");
        FinalTest finalTest2 = new FinalTest("Mert");
        System.out.println("Obje Sayisi: "+ finalTest.objeSayisi);
        System.out.println("Obje Sayisi: "+ finalTest2.objeSayisi);
        /*  

            Cikti:
            Obje Sayisi: 1
            Obje Sayisi: 2

            ilk objeyi olusturunca static say metodu olusturuldu.
            say metodu constructorda +1 arttirilip final objeSayisina esitlendi.
            ikinci obje olusturulunca static say tekrar olusturulmadi 
            zaten vardi ve degeri 1 arttirilmisti.
            Final objeSayisi ise 2. obje icin tekrar olusturuldu ve degeri 1 daha artan
            say referansina esitlendi..

        */


        System.out.println(Math.PI);
        //Math.PI = 3; final oldugu icin yapamayiz.

        System.out.println("Database username: "+ Databass.userName);
        System.out.println("Database password: "+ Databass.password);
    }
}
