public class GenericYazdir<E> { //E'nin anlami farkli veri tiplerini E yi kullandigin her yere yaz demek.

    public void yazdir(E[] array){
        for(E i : array){
            System.out.println(i);
        }
    }
    
}
