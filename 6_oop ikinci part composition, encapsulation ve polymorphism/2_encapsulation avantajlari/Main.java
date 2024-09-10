public class Main {
    public static void main(String[] args) {
        // Abone abone = new Abone();
        // abone.bakiye = 200;
        // abone.isim = "Emre";
        // abone.sehir = "Izmir";
        // abone.dogalgazKullan(200);
        // /*
        //     Encapsulation yapmamanin yol acabilecegi sorunlar:
        //     1-bakiye limiti 120 olmasina ragmen 200 verebildik, kontrolsuzluk olustu.
        //     2-eger classin daha fazla degeri olsa degerleri ayri ayri atadigimiz icin hatalara acik olacak
        //     3-Bir tane ozelligin ismini degistirdigimiz anda onu kullanan her yerden ismini degistirmemiz gerekecek 
        // */

        //encapsulation kullanilan versiyon: 
        //GelismisAbone gelismisAbone = new GelismisAbone(); constructor sayesinde bos birakmamiza java izin vermedigi icin
        //2. dezavantaj yok oldu
        GelismisAbone gelismisAbone = new GelismisAbone("Emre", 200, "Izmir");
        gelismisAbone.bakiyeOgren(); // bakiye 120 gosterir.
        //cunku kontrol ettik olusturken ve 120 sinirini gecmesini engelledik. Boylece 1. dezavantaj yok oldu..
        //3. dezavantajimiz ise artik bir degisken ismini classta degistirisek sadece constructor da da degistirmemiz yetecek
        //ve herhangi bir hata almayacagiz.

    }
}

//Bir sinifin detaylarini ozelliklerini baska sinifa gizlemektir.
//biz de bunun icin bir sinifin ozelliklerini public yapmak yerine private yapiyoruz.