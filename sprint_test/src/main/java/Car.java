public class Car {
    int id;
    String name;
    String regNumber; // PK
    String brand;
    String colour;
    int capacity; // вместимость
    int countrAgentPassport; // FK


    public Car(int id, String name, String regNumber, String brand, String colour, int capacity, int countrAgentPassport) {
        this.id = id;
        this.name = name;
        this.regNumber = regNumber;
        this.brand= brand;
        this.colour = colour;
        this.capacity = capacity;
        this.countrAgentPassport =countrAgentPassport;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegNumber(){return regNumber;}

    public void setRegNumber(String regNumber){this.id = id;}

    public String getBrand(){return brand;}

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCountrAgentPassport() {
        return countrAgentPassport;
    }

    public void setCountrAgentPassport(int countrAgentPassport) {
        this.countrAgentPassport = countrAgentPassport;
    }

}
