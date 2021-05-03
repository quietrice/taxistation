package entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Driver {
    @Id
    private Long passport;
    private String name;
    private String lastName;
    private int tariff;

    @OneToOne
    Car car;

    @OneToMany
    Set<RequestInWork> inWorkSet;

    public Driver() {
    }

    public Driver(Long passport, String name, String lastName, int tariff) {
        this.passport = passport;
        this.name = name;
        this.lastName = lastName;
        this.tariff = tariff;
    }

    public Long getPassport() {
        return passport;
    }

    public void setPassport(Long passport) {
        this.passport = passport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Set<RequestInWork> getInWorkSet() {
        return inWorkSet;
    }

    public void setInWorkSet(Set<RequestInWork> inWorkSet) {
        this.inWorkSet = inWorkSet;
    }

    public int getTariff() {
        return tariff;
    }

    public void setTariff(int tariff) {
        this.tariff = tariff;
    }
}
