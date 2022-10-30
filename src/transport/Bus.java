package transport;

public class Bus extends Transport implements Competing {
    public Bus(String brand, String model, double engineVolume) {
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
        System.out.println("Лучшее время круга у автобусов 6:02");

    }

    @Override
    public String maxSpeed() {
        return "224 км/ч";
    }
}
