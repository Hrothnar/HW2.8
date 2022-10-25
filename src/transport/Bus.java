package transport;

public class Bus extends Transport {

    public Bus(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
    }

    @Override
    public void showInfo() {
        System.out.printf("Brand: %s | Model: %s | Production year: %d | Production country: %s |" +
                " Color: %s | Max speed: %d\n", brand, model, productionYear, productionCountry, color, maxSpeed);
    }

    @Override
    public void refill() {
        System.out.println("Бензин, Дизель");
    }
}
