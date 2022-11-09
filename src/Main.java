import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car ladaGranta = new Car("LADA", "Granta", 2015, "Россия", "желтый", 1.7);
        Car audiA8 = new Car("AUDI", "A8 50L TDI quattro", 2020, "Германия", "черный", 3.0);
        Car bmwZ8 = new Car("BMW", "Z8", 2021, "Германия", "черный", 3.0);
        Car kiaSportage = new Car("KIA", "Sportage 4-го поколения", 2018, "Южная Корея", "красный", 2.4);
        Car hyundaiAvante = new Car("HYUNDAI", "Avante", 2016, "Южная корея", "оранжевый", 1.6);

        ladaGranta.info();
        audiA8.info();
        bmwZ8.info();
        kiaSportage.info();
        hyundaiAvante.info();

        System.out.println(ladaGranta.toString());
        System.out.println(audiA8.toString());
        System.out.println(bmwZ8.toString());
        System.out.println(kiaSportage.toString());
        System.out.println(hyundaiAvante.toString());
    }
}