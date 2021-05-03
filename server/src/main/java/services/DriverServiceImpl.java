package services;

import entities.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositoryes.DriverRepository;
import viewmodels.DriverVM;

import java.util.ArrayList;
import java.util.List;

@Service
public class DriverServiceImpl {
    @Autowired
    DriverRepository driverRepository;
    public boolean add(DriverVM driverVM) {
        Driver driver = new Driver(driverVM.getPassport(), driverVM.getName(), driverVM.getLastName(), driverVM.getTariff());

        try {
            driverRepository.save(driver);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<DriverVM> getAll()
    {
        List<Driver> drivers = driverRepository.findAll();
        List<DriverVM> driversVM = new ArrayList<>();
        for(Driver driver : drivers)
        {
            driversVM.add(new DriverVM(
                    driver.getPassport(),
                    driver.getName(),
                    driver.getLastName(),
                    driver.getTariff()));
        }
        return driversVM;
    }

    public boolean delete(Long passport)
    {
        try {
            driverRepository.deleteById(passport);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public DriverVM get(Long passport)
    {
        try {
            Driver driver = driverRepository.getOne(passport);
            return new DriverVM(driver.getPassport(), driver.getName(), driver.getLastName(), driver.getTariff());
        }
        catch (Exception e)
        {
            return null;
        }
    }
}
