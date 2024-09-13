

public class Aciklama {
 
        /*

            Access Modifiers - Erisim Belirleyiciler

            Erisim Belirleyiciler 2 duzeyde erisim belirlerler.

            Sinif Duzeyinde Erisim Belirleyiciler:

            ->public: Bir class eger public yazilmissa bu classa paketin icindeki ve
                      paketin disindaki tum classlar tarafindan erisilir.

            ->default: default erisim belirleyici kullanmamak anlamina gelir.
                       Eger bir class hicbir erisim belirleyici kullanmadan yazilmissa, 
                       bu classa sadece ayni paketin icindeki classlar erisebilir. 
                       Paketin disindaki classlar bu classa erisemez.
            
            *** protected, private erisim belirleyiciler classlar icin kullanilamazlar.

            Method ve Ozellik Duzeyinde Erisim Belirleyiciler:

            ->public: Eger bir metod veya ozellik(class member veya alan) public olarak 
                      tanimlanmissa, bu alana paketin icindeki ve disindaki tum classlar
                      erisilebilir. Ancak tabii ki bu alanin icinde bulundugu classin da
                      erisilebilir olmasi gerekir.

            ->default: Eger bir metod veya ozellik tanimlanirken hicbir erisim belirleyici
                       kullanilmamissa bu alana sadece kendi paketindeki classlar erisebilir.
            
            ->protected: Eger bir metod veya ozellik(class member veya alan) public olarak
                         tanimlanmissa, bu alana ayni paketin icindeki diger classlar tarafindan
                         erisilebilir. Paketin disindaki classlar ise sadece ve sadece bu alanin 
                         bulundugu classin bir alt classiysa erisebilir.
            
            ->private: Eger bir alan private olarak tanimlanmissa bu alana sadece kendi classi
                       erisebilir.

            
            Daha onceden ogrendigimiz gibi bir metodun icinde tanimlanmis degiskenler lokal degisken
            olarak tanimlanirlar. Yani, bu degiskenlere diger metodlardan ve classlardan erisilemez.
            Bundan dolayi bu degiskenlere access modifier eklenemez.
 
        */

        // Daha detay bilgi icin: https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
    
}
