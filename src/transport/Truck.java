package transport;

public class Truck extends Transport implements Competing {

    public Truck(String brand, String model, double engineVolume) {
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
        System.out.println("Лучшее время круга у " + super.getBrand() + " " + super.getModel() + " 6:24");

    }

    @Override
    public String maxSpeed() {
        return "210 км/ч";
    }
}
