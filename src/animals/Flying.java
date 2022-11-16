package animals;

import java.util.Objects;

public class Flying extends Birds {
    protected String typeOfMovement;

    public Flying(String name, int age, String livingEnvironment, String typeOfMovement) {
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
    public void fly() {
        super.fly();
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
        Flying flying = (Flying) o;
        return Objects.equals(typeOfMovement, flying.typeOfMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfMovement);
    }
}
