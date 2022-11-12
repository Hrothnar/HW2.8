package animal;

import java.util.Objects;

public class Bird extends Animal {

    private String travelType;

    {
        this.travelType = "default";
    }

    public Bird(String name, int age, String livingEnvironment, String travelType) {
        super(name, age, livingEnvironment);
        setTravelType(travelType);
    }

    @Override
    public void eat() {
        System.out.println("Охотиться");
    }

    public final String getTravelType() {
        return travelType;
    }

    public void setTravelType(String travelType) {
        if (travelType != null && !travelType.isBlank())
            this.travelType = travelType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return this.getAge() == bird.getAge() && Objects.equals(this.getName(), bird.getName()) && Objects.equals(this.getLivingEnvironment(), bird.getLivingEnvironment()) && Objects.equals(travelType, bird.travelType);
    }

}
