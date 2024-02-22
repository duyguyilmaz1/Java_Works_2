package InterfaceRealLife;

public class AgeUserCheckService implements IUserCheckService {
    public boolean checkUser(User user){
        if (user.getAge()>= 18){
            return true;
        }
        return false;
    }
}
