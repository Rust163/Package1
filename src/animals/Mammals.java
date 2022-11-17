package animals;

public class Mammals extends Animals {
    protected String livingEnvironment;
    protected int movementSpeed;

    public Mammals(String name, int age, String livingEnvironment, int movementSpeed) {
        super(name, age);
        this.livingEnvironment = livingEnvironment;

        if (movementSpeed <= 0) {
            movementSpeed = 0;
        }
        this.movementSpeed = movementSpeed;
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }


    void eat() {
    }


    void sleep() {
    }


    void wolk() {
    }
}

