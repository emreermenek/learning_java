public class SingupManager {
    private ICheckService iCheckService;
    public SingupManager(ICheckService iCheckService){
        this.iCheckService = iCheckService;
    }
    public void signUp(User user){
        if(iCheckService.checkUser(user)){
            System.out.println(user.getName()+" adli kullanici basariyla kayit oldu!");
        }else{
            System.out.println("Kayit basarisiz oldu!");
        }
        
    }
}
