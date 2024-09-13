
public interface ICalisma {
    void calis();
    //bazi metodlari default degerde koyabilirsiniz,
    //ornegin:
    default void calisma(){
        System.out.println("Calismiyorum..");
    };
}
