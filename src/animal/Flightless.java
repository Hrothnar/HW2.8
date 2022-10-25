package animal;

public class Flightless extends Bird {

    public Flightless(String name, int age, String livingEnvironment, String travelType) {
        super(name, age, livingEnvironment, travelType);
    }

    @Override
    public void go() {
        System.out.println("Гулять");
    }

    @Override
    public String toString() {
        return this.getClass() + "\n   Имя: " + this.getName() + "   Возраст: " + this.getAge() + "   Среда обитания: " + this.getLivingEnvironment() + "   Тип передвижения: " + this.getTravelType();
    }
}
