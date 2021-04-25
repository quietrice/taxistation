package conrollers;
import org.springframework.beans.factory.annotation.Autowired;

import services.UserServiceImpl;
import viewmodels.UserVM;
import org.springframework.web.bind.annotation.*;
import viewmodels.responses.BaseResponse;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImpl userService;


    @PostMapping(
            value = "/registration",
            consumes = "application/json",
            produces = "application/json")
    public BaseResponse registration(@RequestBody @Valid UserVM userVM)
    {
        return new BaseResponse(userService.saveUser(userVM));
    }

    @PostMapping(
            value = "/signin",
            consumes = "application/json",
            produces = "application/json")
    public BaseResponse signIn(@RequestBody @Valid UserVM userVM)
    {
        return  new BaseResponse( "User incorrect");
    }

    @GetMapping(value = "/get")
    public BaseResponse get(@RequestParam(value = "id", defaultValue = "0") int id)
    {
        return new BaseResponse(userService.getUserById(id));
    }

    @GetMapping(value = "/delete")
    public BaseResponse delete(@RequestParam(value = "id", defaultValue = "0") int id)
    {
        return new BaseResponse(userService.deleteUserById(id));
    }
}
