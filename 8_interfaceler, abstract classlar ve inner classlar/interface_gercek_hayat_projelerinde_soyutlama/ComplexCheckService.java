
public class ComplexCheckService implements ICheckService {
    @Override
    public boolean  checkUser(User user){
        return user.getAge()>=18&&user.getName().startsWith("E");
    }
}
