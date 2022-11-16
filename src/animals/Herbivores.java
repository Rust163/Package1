package animals;

import java.util.Objects;

public class Herbivores extends Mammals{
    protected String typeOfFood;

    public Herbivores(String name, int age, String livingEnvironment, int movementSpeed, String typeOfFood) {
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
    public void eat() {
        System.out.println("Сначала покушать.");
        super.eat();
    }

    @Override
    public void sleep() {
        System.out.println("Потом поспать.");
        super.sleep();
    }

    @Override
    public void wolk() {
        System.out.println("Теперь погулять");
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
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Herbivores that = (Herbivores) o;
        return Objects.equals(typeOfFood, that.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }
}
