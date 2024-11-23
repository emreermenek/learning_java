
public class Main {
    public static void main(String[] args) {
        // ListWorker worker = new ListWorker();
        // long baslangic = System.currentTimeMillis();

        // worker.degerAta();

        // long bitis = System.currentTimeMillis();

        // System.out.println("Gecen sure: "+(bitis-baslangic));

        //simdi yukaridaki islemin suresini yariya indiricez 2 thread kullanarak:

        ListWorker worker = new ListWorker();
        worker.calistir();

        

    }
}
