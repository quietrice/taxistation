package viewmodels;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;


public class CarVM {
    @JsonProperty(value = "regNumber", required = true)
    @NotNull(message="regNumber is required")
    String regNumber;
    @JsonProperty(value = "name", required = true)
    @NotNull(message="name is required")
    String name;
    @JsonProperty(value = "type", required = true)
    @NotNull(message="type is required")
    Integer type;
    @JsonProperty(value = "passport", required = true)
    @NotNull(message="passport is required")
    Long driverPassport;

    public CarVM() {
    }

    public CarVM(@NotNull(message = "id is required") String regNumber, @NotNull(message = "name is required") String name, @NotNull(message = "type is required") Integer type, @NotNull(message = "passport is required") Long driverPassport) {
        this.regNumber = regNumber;
        this.name = name;
        this.type = type;
        this.driverPassport = driverPassport;
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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getDriverPassport() {
        return driverPassport;
    }

    public void setDriverPassport(Long driverPassport) {
        this.driverPassport = driverPassport;
    }
}
