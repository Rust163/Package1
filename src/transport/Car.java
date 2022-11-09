package transport;

public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;
    public String transmissionBox;
    public String bodyType;
    public String registrationNumber;
    public int numberOfSeats;
    public boolean tires;

    public Car(String brand, String model, int year,String country, String color, double engineVolume){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.country = country;
        this.engineVolume = engineVolume;
    }
    public void info() {
        System.out.println(brand + " " + model + ", " + year + " год выпуска, " + "сборка " + country + ", цвет " + color + ", объем двигателя- " + engineVolume + "л.");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

    public String toString(){
        return brand + " " + model + ", " + year + " год выпуска, " + " сборка " + country + ", цвет " + color + " объем двигателя- " + engineVolume + "л.";
    }
}
