package viewmodels;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

public class RequestInWorkVM
{
    Long Id;
    @JsonProperty(value = "driverId", required = true)
    @NotNull(message="driverId is required")
    Long driverId;
    @JsonProperty(value = "requestId", required = true)
    @NotNull(message="requestId is required")
    Long requestId;



    public RequestInWorkVM() {
    }

    public RequestInWorkVM(@NotNull(message = "driverId is required") Long driverId, @NotNull(message = "requestId is required") Long requestId) {
        this.driverId = driverId;
        this.requestId = requestId;
    }

    public RequestInWorkVM(Long id, @NotNull(message = "driverId is required") Long driverId, @NotNull(message = "requestId is required") Long requestId) {
        Id = id;
        this.driverId = driverId;
        this.requestId = requestId;
    }

    public Long getDriverId() {
        return driverId;
    }

    public void setDriverId(Long driverId) {
        this.driverId = driverId;
    }

    public Long getRequestId() {
        return requestId;
    }

    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }
}
