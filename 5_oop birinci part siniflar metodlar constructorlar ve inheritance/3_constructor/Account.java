public class Account {
    
    private String hesapNo;
    private double bakiye;
    private String isim;
    private String email;
    private String telefonNo;

    // public Account(){
    //     //bos yaratir
    // }

    public Account(String isim, String email,String telefonNo){
        // hesapNo = "111111";
        // bakiye = 1000;
        // this.isim = isim;
        // this.email = email;
        // this.telefonNo = telefonNo;
        // veya
        this("111111",1000,isim,email,telefonNo);
    }

    public Account(){
        //default deger aticaz
        // hesapNo = "111111";
        // bakiye = 1000;
        // isim = "Emre Ermenek";
        // email = "emreermenek1234@gmail.com";
        // telefonNo = "5309448903";
        //aynisini diger methodu kullanarak da yapabiliriz.
        this("111111",1000,"Meto Lal","ester@gmail.com","1231231212");
    }

    public Account(String hesapNo, double bakiye, String isim, String email, String telefonNo){
        this.hesapNo = hesapNo;
        this.bakiye = bakiye;
        this.isim = isim;
        this.email = email;
        this.telefonNo = telefonNo;
    }

    public void bilgileriGoster(){
        System.out.println("Hesap no: "+hesapNo);
        System.out.println("Bakiye: "+bakiye);
        System.out.println("Isim: "+isim);
        System.out.println("Email: "+email);
        System.out.println("Telefon No: "+telefonNo);
    }

    public void paraYatir(double miktar){
        bakiye += miktar;
        System.out.println("Yeni bakiye: "+bakiye);
    }
    public void paraCek(double miktar){

        if(miktar > 5000){
            System.out.println("Tek seferde 5000tl den fazla para cekemezsiniz!");
        }
        if(bakiye-miktar<0){
            System.out.println("Bakiye yetersiz!\nBakiye: "+bakiye);
        }else{
            bakiye -= miktar;
            System.out.println("Yeni bakiye: "+bakiye);
        }

    }

    public String getHesapNo() {
        return hesapNo;
    }
    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }
    public double getBakiye() {
        return bakiye;
    }
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }
    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefonNo() {
        return telefonNo;
    }
    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }


}
