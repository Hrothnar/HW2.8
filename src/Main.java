import other.Passport;
import other.TableNumber;
import transport.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Audi", "TT", 3.5);
        Car car2 = new Car("Peugeot", "308", 1.5);
//        Car car3 = new Car("Ford", "Mustang", 2.8);
//        Car car4 = new Car("Honda", "Civic", 2.2);
        Truck truck1 = new Truck("Mercedes-Benz", "Actors", 12.8, Weight.N2);
        Truck truck2 = new Truck("Volvo", "FH 16 ZS", 12, Weight.N1);
//        Truck truck3 = new Truck("Камаз", "4326", 18.472, Weight.N3);
//        Truck truck4 = new Truck("Freightliner", "Century", 12.7, Weight.N1);
        Bus bus1 = new Bus("Ford", "Transit", 2.8, Capacity.SMALL);
        Bus bus2 = new Bus("Peugeot", "Boxer", 3.3, Capacity.SMALL);
//        Bus bus3 = new Bus("Volkswagen", "Vento", 2.7, Capacity.MIDDLE);
//        Bus bus4 = new Bus("Лада", "Газель", 3.7, Capacity.SMALL);

//        ((Car) car1).pitStop();
//        ((Truck) truck1).bestLapTime();
//        System.out.println(((Bus) bus1).maxSpeed());

        Driver<Car> driver1 = new Driver<>("Игорь", 'b', 4.5, car1);
        Driver<Truck> driver2 = new Driver<>("Вова", 'C', 1.6, truck1);
        Driver<Bus> driver3 = new Driver<>("Саша", 'D', 3.3, bus1);
        Driver<Car> driver4 = new Driver<>("Евгений", 'B', 0.5, car2);
        Driver<Truck> driver5 = new Driver<>("Вася", 'C', 2.2, truck2);
        Driver<Bus> driver6 = new Driver<>("Виктор", 'd', 6.3, bus2);


        Transport.autoPark.add(car1);
        Transport.autoPark.add(car2);
        Transport.autoPark.add(truck1);
        Transport.autoPark.add(truck2);
        Transport.autoPark.add(bus1);
        Transport.autoPark.add(bus2);


//        car1.passDiagnostics();
//        car2.passDiagnostics();
//        car3.passDiagnostics();
//        car4.passDiagnostics();
//        truck1.passDiagnostics();
//        truck2.passDiagnostics();
//        truck3.passDiagnostics();
//        truck4.passDiagnostics();


//        Transport.showStatusOfDiagnostic();

//        System.out.println(Account.account("5kldal_ewr5g", "tLDdf442db", "tLDdf442db")); ВАЖНО!!

        driver1.bindDriver();
        driver2.bindDriver();
        driver3.bindDriver();
        driver4.bindDriver();
        driver5.bindDriver();
        driver6.bindDriver();

        Driver.drivers.add(driver1);
        Driver.drivers.add(driver2);
        Driver.drivers.add(driver3);
        Driver.drivers.add(driver4);
        Driver.drivers.add(driver5);
        Driver.drivers.add(driver6);


        Mechanic<Car> mechanic1 = new Mechanic<>("Иван Леонидович", "Мишлен", car1);
        Mechanic<Truck> mechanic2 = new Mechanic<>("Пётр Степанович", "Тур де Франц", truck1, truck2);
        Mechanic<Bus> mechanic3 = new Mechanic<>("Александр Робинзонович", "Гранд Туризмо", bus1);
        Mechanic<Car> mechanic4 = new Mechanic<>("Максим Филиппович", "West Coast Customs", car1, car2);
        Sponsor sponsor1 = new Individual("Вася", 23400);
        Sponsor sponsor2 = new Individual("Зоя", 15500);
        Sponsor sponsor3 = new Company("IBG", 300000);
        Sponsor sponsor4 = new Company("NFS", 420000);


        car1.getMechanics().add(mechanic1);
        car1.getMechanics().add(mechanic4);
        truck1.getMechanics().add(mechanic2);
        bus1.getSponsors().add(sponsor1);
        bus1.getSponsors().add(sponsor2);
        bus1.getSponsors().add(sponsor2);
        bus1.getSponsors().add(sponsor2);
        bus1.getSponsors().add(sponsor2);


