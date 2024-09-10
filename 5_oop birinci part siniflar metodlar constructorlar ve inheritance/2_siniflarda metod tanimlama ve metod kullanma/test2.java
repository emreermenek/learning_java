public class test2 {
    public static void main(String[] args) {
        Arabam araba1 = new Arabam();
        araba1.setModel("Volkswagen");
        System.out.println(araba1.getModel());

        //Arabam araba2;
        //araba2.setModel("Ford");
        //daha araba2 nin sadece referansini olusturup objesini tanimlamadigimiz icin hata verecektir yukarda.

        // Arabam araba2 = null;
        // araba2.setModel("Ferrari");
        //bu sefer calistirmamiza izin verir ama calistirirsak null pointer exception aliriz 

    }
}
