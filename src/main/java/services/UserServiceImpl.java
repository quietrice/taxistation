package services;
import entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.UserRepository;
import viewmodels.UserVM;
import viewmodels.responses.UserInfo;

import java.util.List;


@Service
public class UserServiceImpl {
    @Autowired
    private UserRepository userRepository;


    public UserVM saveUser(UserVM user) {
        User u = converToEntity(user);
        u = userRepository.save(u);
        return converToVM(u);
    }

    public boolean deleteUser(UserVM user) {
        return false;
    }

    public boolean deleteUserById(Integer id)
    {
        try
        {
            userRepository.deleteById(id);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public UserInfo getUserById(Integer id) {
        try
        {
            User  u = userRepository.getOne(id);
            return new UserInfo(u.getId(), u.getLogin());
        }
        catch (Exception e)
        {
            return null;
        }
    }


    public List<UserVM> getAllUser() {
        return null;
    }


    public UserVM converToVM(User user) {
        return new UserVM(user.getId(), user.getLogin(), user.getPassword());
    }


    public User converToEntity(UserVM user) {
        return new User(user.getId(), user.getLogin(), user.getPassword());
    }

}
