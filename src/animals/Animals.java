package animals;

import java.util.Objects;

public class Animals {
    protected String name;
    protected int age;

    public Animals(String name, int age) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            name ="Неверное значение";
        }
        this.name = name;

        if (age <= 0){
            age = 0;
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void hunt() {

    }

    void eat() {

    }

    void sleep() {

    }

    void wolk() {

    }

    void fly(){

    }

    void toSwim(){

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
