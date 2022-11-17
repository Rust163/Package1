package animals;

public class Birds extends Animals{
    protected String livingEnvironment;

    public Birds(String name, int age, String livingEnvironment) {
        super(name, age);
        if (livingEnvironment== null || livingEnvironment.isEmpty() || livingEnvironment.isBlank()) {
            livingEnvironment = "Неверное значение";
        }
        this.livingEnvironment = livingEnvironment;
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    @Override
    void hunt() {
        super.hunt();
    }

    @Override
    void eat() {
        super.eat();
    }

    @Override
    void sleep() {
    }

    @Override
    void wolk() {
    }

    @Override
    void fly() {
    }
}
