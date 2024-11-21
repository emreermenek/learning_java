public class InvalidAgeException extends ArithmeticException {
    //eger age i IOException gibi checked exceptiondan turetirsek o zaman
    //turettigimiz exception da checked exception olur.
    public InvalidAgeException(String message){
        super(message);
    }

    @Override
    public void printStackTrace() {
        System.out.println("Bu bir invalid age hatasidir.");
    }
    
}
