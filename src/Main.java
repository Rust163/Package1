import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car(
                "LADA",
                "Granta",
                2015,
                "Россия",
                "желтый",
                1.7,
                "",
                "хетчбек",
                "М6590М163",
                5,
                true);
        lada.setSummerTires(false);
        lada.setRegistrationNumber("М659СМ163");
        System.out.println(lada.checkRegistrationNumber());

        Car audi = new Car(
                "AUDI",
                "A8 50L TDI quattro",
                2020,
                "Германия",
                "черный",
                3.0,
                "АКПП",
                "седан",
                "Н649РР163",
                4,
                true);
        audi.setSummerTires(false);
        audi.setRegistrationNumber("М654ММ163");
        Car bmw = new Car(
                "BMW",
                "Z8",
                2021,
                "Германия",
                "черный",
                3.0,
                "АКПП",
                "кабриолет",
                "М632УВ163",
                2,
                true);
        bmw.setSummerTires(false);
        bmw.setRegistrationNumber("");

        Car kia = new Car(
                "KIA",
                "Sportage 4-го поколения",
                2018, "Южная Корея",
                "красный",
                2.4,
                "МКПП",
                "внедорожник",
                "С963КЕ163",
                5,
                true);
        kia.setSummerTires(false);
        kia.setRegistrationNumber("к965ввxxx3");

        Car hyundai = new Car(
                "HYUNDAI",
                "Avante",
                2016,
                "Южная корея",
                "оранжевый",
                1.6,
                "АКПП",
                "седан",
                "С963КЕ163",
                5,
                true);
        hyundai.setSummerTires(false);
        hyundai.setRegistrationNumber("М23ccc163");
        System.out.println(hyundai.checkRegistrationNumber());


        lada.info();
        audi.info();
        bmw.info();
        kia.info();
        hyundai.info();

        System.out.println(lada.toString());
        System.out.println(audi.toString());
        System.out.println(bmw.toString());
        System.out.println(kia.toString());
        System.out.println(hyundai.toString());

        PrintCarInfo(lada);
        PrintCarInfo(audi);
        PrintCarInfo(bmw);
        PrintCarInfo(kia);
        PrintCarInfo(hyundai);
    }
    public static void PrintCarInfo (Car car) {
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(
                "Бренд:" + car.getBrand() +
                        " Модель: " + car.getModel() +
                        ", год выпуска: " + car.getYear() +
                        ", сборка: " + car.getCountry() +
                        ", цвет " + car.getColor() +
                        ", объем двигателя- " + car.getEngineVolume() + "л. ," +
                        " тип коробки передач: " + car.getTransmissionBox() +
                        ", тип кузова: " + car.getBodyType() +
                        ", регистрационный номер автомобиля: " + car.getRegistrationNumber() +
                        ", количество мест: " + car.getNumberOfSeats() +
                        ", на автомобиле установленна " + (car.getSummerTires() ? "летняя" : "зимняя") + " резина."

        );
    }
}
