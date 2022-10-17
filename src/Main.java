public class Main {
    public static void main(String[] args) {
        Person maksim = new Person(1987, "Максим", "Минск", "бренд-менеджер");
        Person anya = new Person(1993, "Аня", "Москва", "методист");
        Person katya = new Person(1994, "Катя", "Калининград", "продакт-менеджер");
        Person artem = new Person(1995, "Артём", null, null);
        maksim.meeting();
        anya.meeting();
        katya.meeting();
        artem.meeting();

        Car one = new Car("Lada", "Granta", 1.7, "жёлтый", 2015, "Россия");
        Car two = new Car();
        two.brand = "Audi";
        one.carList();
        two.carList();
    }
}