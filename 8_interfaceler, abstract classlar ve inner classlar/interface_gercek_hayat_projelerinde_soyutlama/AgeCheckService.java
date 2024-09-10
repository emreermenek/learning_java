

public class AgeCheckService implements ICheckService{
    @Override
    public boolean checkUser(User user){
        return user.getAge()>=18;
    }
}
