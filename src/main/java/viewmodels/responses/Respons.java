package responses;

public class Respons {
    boolean success;
    Object data;
    String error;

    public Respons(Object data) {
        this.data = data;
        this.success = true;
    }

    public Respons(String error) {
        this.error = error;
        this.success = false;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
