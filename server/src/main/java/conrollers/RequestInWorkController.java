package conrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.DriverServiceImpl;
import services.RequestInWorkService;
import viewmodels.DriverVM;
import viewmodels.RequestInWorkVM;
import viewmodels.responses.BaseResponse;

import javax.validation.Valid;

@RestController
@RequestMapping("/work")
public class RequestInWorkController {

    @Autowired
    private RequestInWorkService requestInWorkService;

    @PostMapping(
            value = "/add",
            consumes = "application/json",
            produces = "application/json"
    )
    public BaseResponse registration(@RequestBody @Valid RequestInWorkVM requestInWorkVM)
    {
        return new BaseResponse(requestInWorkService.add(requestInWorkVM));
    }

    @GetMapping(value = "/get")
    public BaseResponse get(@RequestParam(value = "id", defaultValue = "0") Long id)
    {
        RequestInWorkVM requestInWorkVM = requestInWorkService.get(id);
        return new BaseResponse(requestInWorkVM);
    }

    @GetMapping(value = "/all")
    public BaseResponse all(){return new BaseResponse(requestInWorkService.getAll());}
}
