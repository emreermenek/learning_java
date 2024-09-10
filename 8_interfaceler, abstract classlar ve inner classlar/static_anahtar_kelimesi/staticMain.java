public class staticMain {
    public static void main(String[] args) { // buradaki static i kaldirirsak proje olusurken main i olusturmaz ve program calismaz
        //ozellik ve metodlarimizi static anahtar kelimesiyle yazdıgımızda artik o method ve ozellikler,
        //objeye bagli degil dogrudan class uzerinden erisilebilir hale gelir.
        //program calistigi anda bellekte direk olusurlar ancak tek sefer olusurlar.

        Seyirci seyirci1 = new Seyirci("Cafer");
        Seyirci seyirci2 = new Seyirci("Emre");

        System.out.println("Seyirci sayisi: "+Seyirci.seyirciSayisi);
        System.out.println("Seyirci sayisi: "+seyirci1.getSeyirciSayisi());
        System.out.println("Seyirci sayisi: "+seyirci2.getSeyirciSayisi());

        selamla(); //static metod oldugu dogrudan kullanabildik.
        
    }

    public static void selamla(){
        System.out.println("Selamlama....");
    }
}
