package services;

import entities.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositoryes.CarRepository;
import repositoryes.DriverRepository;
import repositoryes.TypeCarRepository;
import viewmodels.CarVM;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl {
    @Autowired
    CarRepository carRepository;
    @Autowired
    TypeCarRepository typeRepo;
    @Autowired
    DriverRepository driverRepo;

    public boolean add(CarVM carVM){
        try {
            Car car = new Car(
                    carVM.getRegNumber(),
                    carVM.getName(),
                    typeRepo.getOne(carVM.getType()),
                    driverRepo.getOne(carVM.getDriverPassport()));

            carRepository.save(car);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }
    public boolean delete(String id)
    {
        try {
            carRepository.deleteById(id);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public CarVM get(String id)
    {
        try {
            Car car = carRepository.getOne(id);
            return  new CarVM(car.getRegNumber(), car.getName(), car.getType().getIdType(), car.getDriver().getPassport());
        }
        catch (Exception e)
        {
            return null;
        }
    }

    public List<CarVM> getAll()
    {
        List<Car> cars = carRepository.findAll();
        List<CarVM> carVMS = new ArrayList<>();
        for (Car car : cars)
        {
            carVMS.add(new CarVM(car.getRegNumber(),car.getName(), car.getType().getIdType(), car.getDriver().getPassport()));
        }
        return carVMS;
    }
}
