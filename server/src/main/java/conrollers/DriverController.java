package conrollers;

//API для работы с водителем:
//        1.	Зарегистрировать нового водителя
//        2.	Удалить водителя
//        3.	Получение информации о водители
//        4.	Редактирование информации о водителе
//        5.	Получить список водителей



import org.springframework.beans.factory.annotation.Autowired;
import services.DriverServiceImpl;
import viewmodels.DriverVM;
import org.springframework.web.bind.annotation.*;
import viewmodels.responses.BaseResponse;

import javax.validation.Valid;

@RestController
@RequestMapping("/driver")
public class DriverController {
    @Autowired
    private DriverServiceImpl driverService;


    @PostMapping(
            value = "/registration",
            consumes = "application/json",
            produces = "application/json"
    )
    public BaseResponse registration(@RequestBody @Valid DriverVM driverVM)
    {
        return new BaseResponse(driverService.add(driverVM));
    }

    @GetMapping(value = "/delete")
    public BaseResponse delete(@RequestParam(value = "id", defaultValue = "0") Long id)
    {
        return new BaseResponse(driverService.delete(id));
    }

    @GetMapping(value = "/get")
    public BaseResponse get(@RequestParam(value = "id", defaultValue = "0") Long id)
    {
        DriverVM driverVM = driverService.get(id);
        return new BaseResponse(driverVM);
    }

    @GetMapping(value = "/all")
    public BaseResponse all()
    {
        return new BaseResponse(driverService.getAll());
    }


}
