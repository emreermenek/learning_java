public class Main {
    public static void main(String[] args) {
        System.out.println("Adnan Menderes Havalimanina Hosgeldiniz: ");
        String sartlar = """
                Yurtdisina cikmak icin sartlar:
                1-Yurt disi harcini yatirilacak.(15tl)
                2- Siyasi yasak bulunmayacak.
                3- Gidilecek ulkeye vize cikartilacak.
                """;
        String message = "Yurtdisi cikis sartlarinin hepsini yerine getirmeniz gerekiyor!";
        
        while(true){
            System.out.println("------------------------------");
            System.out.println(sartlar);
            System.out.println("------------------------------");
            Yolcu yolcu = new Yolcu();

            System.out.println("Yurtisi cikis harci kontrol ediliyor..");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            if(yolcu.yurtdisiHarciKontrol()==false){
                System.out.println(message);
                continue;
            }
            System.out.println("Siyasi yasak var mi kontrol ediliyor..");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            if(yolcu.siyasiYasakKontrol()==true){
                System.out.println(message);
                continue;
            }
            System.out.println("Vize durumu kontrol ediliyor..");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            if(yolcu.vizeDurumuKontrol()==false){
                System.out.println(message);
                continue;
            }
            System.out.println("Yurtdisina cikabilirsiniz..");
            break;
            
        }
    }
}
