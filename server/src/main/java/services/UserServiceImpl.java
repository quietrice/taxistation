package services;

import entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositoryes.UserRepository;
import viewmodels.UserVM;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl {
    @Autowired
    UserRepository userRepository;
    public UserVM add(UserVM userVM){
        try {
            User user = new User(userVM.getId(), userVM.getLogin(), userVM.getPassword());
            user = userRepository.save(user);
            return new UserVM(user.getId(), user.getLogin(), user.getPassword());
        }
        catch (Exception e)
        {
            return null;
        }
    }
    public boolean delete(Long id)
    {
        try {
            userRepository.deleteById(id);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public UserVM get(Long id)
    {
        try {
            User user = userRepository.getOne(id);
            return new UserVM(user.getId(), user.getLogin(), user.getPassword());
        }
        catch (Exception e)
        {
            return null;
        }
    }

    public List<UserVM> getAll()
    {
        List<User> users = userRepository.findAll();
        List<UserVM> userVMS = new ArrayList<>();
        for (User user: users)
        {
            userVMS.add(new UserVM(
                    user.getId(),
                    user.getLogin(),
                    user.getPassword()
            ));
        }
        return userVMS;
    }
}
