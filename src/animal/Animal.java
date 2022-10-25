package animal;

import java.util.Arrays;
import java.util.Objects;

public abstract class Animal {
    private String name;
    private int age;
    private String livingEnvironment;

    private static Animal[] animals = new Animal[1];

    private static int count;

    protected Animal(String name, int age, String livingEnvironment) {
        setName(name);
        setAge(age);
        setLivingEnvironment(livingEnvironment);
        addAnimalToArray();

    }

    {
        this.name = "default";
        this.age = 1;
        this.livingEnvironment = "default";
    }

    public final String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isBlank())
            this.name = name;
    }

    public final int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0)
            this.age = age;
    }

    public final String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment != null && !livingEnvironment.isBlank())
            this.livingEnvironment = livingEnvironment;
    }

    public void eat() {
        System.out.println("Кушать");
    }

    public void sleep() {
        System.out.println("Спать");
    }

    public void go() {
        System.out.println("Перемещаться");
    }

    public void addAnimalToArray() {
        animals[count] = this;
        animals = Arrays.copyOf(animals, animals.length + 1);
        count++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name) && Objects.equals(livingEnvironment, animal.livingEnvironment);
    }

    public static void searchEqualsAnimalsEverywhere() {
        boolean b = false;
        for (int j = 1; j < animals.length - 1; j++) {
            if (animals[0].equals(animals[j])) { //считаем, что если у животных из ВСЕГО пула совпадают ссылка, класс и 3 поля то они одинаковые.
                b = true;
                break;
            }
        }
        if (b) {
            System.out.println("Одинаковые животные найдены - съешьте лишних животных, чтобы восстановить баланс");
        } else {
            System.out.println("Одинаковые животные не найдены");
        }
    }
}
