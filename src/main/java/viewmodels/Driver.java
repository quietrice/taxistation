package viewmodels;

public class Driver {
    String num_license;
    int passport_counter_agent;
    public Driver(String num_license, int passport_counter_agent) {
        this.num_license = num_license;
        this.passport_counter_agent = passport_counter_agent;
    }

    public String getNum_license() {
        return num_license;
    }

    public void setNum_license(String num_license) {
        this.num_license = num_license;
    }

    public int getPassport_counter_agent() {
        return passport_counter_agent;
    }

    public void setPassport_counter_agent(int passport_counter_agent) {
        this.passport_counter_agent = passport_counter_agent;
    }
}
