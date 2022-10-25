package animal;

public class Flying extends Bird {

    public Flying(String name, int age, String livingEnvironment, String travelType) {
        super(name, age, livingEnvironment, travelType);
    }

    @Override
    public void go() {
        System.out.println("Летать");
    }

    @Override
    public String toString() {
        return this.getClass() + "\n   Имя: " + this.getName() + "   Возраст: " + this.getAge() + "   Среда обитания: " + this.getLivingEnvironment() + "   Тип передвижения: " + this.getTravelType();
    }
}
