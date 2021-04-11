import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
@RequestMapping("/car")
public class SampleController {

    @GetMapping("/")
    @ResponseBody
    Car home() {
        return new Car(1,"test");
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