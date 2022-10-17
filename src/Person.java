public class Person {
    int birthAge;
    String name;
    String city;
    String job;

    Person(int birthAge, String name, String city, String job) {
        if (birthAge >= 0) {
            this.birthAge = birthAge;
        } else {
            this.birthAge = 0;
        }
        this.name = name;
        this.city = city;
        this.job = job;
    }

    Person() {
        this(0, null, null, null);
    }

    void meeting() {
        if (this.name == null || this.city == null || this.job == null) {
            System.out.println("Данные не указаны");
        } else {
            System.out.println("Привет! Меня зовут " + this.name + ". Я из города " + this.city + ". Мне " + (2022 - this.birthAge) + " лет. Я работаю на должности " + this.job + ". Будем знакомы!");
        }
    }
}

