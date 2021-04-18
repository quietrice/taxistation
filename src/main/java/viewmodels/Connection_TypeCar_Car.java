package viewmodels;

public class Connection_TypeCar_Car {
    String reg_number;
    int id_type;

    public Connection_TypeCar_Car(String reg_number, int id_type){
        this.id_type = id_type;
        this.reg_number = reg_number;
    }

    public String getReg_number() {
        return reg_number;
    }

    public void setReg_number(String reg_number) {
        this.reg_number = reg_number;
    }

    public int getId_type() {
        return id_type;
    }

    public void setId_type(int id_type) {
        this.id_type = id_type;
    }
}
