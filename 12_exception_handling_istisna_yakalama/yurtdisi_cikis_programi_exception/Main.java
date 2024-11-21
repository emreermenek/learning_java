public class Main {
    public static void main(String[] args) throws InterruptedException {
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
           
            Thread.sleep(3000);
            try {
                yolcu.yurtdisiHarciKontrol();
            } catch (HarcException e) {
                e.printStackTrace();
                continue;
            }
            
            System.out.println("Siyasi yasak var mi kontrol ediliyor..");
            
            Thread.sleep(3000);
            try {
                yolcu.siyasiYasakKontrol();
            } catch (SiyasiException e) {
                e.printStackTrace();
                
                continue;
            }
          
            System.out.println("Vize durumu kontrol ediliyor..");
           
            Thread.sleep(3000);
            try {
                yolcu.vizeDurumuKontrol();
            } catch (VizeException e) {
               
                e.printStackTrace();
                continue;
            }
          
            System.out.println("Yurtdisina cikabilirsiniz..");
            break;
            
        }
    }
}
