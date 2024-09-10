public class Main {
    public static void main(String[] args) {
        //abstract classlar inheritance la interface arasinda bi ozellik tasir:
        //ayni interfaceler gibi abstract classlardan da obje olusturamiyoruz.
        //hem govdeli hem govdesiz metodlar ayni anda bulunuyor.
        //abstract class a ozellik ekleniyor.
        //bir classin abstract olmasi demek en az bir govdesiz metodu bulunuyor demek.

        Sekil kare = new Kare("Kare", 5); // veya
        //Kare kare = new Kare("Kare", 5);
        Sekil daire = new Daire("Daire", 3); //veya
        //Daire daire = new Daire("Daire", 3);

        kare.alanHesapla();
        daire.alanHesapla();
        kare.isminiSoyle();
        daire.isminiSoyle();


    }
}
