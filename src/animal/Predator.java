package animal;

public class Predator extends Mammal {

    public Predator(String name, int age, String livingEnvironment, int momentSpeed, String foodType) {
        super(name, age, livingEnvironment, momentSpeed, foodType);
    }

    @Override
    public void go() {
        System.out.println("Охотиться");
    }

    @Override
    public String toString() {
        return this.getClass() + "\n   Имя: " + this.getName() + "   Возраст: " + this.getAge() + "   Среда обитания: " + this.getLivingEnvironment() + "   Скорость передвижения: " + this.getMomentSpeed() + "   Тип пищи: " + this.getFoodType();
    }
}
