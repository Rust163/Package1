package transport;

public class Bus extends Transport{
    protected float engineVolume;
    protected String transmissionBox;
    protected final String bodyType;
    protected String registrationNumber;
    protected int numberOfSeats;


    public Bus(String brand, String model, String color, int year, String country, int maxSpeed, float engineVolume, String transmissionBox, String bodyType, String registrationNumber, int numberOfSeats, String fuel) {
        super(brand, model, color, year, country, maxSpeed, fuel);
        this.engineVolume = engineVolume;

        if (transmissionBox.length() == 0 || transmissionBox.isEmpty() || transmissionBox.isBlank()) {
            transmissionBox = "МКПП";
        } else {
            this.transmissionBox = transmissionBox;
        }
        this.bodyType = bodyType;

        if (transmissionBox.length() == 0 || transmissionBox.isEmpty() || transmissionBox.isBlank()) {
            transmissionBox = "МКПП";
        } else {
            this.registrationNumber = registrationNumber;
        }

        this.numberOfSeats = Math.max(numberOfSeats, 2);


    }

    public float getEngineVolume() {
        if(engineVolume <= 0) {
            this.engineVolume = 1;
        }
        return engineVolume;
    }


    public String getTransmissionBox() {
        return transmissionBox;
    }

    public void setTransmissionBox(String transmissionBox) {
        if (transmissionBox.length() == 0 || transmissionBox.isEmpty() || transmissionBox.isBlank()) {
            this.transmissionBox = "МКПП";
        } else {
            this.transmissionBox = transmissionBox;
        }
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null) {
            this.registrationNumber = "x000xx000";
        } else {
            this.registrationNumber = registrationNumber;
        }
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void refill() {
        String diesel = "Дизель";
        String gas = "Бензин";
        if (getFuel().equalsIgnoreCase(gas)) {
            System.out.println("нужно заправлять бензином");
        }
        if (getFuel().equalsIgnoreCase(diesel)) {
            System.out.println("нужно заправлять дизельным топливом");
        }

    }
}
