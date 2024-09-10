public class string_sinifi_stringlerin_metodlari {
    public static void main(String[] args) {
        // String isim = "Selami";
        // System.out.println("Selami'de "+isim.length()+" tane harf var");
        // for(int i = 0;i<isim.length();i++){
        //     System.out.println(isim.charAt(i));
        // }
        // System.out.println(isim.startsWith("Se"));
        // System.out.println(isim.startsWith("Sa"));
        // System.out.println(isim.endsWith("mi"));
        // System.out.println(isim.endsWith("Mi"));
        // System.out.println(isim.indexOf('a'));
        // System.out.println(isim.indexOf('Z')); // -1
        // System.out.println(isim.lastIndexOf('a'));
        // System.out.println(isim.toLowerCase());
        // System.out.println(isim.toUpperCase());
        // String a = "1923";
        // int b = Integer.parseInt(a);
        // int c = 1923;
        // String d = String.valueOf(c);

        String a1 = "Mustafa";
        String a2 = "Mustafa";
        if(a1==a2){
            System.out.println("Esitler"); //referans degerleri ayni yeri gosterdigi icin Esitler yazar
        }
        String b1 = new String("Mustafa");
        String b2 = new String("Mustafa");
        if(b1==b2){
            System.out.println("Esitler"); //esitler yazmaz farkli yere kaydeder
        }
        if(b1.equals(b2)){
            System.out.println("Esitler"); //esitler yazar icindeki degerleri karsilastirir.
        }
     }
}
