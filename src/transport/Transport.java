package transport;

import java.time.LocalDate;

public abstract class Transport {

    String brand;
    String model;
    int productionYear;
    String productionCountry;
    String color;
    int maxSpeed;


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color != null && !color.isBlank()) {
            this.color = color;
        } else {
            this.color = "default";
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed > 0) {
            this.maxSpeed = maxSpeed;
        } else {
            this.maxSpeed = 100;
        }
    }

    public Transport(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed) {
        if (brand != null && !brand.isBlank()) {
            this.brand = brand;
        } else {
            this.brand = "default";
        }
        if (model != null && !model.isBlank()) {
            this.model = model;
        } else {
            this.model = "default";
        }
        if (productionYear > 1900) {
            this.productionYear = productionYear;
        } else {
            this.productionYear = LocalDate.now().getYear();
        }
        if (productionCountry != null && !productionCountry.isBlank()) {
            this.productionCountry = productionCountry;
        } else {
            this.productionCountry = "default";
        }
        if (color != null && !color.isBlank()) {
            this.color = color;
        } else {
            this.color = "default";
        }
        if (maxSpeed > 0) {
            this.maxSpeed = maxSpeed;
        } else {
            this.maxSpeed = 100;
        }
    }

    public void showInfo() {

    }
    public abstract void refill();

}
