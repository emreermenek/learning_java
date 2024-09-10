public class Test {
    public static void main(String[] args) {
        //interface -> arayuz/arabirim
        //interfaceler coklu kalitim(inheritance) yapmak icin kullanilir.
        //interface'in metodlarinin kod bloklari yazilmaz.
        //interface e uyan butun classlarin bu metodlari 
        //tek tek kendi classlari icerisinde yazmasi gerekiyor 
        //bu anlamda interfaceler sozlesme gorevi goruyor..
        //interfaceler normal class gibi olmadigi icin obje olusturamazdik fakat
        //bu interface e uyan classlarimiza referans olabliriz.
        //icerisinde sadece final ve static degiskenler bulunabiliyor.
        //java da bir class birden fazla interface'i implement edebiliyor.

        //IMuhendis muhendis = new IMuhendis(); bu sekilde tanimlayamayiz.
        
        //PCMuhendisi pcMuhendisi = new PCMuhendisi(false, false); ya da
        // IMuhendis pcMuhendisi = new PCMuhendisi(false, false);
        // pcMuhendisi.adliSicilSorgula();
        // pcMuhendisi.askerlikDurumuSorgula();
        // System.out.println(pcMuhendisi.mezuniyetOrtalamasi(3.07));
        // String[] tecrube = {"Aselsan","Havelsan","Roketsan","Bombasan"};
        // pcMuhendisi.isTecrubesi(tecrube);


        String[] tecrube = {};
        String[] referans = {"Mbappe","Romulo","Osimhen"};
        MakineMuhendisi makineMuhendisi = new MakineMuhendisi(true, false);
        //ama eger soyle yapsaydik:
        // IMuhendis makineMuhendisi = new MakineMuhendisi(true, false);
        makineMuhendisi.referansGetir(referans);
        //referansGetir() metodu hata verir cunku onu interface de olmamasina ragmen yazdik fakat
        //asagidaki gibi yazarsak MakineMuhendisi clasindan bunu alir ve hata duzelir.(buna metod donusumu denir.)
        // ((MakineMuhendisi)makineMuhendisi).referansGetir(referans);
        makineMuhendisi.adliSicilSorgula();
        makineMuhendisi.askerlikDurumuSorgula();
        System.out.println(makineMuhendisi.mezuniyetOrtalamasi(2.3));
        makineMuhendisi.isTecrubesi(tecrube);
        makineMuhendisi.calis();
        
    }
}
