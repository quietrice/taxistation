package viewmodels.responses;

public class BaseResponse {
    Boolean success;
    Object payload;
    String error;

    public BaseResponse(Boolean success)
    {
        this.success = success;
        payload= "OK";
    }

    public BaseResponse(Object data) {
        if (data == null)
        {
            success = false;
            error = "data not found";
        }
        else
        {
            this.payload = data;
            this.success = true;
        }
    }

    public BaseResponse(String error) {
        this.error = error;
        this.success = false;
    }

    public Object getPayload() {
        return payload;
    }

    public void setPayload(Object payload) {
        this.payload = payload;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
