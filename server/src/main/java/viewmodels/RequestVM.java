package viewmodels;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;


public class RequestVM {
    Long id;
    @JsonProperty(value = "customer_phone", required = true)
    @NotNull(message="customer_phone is required")
    Long customer_phone;
    @JsonProperty(value = "start", required = true)
    @NotNull(message="start is required")
    String start;
    @JsonProperty(value = "end", required = true)
    @NotNull(message="end is required")
    String end;
    @JsonProperty(value = "userId", required = true)
    @NotNull(message="userId is required")
    Long userId;
    Long driverID;

    public RequestVM() {
    }

    public RequestVM(Long id, @NotNull(message = "customer_phone is required") Long customer_phone, @NotNull(message = "start is required") String start, @NotNull(message = "end is required") String end, @NotNull(message = "userId is required") Long userId) {
        this.id = id;
        this.customer_phone = customer_phone;
        this.start = start;
        this.end = end;
        this.userId = userId;
    }

    public RequestVM(Long id, @NotNull(message = "customer_phone is required") Long customer_phone, @NotNull(message = "start is required") String start, @NotNull(message = "end is required") String end, @NotNull(message = "userId is required") Long userId, Long driverID) {
        this.id = id;
        this.customer_phone = customer_phone;
        this.start = start;
        this.end = end;
        this.userId = userId;
        this.driverID = driverID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomer_phone() {
        return customer_phone;
    }

    public void setCustomer_phone(Long customer_phone) {
        this.customer_phone = customer_phone;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getDriverID() {
        return driverID;
    }

    public void setDriverID(Long driverID) {
        this.driverID = driverID;
    }
}
