public class AnonimInnerMain {
    public static void main(String[] args) {
        /*
            herhangi bir class tanimlama olmadan obje olusturabiliriz.
            interface ya da abstract class imizdan obje olusturmak istersek,
            anonim inner class kullaniriz.
        */

        IOgrenci ogrenci = new IOgrenci() {

            @Override
            public void dersCalis() {
                System.out.println("Ders calisiyorum.");
            }

            @Override
            public void derseGir() {
                System.out.println("Derse giriyorum.");
            }
            
        };

        ogrenci.dersCalis();
        ogrenci.derseGir();

        AOgrenci ogrenci2 = new AOgrenci("Emre",20) {

            @Override
            void kayitYaptir() {
                System.out.println("Kayit yaptiriliyor..");
                System.out.println("Isim: "+ getIsim() + "\nYas: "+getYas());
            }
            
        };

        ogrenci2.kayitYaptir();
        ogrenci2.selamla(); //normal metodu da gordu
        System.out.println( ogrenci2.getIsim());
        System.out.println( ogrenci2.getYas());
    }
}
