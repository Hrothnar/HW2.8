package animal;

public class Amphibian extends Animal {

    public Amphibian(String name, int age, String livingEnvironment) {
        super(name, age, livingEnvironment);
    }

    @Override
    public void eat() {
        System.out.println("Охотиться");
    }

    @Override
    public String toString() {
        return this.getClass() + "\n   Имя: " + this.getName() + "   Возраст: " + this.getAge() + "   Среда обитания: " + this.getLivingEnvironment();
    }

}
