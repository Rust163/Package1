package animals;

import java.util.Objects;

public class Flightless extends Birds{
    protected String typeOfMovement;

    public Flightless(String name, int age, String livingEnvironment, String typeOfMovement) {
        super(name, age, livingEnvironment);
        if (typeOfMovement == null || typeOfMovement.isEmpty() || typeOfMovement.isBlank()) {
            typeOfMovement ="Неверное значение";
        }
        this.typeOfMovement = typeOfMovement;
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    @Override
    public void hunt() {
        super.hunt();
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void wolk() {
        super.wolk();
    }

    @Override
    public String toString() {
        return "Название животного: " + name +
                ". Возраст: " + age +
                ". Среда обитания: " + livingEnvironment +
                ". Тип передвижения " + typeOfMovement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flightless that = (Flightless) o;
        return Objects.equals(typeOfMovement, that.typeOfMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfMovement);
    }
}
