import animals.*;
import transport.Bus;
import transport.Car;
import transport.Train;

import java.time.LocalDate;

public class Main {


    public static void main(String[] args) {

        Car car1 = new Car(
                "Lada",
                "Granta",
                1.7f,
                "жёлтый",
                2015,
                "Россия",
                "МКПП",
                "лифтбэк",
                "С652МТ163",
                5,
                true,
                null,
                null,
                180,
                "бензин");
        car1.setColor("зеленый");
        car1.setSummerTires(false);

        Car car2 = new Car(
                "Audi",
                "A8 50 L TDI quattro",
                3.0f,
                "чёрный",
                2020,
                "Германия",
                "АКПП",
                "купе",
                "С652МТ163",
                5,
                true,
                null,
                null,
                280,
                "бензин");
        car2.setSummerTires(false);
        car2.setKey(new Car.Key(true,true));

        Car car3 = new Car(
                "BMW",
                "Z8",
                3.0f,
                "чёрный",
                2021,
                "Германия",
                "АКПП",
                "седан",
                "С652МТ163",
                5,
                true,
                null,
                null,
                280,
                "бензин");
        car3.setSummerTires(false);

        Car car4 = new Car(
                "KIA",
                "Sportage 4-го поколения",
                2.4f,
                "красный",
                2018,
                "Южная Корея",
                "АКПП",
                "внедорожник",
                "С652МТ163",
                5,
                true,
                null,
                null,
                230,
                "дизель");
        car4.setSummerTires(false);

        Car car5 = new Car(
                "HUYNDAI",
                "Avante",
                1.8d,
                "оранжевый",
                2008,
                "Южная корея",
                "АКПП",
                "седан",
                "С652МТ163",
                5,
                true,
                null,
                null,
                240,
                "электрокар");
        car5.setRegistrationNumber("a078a1777");
        car5.setSummerTires(false);
        car5.setInsurance(new Car.Insurance(LocalDate.of(2022, 12, 12),
                10000, "131313131"));
        car1.refill();
        car2.refill();
        car3.refill();
        car4.refill();
        car5.refill();

        borderLine();
        printCarInfo(car1);
        System.out.println("Корректный регистрационный номер? " + car1.checkingRegistrationNumber());
        borderLine();
        printCarInfo(car2);
        System.out.println("Корректный регистрационный номер? " + car2.checkingRegistrationNumber());
        borderLine();
        printCarInfo(car3);
        System.out.println("Корректный регистрационный номер? " + car3.checkingRegistrationNumber());
        borderLine();
        printCarInfo(car4);
        System.out.println("Корректный регистрационный номер? " + car4.checkingRegistrationNumber());
        borderLine();
        printCarInfo(car5);
        System.out.println("Корректный регистрационный номер? " + car5.checkingRegistrationNumber());
        borderLine();
        car5.getInsurance().checkExpiryDate();
        car5.getInsurance().checkInsuranceNumber();
        car1.refill();
        car2.refill();
        car3.refill();
        car4.refill();
        car5.refill();


        Train train1 = new Train(
                "Ласточка",
                "B-901",
                2011 ,
                "Россия",
                301,
                3500,
                8,
                "Белорусского вокзала",
                "Минск-Пассажирский",
                11,
                "красный",
                "дизель");

        Train train2 = new Train(
                "Ленинград",
                "D-125",
                2019,
                "Россия",
                270,
                1700,
                5,
                "Ленинградского вокзала",
                "Ленинград-Пассажирский",
                8,
                "зеленый",
                "дизель");

        borderLine();
       printTrainInfo(train1);
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        printTrainInfo(train2);
        train1.refill();
        train2.refill();

        borderLine();

        Bus bus1 = new Bus(
                "Ikarus",
                "260",
                "желтый",
                1983,
                "Венгрия",
                90,
                10.350f,
                "АКПП",
                "автобус",
                "ММ259Л163",
                22,
                "дизель");


        Bus bus2 = new Bus(
                "ЛиАЗ",
                "677",
                "зеленый",
                1971,
                "Россия",
                70,
                7,
                "АКПП",
                "автобус",
                "ОМ369Л163",
                25,
                "дизель");


        Bus bus3 = new Bus(
                "КАвЗ",
                "685",
                "голубой",
                1976,
                "Россия",
                90,
                4.250f,
                "МКПП",
                "автобус",
                "СТ854Л163",
                21,
                "бензин");


        printBusInfo(bus1);
        bus1.refill();
        bus2.refill();
        bus3.refill();




        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        printBusInfo(bus2);
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        printBusInfo(bus3);
        borderLine();

        borderLine();
        Herbivores gazelle = new Herbivores(
                "Газель",
                5,
                "степи",
                60,
                "трава");
        System.out.println(gazelle.toString());

        gazelle.eat();
        gazelle.sleep();
        gazelle.wolk();
        borderLine2();
        Herbivores giraffe = new Herbivores(
                "Жираф",
                8,
                "африканская саванна",
                30,
                "трава");
        System.out.println(giraffe.toString());
        borderLine2();
        Herbivores horse = new Herbivores(
                "Конь",
                6,
                "степи",
                50,
                "трава");
        System.out.println(horse.toString());

        borderLine2();
        Predators hyena = new Predators(
                "Гиена",
                4,
                "африканская саванна",
                40,
                "мясо");
        System.out.println(hyena.toString());
        borderLine2();
        Predators tiger = new Predators(
                "Тигр",
                10,
                "африканская саванна и леса",
                50,
                "мясо");
        System.out.println(tiger.toString());
        borderLine2();
        Predators bear = new Predators(
                "Медведь",
                12,
                "лес",
                30,
                "мясо");
        System.out.println(bear.toString());

        borderLine2();
        Amphibians frog = new Amphibians(
                "Лягушка",
                2,
                "реки и озера");
        System.out.println(frog.toString());
        borderLine2();
        Amphibians freshwaterSnake = new Amphibians(
                "Уж пресноводный",
                4,
                "озера, реки, леса");
        System.out.println(freshwaterSnake.toString());


        borderLine2();
        Flightless peacock = new Flightless(
                "Павлин",
                3,
                "тропический страны",
                "ходит");
        System.out.println(peacock.toString());
        borderLine2();
        Flightless penguin = new Flightless(
                "Пингвин",
                13,
                "крайние северные районы",
                "ходит");
        System.out.println(penguin.toString());
        borderLine2();
        Flightless dodoBird = new Flightless(
                "Птица Додо",
                7,
                "тропический страны",
                "ходит");
        System.out.println(dodoBird.toString());

        borderLine2();
        Flying seagull = new Flying(
                "Чайка",
                1,
                "побережье морей и океанов",
                "летает");
        System.out.println(seagull.toString());
        borderLine2();
        Flying albatross = new Flying(
                "Альбатрос",
                9,
                "побережье моря и океана",
                "летает");
        System.out.println(albatross.toString());
        borderLine2();
        Flying falcon = new Flying(
                "Сокол",
                1,
                "степи и леса",
                "летает");
        System.out.println(falcon.toString());

    }

