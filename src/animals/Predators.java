package animals;

import java.util.Objects;

public class Predators extends Mammals{
    protected String typeOfFood;

    public Predators(String name, int age, String livingEnvironment, int movementSpeed, String typeOfFood) {
        super(name, age, livingEnvironment, movementSpeed);
        if (typeOfFood == null || typeOfFood.isEmpty() || typeOfFood.isBlank()) {
            typeOfFood = "Неверное значение";
        }
        this.typeOfFood = typeOfFood;
    }

    public String getTypeOfFood() {
        return typeOfFood;
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
                ". Скорость передвижения " + movementSpeed + "км/ч " +
                ". Тип питания :" + typeOfFood;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Predators predators = (Predators) o;
        return Objects.equals(typeOfFood, predators.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }
}
