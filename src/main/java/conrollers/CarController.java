package conrollers;

import viewmodels.Car;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import responses.Respons;

import javax.validation.Valid;

@RestController
@RequestMapping("/car")
public class CarController {

    @PostMapping(
            value = "/registration",
            consumes = "application/json",
            produces = "application/json")
    public Respons registration(@RequestBody @Valid Car car)
    {
        return new Respons((Object) "Ok");
    }
}
