import animal.*;
import other.Person;
import transport.Bus;
import transport.Car;
import transport.Car.Key;
import transport.Car.Insurance;
import transport.Train;
import transport.Transport;


public class Main {
    public static void main(String[] args) {
        Person maksim = new Person(1987, "Максим", "Минск", "бренд-менеджер");
        Person anya = new Person(1993, "Аня", "Москва", "методист");
        Person katya = new Person(1994, "Катя", "Калининград", "продакт-менеджер");
        Person artem = new Person(1995, "Артём", null, null);
        Person vladimir = new Person(2001, "Владимир", "Казань", "сейчас не работает");
//        maksim.meeting();
//        anya.meeting();
//        katya.meeting();
//        artem.meeting();
//        vladimir.meeting();

        Car car1 = new Car("Lada", "Granta", 2004, "Россия", "Жёлтый", 150, 0, "Седан", "о545ла22", 4, "Зима");
        Key car1Key = car1.new Key("No", "No");
        Insurance car1Insurance = car1.new Insurance(8, 24500, "222333446");
        car1.installSeasonalTires();

        Transport train1 = new Train("Ласточка", "В-901", 2011, "Россия", null, 301, 3500, 0, "Белорусский вокзал", "Минск-Пассажирский", 11);
        Transport train2 = new Train("Ленинград", "D-125", 2019, "Россия", null, 270, 1700, 0, "Ленинградский вокзал", "Ленинград-Пассажирский", 8);
//        train1.showInfo();
//        train2.showInfo();
        Transport bus1 = new Bus("Ford", "Transit", 1998, "USA", "Green", 134);
        Transport bus2 = new Bus("Peugeot", "Boxer", 2016, "French", "White", 150);
        Transport bus3 = new Bus("Лада", "Газель", 2020, "Россия", "Серый", 145);
//        bus1.showInfo();
//        bus2.showInfo();
//        bus3.showInfo();
//        car1.refill();
//        train1.refill();
//        bus1.refill();

        Animal gazelle = new Herbivorous("Газель", 4, "Саванна", 80, "Травка");
        Animal gazelle1 = new Herbivorous("Газель", 4, "Саванна", 80, "Травка");

        Animal giraffe = new Herbivorous("Жираф", 2, "Саванна", 55, "Листва");
        Animal horse = new Herbivorous("Лошадь", 3, "Степь", 80, "Травка");
        Animal hyena = new Predator("Гиена", 1, "Саванна", 60, "Мясо");
        Animal tiger = new Predator("Тигр", 7, "Саванна", 50, "Мясо");
        Animal bear = new Predator("Медведь", 6, "Чаща", 40, "Мясо и растительная пища");

        Animal frog = new Amphibian("Лягушка", 1, "Болото");
        Animal frog1 = new Amphibian("Лягушка", 1, "Болото");

        Animal natrixNatrix = new Amphibian("Уж", 2, "Мангровые болота");
        Animal peacock = new Flightless("Павлин", 3, "Поляны", "Пешком");
        Animal penguin = new Flightless("Пингвин", 3, "Заполярье", "Пешком");
        Animal dodoBird = new Flightless("Птица Додо", 1, "остров Маврикий", "Пешком");
        Animal seagull = new Flying("Чайка", 2, "Морские порты", "Летает");
        Animal albatross = new Flying("Альбатрос", 2, "Моря, океаны", "Летает");
        Animal falcon = new Flying("Сокол", 3, "Степь", "Летает");


//        System.out.println(gazelle); gazelle.eat(); gazelle.sleep(); gazelle.go(); System.out.println();
//        System.out.println(giraffe); giraffe.eat(); giraffe.sleep(); giraffe.go(); System.out.println();
//        System.out.println(horse); horse.eat(); horse.sleep(); horse.go(); System.out.println();
//        System.out.println(hyena); hyena.eat(); hyena.sleep(); hyena.go(); System.out.println();
//        System.out.println(tiger); tiger.eat(); tiger.sleep(); tiger.go(); System.out.println();
//        System.out.println(bear); bear.eat(); bear.sleep(); bear.go(); System.out.println();
//        System.out.println(frog); frog.eat(); frog.sleep(); frog.go(); System.out.println();
//        System.out.println(natrixNatrix); natrixNatrix.eat(); natrixNatrix.sleep(); natrixNatrix.go(); System.out.println();
//        System.out.println(peacock); peacock.eat(); peacock.sleep(); peacock.go(); System.out.println();
//        System.out.println(penguin); penguin.eat(); penguin.sleep(); penguin.go(); System.out.println();
//        System.out.println(dodoBird); dodoBird.eat(); dodoBird.sleep(); dodoBird.go(); System.out.println();
//        System.out.println(seagull); seagull.eat(); seagull.sleep(); seagull.go(); System.out.println();
//        System.out.println(albatross); albatross.eat(); albatross.sleep(); albatross.go(); System.out.println();
//        System.out.println(falcon); falcon.eat(); falcon.sleep(); falcon.go(); System.out.println();

        Animal.searchEqualsAnimalsEverywhere();
        System.out.println(gazelle.equals(gazelle1));
        System.out.println(frog.equals(frog1));
        System.out.println(peacock.equals(penguin));






//        other.Flower roza = new other.Flower("Роза", null, "Голландия", 35.59, 0);
//        other.Flower hrizantema = new other.Flower("Хризантема", null, null, 15.15, 5);
//        other.Flower pion = new other.Flower("Пион", null, "Англия", 69.99, 1);
//        other.Flower gipsofila = new other.Flower("Гипсофила", null, "Турция", 19.54, 10);
//        roza.getInformation();
//        hrizantema.getInformation();
//        pion.getInformation();
//        gipsofila.getInformation();

//        other.Bouquet bouquet1 = new other.Bouquet();
//        bouquet1.addFlower(roza);
//        bouquet1.addFlower(roza);
//        bouquet1.addFlower(roza);
//        bouquet1.addFlower(hrizantema);
//        bouquet1.addFlower(hrizantema);
//        bouquet1.addFlower(hrizantema);
//        bouquet1.addFlower(hrizantema);
//        bouquet1.addFlower(hrizantema);
//        bouquet1.addFlower(gipsofila);
//        bouquet1.bouquetInfo();
//        other.Bouquet bouquet2 = new other.Bouquet();
//        bouquet2.addFlower(pion);
//        bouquet2.addFlower(pion);
//        bouquet2.addFlower(hrizantema);
//        bouquet2.bouquetInfo();


    }

}