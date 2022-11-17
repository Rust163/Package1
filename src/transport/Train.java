package transport;

public class Train extends Transport {
    protected double thePriceOfTheTrip;
    protected int travelTime;
    protected String nameOfTheDepartureStation;
    protected String finalStop;
    protected int numberOfWagons;

    public Train(String brand, String model, int year, String country, int maxSpeed, double thePriceOfTheTrip, int travelTime, String nameOfTheDepartureStation, String finalStop, int numberOfWagons, String color, String fuel) {
        super(brand, model, country, year, color, maxSpeed, fuel);

        this.thePriceOfTheTrip = thePriceOfTheTrip;
        this.travelTime = travelTime;
        this.nameOfTheDepartureStation = nameOfTheDepartureStation;
        this.finalStop = finalStop;
        this.numberOfWagons = numberOfWagons;
    }


    public double getThePriceOfTheTrip() {
        return thePriceOfTheTrip;
    }

    public void setThePriceOfTheTrip(double thePriceOfTheTrip) {
        this.thePriceOfTheTrip = thePriceOfTheTrip;
    }

    public int getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = travelTime;
    }

    public String getNameOfTheDepartureStation() {
        return nameOfTheDepartureStation;
    }

    public void setNameOfTheDepartureStation(String nameOfTheDepartureStation) {
        this.nameOfTheDepartureStation = nameOfTheDepartureStation;
    }

    public String getFinalStop() {
        return finalStop;
    }

    public void setFinalStop(String finalStop) {
        this.finalStop = finalStop;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = numberOfWagons;
    }

    @Override
    public void refill() {
        String diesel = "Дизель";
        if (getFuel().equalsIgnoreCase(diesel)) {
            System.out.println("нужно заправлять дизельным топливом");
        }

    }
}
