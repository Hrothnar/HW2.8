package transport;

public class Car extends Transport implements Competing {
    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void move() {

    }

    @Override
    public void stop() {

    }
    @Override
    public void pitStop() {
        System.out.println("Есть пит-строп");

    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга у легковых 4:48");

    }

    @Override
    public String maxSpeed() {
        return "290 км/ч";
    }
}

