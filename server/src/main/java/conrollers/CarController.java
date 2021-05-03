package conrollers;

//API для работы с транспортом:
//        1.	Зарегистрировать новое ТС
//        2.	Удалить ТС
//        3.	Получение информации о ТС
//        4.	Редактирование информации о ТС
//        5.	Получить список ТС

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.CarServiceImpl;
import viewmodels.CarVM;
import viewmodels.responses.BaseResponse;

import javax.validation.Valid;

@RestController
@RequestMapping("/car")
public class CarController {
    @Autowired
    private CarServiceImpl carService;

    @PostMapping(
            value = "/registration",
            consumes = "application/json",
            produces = "application/json"
    )

    public BaseResponse registration(@RequestBody @Valid CarVM carVM)
    {
        return new BaseResponse(carService.add(carVM));
    }

    @GetMapping(value = "/delete")
    public BaseResponse delete(@RequestParam(value = "id", defaultValue = "0") String id)
    {
        CarVM carVM = carService.get(id);
        return new BaseResponse(carVM);
    }

    @GetMapping(value = "/all")
    public BaseResponse all(){return new BaseResponse(carService.getAll());}

}
