public class Driver {
    int driverLicence;
    int countrAgentPassport;

    public Driver(int driverLicence, int countrAgentPassport){
        this.countrAgentPassport = countrAgentPassport;
        this.driverLicence = driverLicence;
    }

    public int getDriverLicence() {
        return driverLicence;
    }

    public void setDriverLicence(int driverLicence) {
        this.driverLicence = driverLicence;
    }

    public int getCountrAgentPassport() {
        return countrAgentPassport;
    }

    public void setCountrAgentPassport(int countrAgentPassport) {
        this.countrAgentPassport = countrAgentPassport;
    }
}