//        mechanic1.doDiagnostic(car1);
//        Transport.showStatusOfDiagnostic();
////        car1.getMechanics().get(0).doDiagnostic(bus1);
//        mechanic1.repairTransport();
////        car1.getSponsors().add();
//        System.out.println(car1.getMechanics().size());
//        Transport.showInfo();

        ServiceStation.addAutoToQueue(car1);
        ServiceStation.addAutoToQueue(car2);
        ServiceStation.addAutoToQueue(truck1);
        ServiceStation.addAutoToQueue(truck2);
        ServiceStation.addAutoToQueue(bus1);
        ServiceStation.addAutoToQueue(bus2);

//        ServiceStation.doService(car1);
//        ServiceStation.doService(bus1);

        Shop.queue1.add("Vasya");
        Shop.queue1.add("Maks");
        Shop.queue2.add("Ben");
        Shop.queue2.add("Olga");
        Shop.queue2.add("Lena");
        Shop.queue2.add("Sveta");
        Shop.queue3.add("Piter");
        Shop.queue3.add("Vlad");
        Shop.queue3.add("Vika");
//
//        Shop.chooseAQueue("Fedot");
//        Shop.chooseAQueue("Uliyana");
//        Shop.chooseAQueue("Ulia");
//        Shop.chooseAQueue("Boris");
//        Shop.chooseAQueue("Kirill");
//        Shop.chooseAQueue("Leonid");
//        Shop.chooseAQueue("Eugen");
//
//        Shop.removeBuyer();
//        Shop.removeBuyer();
//        Shop.removeBuyer();
//        Shop.removeBuyer();
//        Shop.removeBuyer();

//        matrix();
//        table();
//
//        Passport igor = new Passport("Игорь", "Валиев", null, "13.04.1995", "21444252");
//        Passport vasya = new Passport("Вася", "Петров", "Захарович", "27.06.1992", "54288244");
//        Passport elena = new Passport("Елена", "Котлова", "Владимировна", "06.06.1990", "92376335");
//        Passport irina = new Passport("Ирина", "Карамазова", "Николаевна", "17.08.1996", "77398872");
//        Passport irinaNew = new Passport("Ирина", "Карамазова", "Николаевна", "17.08.2002", "77388872");
//
//        igor.addPassport(igor);
//        vasya.addPassport(vasya);
//        vasya.addPassport(vasya);
//        elena.addPassport(elena);
//        irina.addPassport(irina);
//        irina.addPassport(irinaNew);
//
//        System.out.println(Passport.getInfo(77398872));


//        driver1.refill();
//        driver2.move();
//        driver3.stop();
//        driver1.drive((Car) car1);
//        driver2.drive((Truck) truck1);
//        driver3.drive((Bus) bus1);

//        BodyType.checkType(((Car) car1).getType());
//        Weight.checkType(((Truck) truck1).getWeight());
//        Capacity.checkType(((Bus) bus1).getCapacity());
//
//        ((Car) car1).setType(BodyType.COUPE);
//        ((Car) car1).getType().setBodyType("Купе");
//        BodyType.checkType(((Car) car1).getType());


//        System.out.println(((Truck) truck1).getLoadCapacity().getCapacity());
//        System.out.println(((Bus) bus1).getCapacity().getCapacity());

