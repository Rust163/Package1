package animals;

import java.util.Objects;

public class Amphibians extends Animals{
    protected String livingEnvironment;

    public Amphibians(String name, int age, String livingEnvironment) {
        super(name, age);
        this.livingEnvironment = livingEnvironment;
        if (livingEnvironment== null || livingEnvironment.isEmpty() || livingEnvironment.isBlank()) {
            livingEnvironment = "Неверное значение";
        }
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    @Override
    public void hunt() {
        System.out.println("Охотится!");
        super.hunt();
    }

    @Override
    public void eat() {
        System.out.println("Ест.");
        super.eat();
    }

    @Override
    public void sleep() {
        System.out.println("Спит.");
        super.sleep();
    }

    @Override
    public void toSwim() {
        System.out.println("Плавает по озеру.");
        super.toSwim();
    }
    @Override
    public String toString() {
        return "Название животного: " + name +
                ". Возраст: " + age +
                ". Среда обитания: " + livingEnvironment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Amphibians that = (Amphibians) o;
        return Objects.equals(livingEnvironment, that.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }
}
