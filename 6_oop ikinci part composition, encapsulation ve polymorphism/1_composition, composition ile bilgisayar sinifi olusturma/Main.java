public class Main {
    public static void main(String[] args) {
        Resolution resolution = new Resolution(1920, 1080);
        Monitor monitor = new Monitor("VG249QL3A", "ASUS", "24", resolution);
        Kasa kasa = new Kasa("MAG FORGE M100A D60", "MSI", "AKRİLİK YAN PANEL");
        Anakart anakart = new Anakart("H610M-E", "ASUS", 6, "Windows");
        Bilgisayar bilgisayar = new Bilgisayar(kasa, monitor, anakart);
        bilgisayar.getKasa().bilgisayariAc();
        bilgisayar.getMonitor().monitoruKapat();
        bilgisayar.getAnakart().isletimSistemiYukle("Kali Linux");
    }
}

//composition da HAS-A iliskisi vardir:
//ornegin bir bilgisayar toplamak icin ram, cpu, gpu, bellek, guc kaynagi aliyoruz,
//bunlar bilgisayari olusturuyor, computer has a ram diyebildigimiz icin bu tarz iliskilere,
//HAS-A iliskisi diyoruz.

//bu ornekte:
/*
 bilgisayar'in icinde -> 1 tane kasa objesi
                      -> 1 anakart objesi
                      -> 1 monitor objesi olacak
 monitor'un icinde -> 1 resolution objesi olacak
*/

