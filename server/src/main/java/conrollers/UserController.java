package conrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.UserServiceImpl;
import viewmodels.UserVM;
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
            produces = "application/json"
    )
    public BaseResponse registration(@RequestBody @Valid UserVM userVM)
    {
        UserVM result = userService.add(userVM);
        if(result==null)
        {
            return new BaseResponse("Login is used");
        }
        return  new BaseResponse(result);
    }

    @GetMapping(value = "/delete")
    public BaseResponse delete(@RequestParam(value = "id", defaultValue = "0") Long id)
    {
        return new BaseResponse(userService.delete(id));
    }

    @GetMapping(value = "/get")
    public BaseResponse get(@RequestParam(value = "id", defaultValue = "0") Long id)
    {
        UserVM userVM = userService.get(id);
        return new BaseResponse(userVM);
    }
}
