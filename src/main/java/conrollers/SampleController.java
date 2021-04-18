package conrollers;

import viewmodels.User;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;
import repositoryes.UserRepository;
import responses.Respons;

import javax.validation.Valid;

@RestController
@EnableAutoConfiguration
public class SampleController {

    UserRepository uRepo = new UserRepository();

    @PostMapping(
            value = "/registration",
            consumes = "application/json",
            produces = "application/json")
    public Respons registration(@RequestBody @Valid User user)
    {
        if(uRepo.addNewUser(user))
        {
            return new Respons(user);
        }
        else
        {
            return new Respons("registration fail");
        }
    }

    @PostMapping(
            value = "/signin",
            consumes = "application/json",
            produces = "application/json")
    public Respons signIn(@RequestBody @Valid User user)
    {
        User dbUser = uRepo.getUserByLogin(user.getLogin());
        if(dbUser!=null && dbUser.getPassword().equals(user.getPassword()))
        {
            return new Respons((Object) "Ok");
        }
        else
        {
            return new Respons("fail sign in");
        }
    }
}