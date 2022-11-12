package other;

import javax.swing.plaf.PanelUI;

public class Person {
    private int birthAge;
    String name;
    private String city;
    String job;

    public Person(int birthAge, String name, String city, String job) {
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

    public void setBirthAge(int birthAge) {
        if (birthAge != 0 && birthAge > 1900) {
            this.birthAge = birthAge;
        } else {
            this.birthAge = 0;
        }
    }

    public void setCity(String city) {
        if (city != null && city != "" && city.isBlank()) {
            this.city = city;
        } else {
            System.out.println("Информация не указана");
        }
    }

    public int getBirthAge() {
        return this.birthAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void meeting() {
        if (this.name == null || this.city == null || this.job == null) {
            System.out.println("Данные не указаны");
        } else {
            System.out.println("Привет! Меня зовут " + this.name + ". Я из города " + this.city + ". Мне " + (2022 - this.birthAge) + " лет. Я работаю на должности " + this.job + ". Будем знакомы!");
        }
    }
}

