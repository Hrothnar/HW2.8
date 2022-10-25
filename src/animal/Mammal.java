package animal;

import java.util.Objects;

public class Mammal extends Animal {

    private int momentSpeed;
    private String foodType;

    {
        this.momentSpeed = 1;
        this.foodType = "default";
    }

    public Mammal(String name, int age, String livingEnvironment, int momentSpeed, String foodType) {
        super(name, age, livingEnvironment);
        setMomentSpeed(momentSpeed);
        setFoodType(foodType);
    }

    public final int getMomentSpeed() {
        return momentSpeed;
    }

    public void setMomentSpeed(int momentSpeed) {
        if (momentSpeed > 0)
            this.momentSpeed = momentSpeed;
    }

    public final String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        if (foodType != null && !foodType.isBlank())
            this.foodType = foodType;
    }

    @Override
    public void go() {
        System.out.println("Гулять");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return this.getAge() == mammal.getAge() && Objects.equals(this.getName(), mammal.getName()) && Objects.equals(this.getLivingEnvironment(), mammal.getLivingEnvironment()) && momentSpeed == mammal.momentSpeed && Objects.equals(foodType, mammal.foodType);
    }

}
