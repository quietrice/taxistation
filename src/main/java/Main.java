import conrollers.CarController;
import conrollers.SampleController;
import org.springframework.boot.SpringApplication;

public class Main {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(new Class[]{
                SampleController.class,
                CarController.class
        }, args);
    }
}
