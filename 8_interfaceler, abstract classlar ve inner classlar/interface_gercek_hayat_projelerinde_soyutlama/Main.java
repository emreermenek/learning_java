public class Main {
    public static void main(String[] args) {
        User user = new User(1, 18, "Emre");
        ComplexCheckService complexCheckService = new ComplexCheckService();
        AgeCheckService ageCheckService = new AgeCheckService();
        SingupManager singupManager1 = new SingupManager(complexCheckService);
        SingupManager singupManager2 = new SingupManager(ageCheckService);
        singupManager1.signUp(user);
        singupManager2.signUp(user);

        //interface sayesinde singupmanager'a istedigimiz check metodunu gonderebilirz.
        //bunun en buyuk avantaji service i kodda tek bir yerden degistirerek kontrol edebilmemizdir.
        
    }
}
