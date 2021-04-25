package services;

import org.springframework.beans.factory.annotation.Autowired;

import viewmodels.UserVM;
import org.springframework.web.bind.annotation.*;
import viewmodels.responses.BaseResponse;

import javax.validation.Valid;

@RestController
@RequestMapping("/car")
public class CarServiceImpl {

    @Autowired
    private CarServiceImpl carService;

    @PostMapping(
            value = "/registration",
            consumes = "application/json",
            produces = "application/json")
    public BaseResponse registration(@RequestBody @Valid CarVM carVM){
        return new BaseResponse(carService.carService(carVM));
    }
}
