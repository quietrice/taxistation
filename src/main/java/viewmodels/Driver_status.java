package viewmodels;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.jetbrains.annotations.NotNull;

import java.util.Date;

public class Driver_status {


    String name;
    String num_license;
    Date date;
    int status;
    String reg_number;

    public Driver_status(String num_license, Date date, int status, String reg_number) {

        this.num_license= num_license;
        this.date = date;
        this.status = status;
        this.reg_number = reg_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum_license() {
        return num_license;
    }

    public void setNum_license(String num_license) {
        this.num_license = num_license;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getReg_number() {
        return reg_number;
    }

    public void setReg_number(String reg_number) {
        this.reg_number = reg_number;
    }
}
