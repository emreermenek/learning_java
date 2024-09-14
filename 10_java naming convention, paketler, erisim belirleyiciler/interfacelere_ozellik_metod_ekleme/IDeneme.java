public interface IDeneme {
    //private int a = 4; interface de private alan tanimlayamayiz.
    //cunku constructor veya metodsuz kullanamayiz private'i ve interface icine
    //ne constructor ne metod yazabiliriz..
    public int a = 4;
    //ayni sekilde public bir alani deger vermeden de tanimlayamayiz cunku
    //gene tamamamen ulasilamaz ve kullanilamaz halde olur.
    //public int b;

    //aslinda java a degerini direk static e cevirdi hatta ayni zamanda final'a..


    // public void deneme(){
    //     System.out.println("Deneme");
    // } bu sekilde metod olusturursak hata aliriz cunku
    //bu tarz bir metodu kullanmanin tek yolu obje olusturup kullanmaktir fakat
    //bizim interface den obje olusturmamiz mumkun degildir ancak
    //static metod olusturursak dogrudan class uzerinden erisebildigimiz icin
    //hata almayiz:  
    public static void deneme(){
        System.out.println("Deneme");
    }
}