//        Transport car1 = new Car("Lada", "Granta", 2004, "Россия", "Жёлтый", 150, 0, "Седан", "о545ла22", 4, "Зима");
//        Transport train1 = new Train("Ласточка", "В-901", 2011, "Россия", null, 301, 3500, 0, "Белорусский вокзал", "Минск-Пассажирский", 11);
//        Transport train2 = new Train("Ленинград", "D-125", 2019, "Россия", null, 270, 1700, 0, "Ленинградский вокзал", "Ленинград-Пассажирский", 8);
//        Transport bus1 = new Bus("Ford", "Transit", 1998, "USA", "Green", 134);
//        Transport bus2 = new Bus("Peugeot", "Boxer", 2016, "French", "White", 150);
//        Transport bus3 = new Bus("Лада", "Газель", 2020, "Россия", "Серый", 145);
//        car1.installSeasonalTires();
//        train1.showInfo();
//        train2.showInfo();


//        Person maksim = new Person(1987, "Максим", "Минск", "бренд-менеджер");
//        Person anya = new Person(1993, "Аня", "Москва", "методист");
//        Person katya = new Person(1994, "Катя", "Калининград", "продакт-менеджер");
//        Person artem = new Person(1995, "Артём", null, null);
//        Person vladimir = new Person(2001, "Владимир", "Казань", "сейчас не работает");
//        maksim.meeting();
//        anya.meeting();
//        katya.meeting();
//        artem.meeting();
//        vladimir.meeting();

//        bus1.showInfo();
//        bus2.showInfo();
//        bus3.showInfo();
//        car1.refill();
//        train1.refill();
//        bus1.refill();

//        Animal gazelle = new Herbivorous("Газель", 4, "Саванна", 80, "Травка");
//        Animal gazelle1 = new Herbivorous("Газель", 4, "Саванна", 80, "Травка");
//
//        Animal giraffe = new Herbivorous("Жираф", 2, "Саванна", 55, "Листва");
//        Animal horse = new Herbivorous("Лошадь", 3, "Степь", 80, "Травка");
//        Animal hyena = new Predator("Гиена", 1, "Саванна", 60, "Мясо");
//        Animal tiger = new Predator("Тигр", 7, "Саванна", 50, "Мясо");
//        Animal bear = new Predator("Медведь", 6, "Чаща", 40, "Мясо и растительная пища");
//
//        Animal frog = new Amphibian("Лягушка", 1, "Болото");
//        Animal frog1 = new Amphibian("Лягушка", 1, "Болото");
//
//        Animal natrixNatrix = new Amphibian("Уж", 2, "Мангровые болота");
//        Animal peacock = new Flightless("Павлин", 3, "Поляны", "Пешком");
//        Animal penguin = new Flightless("Пингвин", 3, "Заполярье", "Пешком");
//        Animal dodoBird = new Flightless("Птица Додо", 1, "остров Маврикий", "Пешком");
//        Animal seagull = new Flying("Чайка", 2, "Морские порты", "Летает");
//        Animal albatross = new Flying("Альбатрос", 2, "Моря, океаны", "Летает");
//        Animal falcon = new Flying("Сокол", 3, "Степь", "Летает");


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

//        Animal.searchEqualsAnimalsEverywhere();
//        System.out.println(gazelle.equals(gazelle1));
//        System.out.println(frog.equals(frog1));
//        System.out.println(peacock.equals(penguin));


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

    static void matrix() {
        List<List<String>> matrix = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            matrix.add(i, new ArrayList<>());
            for (int j = 0; j < 8; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0)
                        matrix.get(i).add(j, "◯");
                    else
                        matrix.get(i).add(j, "●");
                } else {
                    if (j % 2 != 0)
                        matrix.get(i).add(j, "◯");
                    else
                        matrix.get(i).add(j, "●");
                    // можно сократить изначально заполнив массив одним типом полей
                }
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (j != 7)
                    System.out.print(matrix.get(i).get(j) + " ");
                else
                    System.out.print(matrix.get(i).get(j) + "\n");
            }
        }
    }


    public static void table() {
        Set<TableNumber> examples = new HashSet<>();
        boolean b = true;
        while (examples.size() < 15) {
            int i = (int) (Math.random() * 8) + 2;
            int j = (int) (Math.random() * 8) + 2;
            examples.add(new TableNumber(i, j));
        }
        for (TableNumber one : examples) {
            System.out.print(one);
        }
    }
}

