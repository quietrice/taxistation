package conrollers;

//API для работы с заявками клиента:
//        1.	Создать новую заявку
//        2.	Удалить заявку
//        3.	Отредактировать заявку
//        4.	Получение информации о заявки
//        5.	Назначение водителя на заявку оператором
//        6.	Взять заявку в исполнение
//        7.	Получить список заявок

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.RequestServiceImpl;
import viewmodels.DriverVM;
import viewmodels.RequestVM;
import viewmodels.responses.BaseResponse;

import javax.validation.Valid;

@RestController
@RequestMapping("/request")
public class RequestController {
    @Autowired
    private RequestServiceImpl requestService;

    @PostMapping(
            value = "/registration",
            consumes = "application/json",
            produces = "application/json"
    )

    public BaseResponse registration(@RequestBody @Valid RequestVM requestVM)
    {
        RequestVM result = requestService.add(requestVM);
        return new BaseResponse(result);
    }

    @GetMapping(value = "/delete")
    public BaseResponse delete(@RequestParam(value = "id", defaultValue = "0") Long id)
    {
        return new BaseResponse(requestService.delete(id));
    }

    @GetMapping(value = "/get")
    public BaseResponse get(@RequestParam(value = "id", defaultValue = "0") Long id)
    {
        RequestVM requestVM = requestService.get(id);
        return new BaseResponse(requestVM);
    }
}




























