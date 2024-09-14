//classi final yaptigimiz icin artik hicbir sinif bu classi inherit edemez.
public final class Database {
    //metodda final kullanirsak bu metodu override edemeyecegimiz anlamina gelir.
    public final void baglantiKur(final String username, final String password){
        //burada username e bir deger verirsek ne olur?
        //username = "root2";
        //bu sefer kullanicinin gonderdigi username gecersiz kalacaktir.
        //bunu degisken basinda final kullanarak engelleriz: final String username
        System.out.println(username);
        System.out.println(password);
    }
}
