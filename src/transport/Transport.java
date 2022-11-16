package transport;

public abstract class Transport {
    protected String brand;
    protected String model;
    protected int year;
    protected String country;
    protected String color;
    protected int maxSpeed;
    protected String fuel;

    public Transport(String brand, String model, String color, int year, String country, int maxSpeed, String fuel) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.country = country;
        this.maxSpeed = maxSpeed;
        this.fuel = fuel;
    }
    public String getBrand() {
        if (brand == null || brand.length() == 0) {
            brand = "default";
        }
        return brand;
    }
    public String getModel () {
        if (model == null || model.length() == 0) {
            model = "default";
        }
        return model;
    }
    public int getYear () {
        if (year == 0) {
            year = 2000;
        }
        return year;
    }
    public String getCountry () {
        if (country == null || country.length() == 0) {
            country = "страна не указана";
        }
        return country;
    }
    public String getColor () {
        if (color == null || color.length() == 0) {
            color = "белый";
        }
        return color;
    }
    public void setColor (String color){
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
    public void setMaxSpeed (int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public abstract void refill();

}
