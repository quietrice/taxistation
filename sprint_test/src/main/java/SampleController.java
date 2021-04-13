import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
@RequestMapping("/")
public class SampleController {

    @GetMapping("car")
    @ResponseBody
    Car home() {

        return new Car(1,"test", "р123мр77", "bmw", "black", 4, 111);
    }

    @PostMapping("driver")
    @ResponseBody
    Driver dri(){
        return new Driver(113131, 111);
    }


    @PostMapping("/add")
    @ResponseBody
    String test() {
        return "test page 2";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}

