
public class testo {
    public static void main(String[] args) {
        Yonetici yonetici = new Yonetici("Ismail Kartal",1,"Teknik Direktor",11);
        yonetici.bilgileriGoster();
        yonetici.calis();
        yonetici.departmanDegistir("Kaloriferci");
        yonetici.bilgileriGoster();
        yonetici.zamYap(15);
    }
}

//inheritance bir classin ozelliklerini baska classlarin da kullanmasidir.
//ornegin ayni sirketteki yonetici isci ve patronlarin benzer ozellikleri olabilir,
//ayni ozelliklerin bir classtan hepsinde kullanilmasi inheritance ornegidir.
//manager is a employe IS-A iliskisi olan bir inheritance dir