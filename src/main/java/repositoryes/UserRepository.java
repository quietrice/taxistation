package repositoryes;

import viewmodels.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    List<User> list = new ArrayList<>();

    public boolean addNewUser(User user)
    {
        if(!list.contains(user))
            list.add(user);
        else
            return false;
        return true;
    }

    public User getUserByLogin(String login)
    {
        for(User u : list)
        {
            if( login.equals(u.getLogin()))
                return u;
        }
        return  null;
    }


}
