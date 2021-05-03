package entities;

import javax.persistence.*;

@Entity
public class Car {
    @Id
    private String regNumber;
    private String name;

    @ManyToOne
    private TypeCar type;

    @OneToOne
    @PrimaryKeyJoinColumn
    private Driver driver;

    public Car(){

    }

    public Car(String regNumber, String name, TypeCar type, Driver driver) {
        this.regNumber = regNumber;
        this.name = name;
        this.type = type;
        this.driver = driver;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeCar getType() {
        return type;
    }

    public void setType(TypeCar type) {
        this.type = type;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}