    private static void printCarInfo(Car car) {
        System.out.println(
                "Автомобиль. Марка: " + car.getBrand() +
                        ". Модель: " + car.getModel() +
                        ". Объём двигателя: " + car.getEngineVolume() +
                        ". Коробка передач: " + car.getTransmissionBox() +
                        ". Тип кузова: " + car.getBodyType() +
                        ". Количество мест: " + car.getNumberOfSeats() +
                        ". Цвет кузова: " + car.getColor() +
                        ". " + (car.getSummerTires() ? "Летняя" : "Зимняя") + " резина" +
                        ". Год выпуска: " + car.getYear() +
                        ". Страна производитель: " + car.getCountry() + ". Максимальная скорость: " + car.getMaxSpeed() +
                        "км/ч. Регистрационный номер: " + car.getRegistrationNumber() +
                        ". Вид топлива: " + car.getFuel() +
                        "." + (car.getKey().isKeylessAccess() ? " Безключевой доступ!" : " Ключевой доступ!") +
                        (car.getKey().isRemoteEngineStart() ?
                                " Есть удалённый запуск двигателя!" : " Нет удалённого запуска двигателя!") +
                        " Номер страховки: " + car.getInsurance().getInsuranceNumber() +
                        ". Стоимость страховки: " + car.getInsurance().getInsuranceCost() +
                        ". Срок действия страховки: " + car.getInsurance().getInsurancePeriod());
    }





    private static void printTrainInfo(Train train) {
        System.out.println(
                "Поезд. Марка: " + train.getBrand() +
                ". Модель: " + train.getModel() +
                        ". Цвет поезда " + train.getColor() +
                ". Год выпуска: " + train.getYear() +
                ". Скорость движения поезда: " + train.getMaxSpeed() +
                ". Стоимость билета составляет: " + train.getThePriceOfTheTrip() + "руб. " +
                ". Время в пути составит " + train.getTravelTime() + " часа(-ов)" +
                ". Поезд отправляется с " + train.getNameOfTheDepartureStation() +
                " и следует до станции " + train.getFinalStop() +
                ", в составе у поезда " + train.getNumberOfWagons() +
                        ". Страна производитель: " + train.getCountry() +
                        ". Вид топлива: " + train.getFuel()
        );
    }

    private static void printBusInfo(Bus bus) {
        System.out.println(
                "Автобус. Марка: " + bus.getBrand() +
                        ". Модель: " + bus.getModel() +
                        ". Объём двигателя: " + bus.getEngineVolume() +
                        ". Коробка передач: " + bus.getTransmissionBox() +
                        ". Тип кузова: " + bus.getBodyType() +
                        ". Количество мест: " + bus.getNumberOfSeats() +
                        ". Цвет кузова: " + bus.getColor() +
                        ". Год выпуска: " + bus.getYear() +
                        ". Страна производитель: " + bus.getCountry() +
                        ". Максимальная скорость: " + bus.getMaxSpeed() +
                        "км/ч. Регистрационный номер: " + bus.getRegistrationNumber() +
                        ". используемое топливо: " + bus.getFuel());
    }

    public static void borderLine() {
        System.out.println("===========================================================================================================");
    }

    public static void borderLine2() {
        System.out.println("------------------------------------------------------------------------------------------------------------");
    }

    @Override
    public boolean equals(Object Fluing) {
        return super.equals(Fluing);
    }
}
