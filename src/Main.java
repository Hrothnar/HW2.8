import java.awt.geom.FlatteningPathIterator;
import java.util.concurrent.Flow;
import transport.Car;
import transport.Car.Key;
import transport.Car.Insurance;

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

        Car lada = new transport.Car("Lada", "Granta", 1.7, "жёлтый", 2015, "Россия", 0, null, "о545ла22", 0, "Зима" );
        lada.changeWheels();
        Key ladaKey = lada.new Key("s", "sd");
        Insurance ladaIns = lada.new Insurance(8,24500, "222333446");
        ladaIns.setNumber("3333333");


        System.out.println(lada.toString());
        System.out.println(ladaKey);
        System.out.println(ladaIns);

//        Flower roza = new Flower("Роза", null, "Голландия", 35.59, 0);
//
//        Flower hrizantema = new Flower("Хризантема", null, null, 15.15, 5);
//
//        Flower pion = new Flower("Пион", null, "Англия", 69.99, 1);
//
//        Flower gipsofila = new Flower("Гипсофила", null, "Турция", 19.54, 10);

//        roza.getInformation();
//        hrizantema.getInformation();
//        pion.getInformation();
//        gipsofila.getInformation();

//        Bouquet bouquet1 = new Bouquet();
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
//        Bouquet bouquet2 = new Bouquet();
//        bouquet2.addFlower(pion);
//        bouquet2.addFlower(pion);
//        bouquet2.addFlower(hrizantema);
//        bouquet2.bouquetInfo();


    }

}