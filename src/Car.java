public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
    }

    Car() {
        this("default", "default", 1.5, "белый", 2000, "default");
    }
    void carList(){
        System.out.println(this.brand + "   " + this.model + "   " + this.engineVolume + "   " + this.color + "   " + this.productionYear + "   " + this.productionCountry);
    }
}
