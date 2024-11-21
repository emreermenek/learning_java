public class exceptionPropagation {

    public static void ucuncuFonksiyon(){
        int a = 12 / 0;
    }

    public static void ikinciFonksiyon(){
        ucuncuFonksiyon();
    }

    public static void birinciFonksiyon(){
        ikinciFonksiyon();
    }
    public static void main(String[] args) {
        /*
            Stacklerle beraber exceptionlarin ic ice metodlarla yakalanma mantigi:
            1.
            |       | 
            |       |
            |       |
            |main() |
            2.
            |       |
            |       |
            |birincif()|
            |main() |
            3.
            |       |
            |ikincif()|
            |birincif()|
            |main() |
            4.
            |ucuncuf()| //ucuncu fonksiyonda exception aldik ve kontrol edilmedi
            |ikincif()| //ikinciye geldik burada da kontrol edilmedi
            |birincif()| //ucuncuye geldik yine kontrol edilmedi
            |main() |   //maine geldik hala kontrol edilmediyse simdi exception firlatilir.
            
        */

        birinciFonksiyon();
    }
}
