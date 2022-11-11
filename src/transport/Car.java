package transport;

public class Car {
    private final String brand;
    private final String model;
    public double engineVolume;
    public String color;
    private final int year;
    private final String country;
    public String transmissionBox;
    private final String bodyType;
    String registrationNumber;
    private final int numberOfSeats;
    public boolean summerTires;

    public Car(String brand, String model, int year, String country, String color, double engineVolume, String transmissionBox, String bodyType, String registrationNumber, int numberOfSeats, boolean summerTires) {

        if (brand.length() == 0) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model.length() == 0) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }

        if (color.length() == 0) {
            this.color = "белый";
        } else {
            this.color = color;
        }

        if (country.length() == 0) {
            this.country = "default";
        } else {
            this.country = country;
        }

        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

        if (transmissionBox.length() == 0 && transmissionBox.isEmpty() && transmissionBox.isBlank()) {
            this.transmissionBox = "Не указан тип КПП!";
        } else {
            this.transmissionBox = transmissionBox;
        }

        if (bodyType.length() == 0 && bodyType.isEmpty() && bodyType.isBlank()) {
            this.bodyType = "Не указан тип кузова!";
        } else {
            this.bodyType = bodyType;
        }
            if (registrationNumber.length() != 9 && registrationNumber.isEmpty() && registrationNumber.isBlank()) {
                this.registrationNumber = "Указан не верный формат номера или номер не указан";
            } else {
                this.registrationNumber = registrationNumber;
            }

        if(numberOfSeats <=0){
            this.numberOfSeats = 0;
        } else {
            this.numberOfSeats = numberOfSeats;
        }

        this.summerTires =true;


    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.length() == 0) {
            this.color = "белый";
        } else {
            this.color = color;
        }
    }

    public String getTransmissionBox() {
        return transmissionBox;
    }

    public void setTransmissionBox(String transmissionBox) {
        if (transmissionBox.length() == 0 && transmissionBox.isEmpty() && transmissionBox.isBlank()) {
            this.transmissionBox = "Не указан тип КПП!";
        } else {
            this.transmissionBox = transmissionBox;
        }
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber.length() != 9 && registrationNumber.isEmpty() && registrationNumber.isBlank()) {
            this.registrationNumber = "Указан не верный формат номера или номер не указан";
        } else {
            this.registrationNumber = registrationNumber;
        }
    }

    public boolean getSummerTires() {
        return summerTires;
    }

    public void setSummerTires(boolean summerTires) {
        this.summerTires = summerTires;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume >= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void info() {
        System.out.println("Бренд:" + brand +
                " Модель: " + model +
                ", год выпуска: " + year +
                ", сборка: " + country +
                ", цвет " + color +
                ", объем двигателя- " + engineVolume + "л. ," +
                " тип коробки передач: " + transmissionBox +
                ", тип кузова: " + bodyType +
                ", регистрационный номер автомобиля: " + registrationNumber +
                ", количество мест: " + numberOfSeats +
                ", на автомобиле установленна " + summerTires + " резина.");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

    public String toString() {
        return "Бренд:" + brand +
                " Модель: " + model +
                ", год выпуска: " + year +
                ", сборка: " + country +
                ", цвет " + color +
                ", объем двигателя- " + engineVolume + "л. ," +
                " тип коробки передач: " + transmissionBox +
                ", тип кузова: " + bodyType +
                ", регистрационный номер автомобиля: " + registrationNumber +
                ", количество мест: " + numberOfSeats +
                ", на автомобиле установленна " + summerTires + " резина.";
    }

    public boolean changeTires(boolean summerTires) {
        summerTires = !summerTires;
        return summerTires;
    }

    public boolean checkRegistrationNumber() {
        if (registrationNumber.length() != 9) {
            return false;
        }
        char[] chars = registrationNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        return Character.isDigit(chars[1]) || Character.isDigit(chars[2]) || Character.isDigit(chars[3])
                || Character.isDigit(chars[6]) || Character.isDigit(chars[7]) || Character.isDigit(chars[8]);
    }
}
