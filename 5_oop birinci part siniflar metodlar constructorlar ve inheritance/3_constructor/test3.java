public class test3 {
    public static void main(String[] args) {
        Account account1 = new Account("123456",1000,"Emre Ermenek","emreermenek1234@gmail.com","5309448903");
        account1.paraYatir(500);
        account1.paraCek(200);
        account1.bilgileriGoster();
        new Account().bilgileriGoster();
    }
}
