package conrollers;

//API для работы с водителем:
//        1.	Зарегистрировать нового водителя
//        2.	Удалить водителя
//        3.	Получение информации о водители
//        4.	Редактирование информации о водителе
//        5.	Получить список водителей

import org.springframework.beans.factory.annotation.Autowired;

import services.UserServiceImpl;
import viewmodels.Driver;
import viewmodels.UserVM;
import org.springframework.web.bind.annotation.*;
import viewmodels.responses.BaseResponse;

import javax.validation.Valid;

@RestController
@RequestMapping("/driver")
public class DriverController {
    @Autowired
    private DriverController driverController;

    @PostMapping(
            value = "/registration",
            consumes = "application/json",
            produces = "application/json"
    )
    public BaseResponse registration(@RequestBody @Valid Driver driver)
    {
        return new BaseResponse(driverService.saveUser(driver));
    }

    @GetMapping(value = "/delete")
    public BaseResponse delete(@RequestParam(value = "id", defaultValue = "0") int id)
    {
        return new BaseResponse(driverService.deleteDriverById(id));
    }
}
