public class KapsamSinifi {
    private int privateDegisken = 30;

    public KapsamSinifi(){
        int privateDegisken = 20;
        //boyle dersek 20yi alir cunku ilk en lokali gorur.
        System.out.println("privateDegisken = "+privateDegisken); 
        //ama soyle dersek 30 u alir:
        System.out.println("privateDegisken = "+this.privateDegisken);
    }

    public void carp(){
        //java en lokal degiskeni kullanir mesela burada metod icindeki privateDegiskeni alir.
        int privateDegisken = 10;
        System.out.println("Lokal privateDegisken: "+privateDegisken);
        for(int i=1;i<4;i++){
            System.out.println(i+" x "+privateDegisken+" = "+ (privateDegisken*i));
        }
    }

}
