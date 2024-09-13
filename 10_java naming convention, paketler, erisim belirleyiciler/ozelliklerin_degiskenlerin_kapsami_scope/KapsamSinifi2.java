public class KapsamSinifi2 {
    private int privateDegisken = 30;

    public KapsamSinifi2(){
    }

    public void dahiliSinifKontrol(){
        DahiliSinif dahiliSinif = new DahiliSinif();
        System.out.println("Kontrol ediliyor: "+dahiliSinif.a);
        //private olmasina ragmen a'ya erisebildik 
        // cunku a degeri KapsamSinifi2'nin inner classi
        //yani tabi ki mainden veya baska bir classtan erismemiz mumkun degil.
    }

    public class DahiliSinif{
        private int privateDegisken = 20;
        private int a = 3;

        public void yazdir(){
            int privateDegisken = 10;
            System.out.println("Lokalden genele dogru private degiskenler: ");
            System.out.println("Methodun icindeki privateDegisken: "+privateDegisken);
            System.out.println("DahiliSinif'in icindeki privateDegisken: "+this.privateDegisken);
            System.out.println("KapsamSinifi2'nin icindeki privateDegisken: "+KapsamSinifi2.this.privateDegisken);
           
        }
    }
}
