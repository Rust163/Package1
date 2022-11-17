package transport;

import java.time.LocalDate;

public class Car extends Transport {
    @Override
    public void refill() {
        String gas = "Бензин";
        String diesel = "Дизель";
        String electrical = "ЭлектроКар";
        if (getFuel().equalsIgnoreCase(gas)) {
            System.out.println("нужно заправлять бензином");
        }
        if (getFuel().equalsIgnoreCase(diesel)) {
            System.out.println("нужно заправлять дизельным топливом");
        }
        if (getFuel().equalsIgnoreCase(electrical)) {
            System.out.println("нужно заряжать электричеством");
        }
    }
    protected double engineVolume;
    protected String color;
    protected String transmissionBox;
    private final String bodyType;
    protected String registrationNumber;
    private final int numberOfSeats;
    protected boolean summerTires;
    private Key key;
    private Insurance insurance;

    public Car(String brand, String model, double engineVolume,String color, int year, String country, String transmissionBox, String bodyType, String registrationNumber, int numberOfSeats, boolean summerTires, Key key, Insurance insurance, int maxSpeed, String fuel) {
        super(brand, model, color, year, country, maxSpeed, fuel);

        this.engineVolume = Math.max(engineVolume, 1.5);

        if (registrationNumber == null) {
            this.registrationNumber = "x000xx000";
        } else {
            this.registrationNumber = registrationNumber;
        }
        if (bodyType == null) {
            this.bodyType = "седан";
        } else {
            this.bodyType = bodyType;
        }
        if (transmissionBox.length() == 0) {
            this.transmissionBox = "МКПП";
        } else {
            this.transmissionBox = transmissionBox;
        }
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
        if (insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }
        this.summerTires = summerTires;

        this.numberOfSeats = Math.max(numberOfSeats, 2);

    }
    public double getEngineVolume() {
        engineVolume = Math.max(engineVolume, 1.5);
        return engineVolume;
    }
    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }
    public String getTransmissionBox() {
        return transmissionBox;
    }
    public void setTransmissionBox(String transmissionBox) {
        if (transmissionBox == null) {
            this.transmissionBox = "МКПП";
        } else {
            this.transmissionBox = transmissionBox;
        }
    }

    public static class Key {

        protected final boolean remoteEngineStart;
        protected final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public Key() {
            this(false, false);
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }
    }

    public static class Insurance {
        private final LocalDate insurancePeriod;
        private final double insuranceCost;
        private final String insuranceNumber;

        public Insurance(
                LocalDate insurancePeriod,
                double insuranceCost,
                String insuranceNumber) {
            if (insurancePeriod == null) {
                this.insurancePeriod = LocalDate.now().plusDays(365);
            } else {
                this.insurancePeriod = insurancePeriod;
            }
            this.insuranceCost = insuranceCost;
            if (insuranceNumber == null) {
                this.insuranceNumber = "123456789";
            } else {
                this.insuranceNumber = insuranceNumber;
            }
        }

        public Insurance() {
            this(null, 5000, null);
        }

        public LocalDate getInsurancePeriod() {
            return insurancePeriod;
        }

        public double getInsuranceCost() {
            return insuranceCost;
        }

        public String getInsuranceNumber() {
            return insuranceNumber;
        }

        public void checkExpiryDate() {
            if (insurancePeriod.isBefore(LocalDate.now()) || insurancePeriod.isEqual(LocalDate.now())) {
                System.out.println("Ваша страховка закончилась необходимо оформить новую!");
            } else {
                System.out.println("Действие вашей страховки до: " + insurancePeriod);
            }
        }

        public void checkInsuranceNumber() {
            if (insuranceNumber == null || insuranceNumber.length() != 9) {
                System.out.println("Номер страховки некорректный!");
            } else {
                System.out.println("Номер страховки корректный!");
            }
        }
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
    public boolean getSummerTires() {
        return summerTires;
    }
    public void setSummerTires(boolean summerTires) {
        this.summerTires = summerTires;
    }
    public String getBodyType() {
        return bodyType;
    }
    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }
    public boolean changingTires() {
        summerTires = !summerTires;
        return summerTires;
    }
    public boolean checkingRegistrationNumber() {
        if (registrationNumber.length() != 9) {
            return false;
        }
        char[] chars = registrationNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) ||
                !Character.isAlphabetic(chars[5])) {
            return false;
        }
        return Character.isDigit(chars[1]) && Character.isDigit(chars[2]) &&
                Character.isDigit(chars[3]) && Character.isDigit(chars[6]) &&
                Character.isDigit(chars[7]) && Character.isDigit(chars[8]);
    }
    @Override
    public String toString() {
        return "Автомобиль. Марка: " + brand +
                ". Модель: " + model +
                ". Объём двигателя: " + engineVolume +
                ". Цвет кузова: " + color +
                ". Год выпуска: " + year +
                ". Страна производитель: " + country + ".";
    }
}