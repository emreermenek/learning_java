public class Idman{
    
    private int burpeeSayisi;
    private int pushupSayisi;
    private int squadSayisi;
    private int situpSayisi;


  

    public Idman(int burpeeSayisi, int pushupSayisi, int squadSayisi,int situpSayisi) {
        this.burpeeSayisi = burpeeSayisi;
        this.pushupSayisi = pushupSayisi;
        this.squadSayisi = squadSayisi;
        this.situpSayisi = situpSayisi;
    }

    public int getBurpeeSayisi() {
        return burpeeSayisi;
    }

    public void setBurpeeSayisi(int burpeeSayisi) {
        this.burpeeSayisi = burpeeSayisi;
    }



    public int getpushupSayisi() {
        return pushupSayisi;
    }



    public void setpushupSayisi(int pushupSayisi) {
        this.pushupSayisi = pushupSayisi;
    }



    public int getSquadSayisi() {
        return squadSayisi;
    }

    public void setSquadSayisi(int squadSayisi) {
        this.squadSayisi = squadSayisi;
    }

    public void setSitUpSayisi(int sitUpSayisi) {
        this.situpSayisi = sitUpSayisi;
    }

    public int getSitUpSayisi() {
        return situpSayisi;
    }

    public void hareketYap(String hareketTuru,int sayi){
        switch (hareketTuru) {
            case "burpee" -> burpeeYap(sayi);
            case "pushup" -> pushupYap(sayi);
            case "squad" -> squadYap(sayi);
            case "situp" -> situpYap(sayi);
            default -> System.out.println("Boyle bir hareket yok!");
        }
    }


    public void burpeeYap(int sayi){
        if(burpeeSayisi==0){
            System.out.println("Yapacak burpee kalmadi..");
        }
        if(burpeeSayisi<sayi){
            System.out.println("Hedefledigin burpee sayisini gectin!\nTebrikler!!!");
            burpeeSayisi = 0;
            System.out.println("Kalan burpee sayisi: "+ burpeeSayisi);
        }else{
            burpeeSayisi -= sayi;
            System.out.println("Kalan burpee sayisi: "+ burpeeSayisi);
        }
    }

    public void pushupYap(int sayi){
        if(pushupSayisi==0){
            System.out.println("Yapacak burpee kalmadi..");
        }
        if(pushupSayisi<sayi){
            System.out.println("Hedefledigin burpee sayisini gectin!\nTebrikler!!!");
            pushupSayisi = 0;
            System.out.println("Kalan burpee sayisi: "+ pushupSayisi);
        }else{
            pushupSayisi -= sayi;
            System.out.println("Kalan burpee sayisi: "+ pushupSayisi);
        }
    }

    public void squadYap(int sayi){
        if(squadSayisi==0){
            System.out.println("Yapacak burpee kalmadi..");
        }
        if(squadSayisi<sayi){
            System.out.println("Hedefledigin burpee sayisini gectin!\nTebrikler!!!");
            squadSayisi = 0;
            System.out.println("Kalan burpee sayisi: "+ squadSayisi);
        }else{
            squadSayisi -= sayi;
            System.out.println("Kalan burpee sayisi: "+ squadSayisi);
        }
    }

    public void situpYap(int sayi){
        if(situpSayisi==0){
            System.out.println("Yapacak burpee kalmadi..");
        }
        if(situpSayisi<sayi){
            System.out.println("Hedefledigin burpee sayisini gectin!\nTebrikler!!!");
            situpSayisi = 0;
            System.out.println("Kalan burpee sayisi: "+ situpSayisi);
        }else{
            situpSayisi -= sayi;
            System.out.println("Kalan burpee sayisi: "+ situpSayisi);
        }
    }

    public boolean idmanBittiMi(){
        return (burpeeSayisi==0)&&(pushupSayisi==0)&&(squadSayisi==0)&&(situpSayisi==0);
    }
}