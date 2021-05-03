package viewmodels;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

public class DriverVM {

    @JsonProperty(value = "passport", required = true)
    @NotNull(message="passport is required")
    private Long passport;
    @JsonProperty(value = "name", required = true)
    @NotNull(message="name is required")
    private String name;
    @JsonProperty(value = "lastName", required = true)
    @NotNull(message="lastName is required")
    private String lastName;
    @JsonProperty(value = "tariff", required = true)
    @NotNull(message="tariff is required")
    private int tariff;


    public DriverVM() {
    }

    public DriverVM(Long passport, String name, String lastName, int tariff) {
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

    public int getTariff() {
        return tariff;
    }

    public void setTariff(int tariff) {
        this.tariff = tariff;
    }
}
