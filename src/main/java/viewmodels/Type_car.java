package viewmodels;

public class Type_car {
    int id_type;
    String type;

    public Type_car(int id, String type){
        this.id_type = id;
        this.type = type;
    }

    public int getId() {
        return id_type;
    }

    public void setId(int id) {
        this.id_type = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
