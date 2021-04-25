package conrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import responses.BaseResponse;
import viewmodels.Car;
import responses.Respons;

import javax.validation.Valid;
//API для работы с транспортом:
//        1. Зарегистрировать новое ТС
//        2. Удалить ТС
//        3. Получение информации о ТС
//        4. Редактирование информации о ТС
//        5. Получить список ТС
@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarServiceImpl carService;

    @PostMapping(
            value = "/registration",
            consumes = "application/json",
            produces = "application/json")
    public Respons registration(@RequestBody @Valid Car car)
    {
        return new Respons((Object) "Ok");
    }

    @GetMapping(value = "/delete")
    public BaseResponse delete(@RequestParam(value = "id", defaultValue = "0") int id)
    {
        return new BaseResponse(carService.deleteCarById(id));
    }

    @GetMapping(value = "/information")
    public BaseResponse get(@RequestParam(value = "id", defaultValue = "0") int id)
    {
        return new BaseResponse(carService.getCarById(id));
    }

}
