package transport;

import java.time.LocalDate;

public class Car {

    public class Key {
        private String remoteEngineStart;
        private String keylessEntry;

        @Override
        public String toString() {
            return "Key{" +
                    "remoteEngineStart='" + remoteEngineStart + '\'' +
                    ", keylessEntry='" + keylessEntry + '\'' +
                    '}';
        }

        public Key(String remoteEngineStart, String keylessEntry) {
            if (remoteEngineStart != null && !remoteEngineStart.isBlank()) {
                this.remoteEngineStart = remoteEngineStart;
            } else {
                this.remoteEngineStart = "No";
            }
            if (keylessEntry != null && !keylessEntry.isBlank()) {
                this.keylessEntry = keylessEntry;
            } else {
                this.keylessEntry = "No";
            }

        }
    }

    public class Insurance {
        private int timeLimit;
        private int cost;
        private String number;

        public int getTimeLimit() {
            return timeLimit;
        }

        public void setTimeLimit(int timeLimit) {
            if (timeLimit > 2) {
                this.timeLimit = timeLimit;
            } else {
                this.timeLimit = timeLimit;
                System.out.println("Нужно продлить страховку");
            }
        }

        public int getCost() {
            return cost;
        }

        public void setCost(int cost) {
            if (cost > 0) {
                this.cost = cost;
            } else {
                this.cost = 1000;
            }
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            if (number.length() == 9) {
                this.number = number;
            } else {
                this.number = "Укажите верный номер страховки";
            }
        }

        @Override
        public String toString() {
            return "Insurance{" +
                    "timeLimit=" + timeLimit +
                    ", cost=" + cost +
                    ", number='" + number + '\'' +
                    '}';
        }

        public Insurance(int timeLimit, int cost, String number) {
            if (timeLimit > 0) {
                this.timeLimit = timeLimit;
            } else {
                this.timeLimit = 0;
            }
            if (cost > 0) {
                this.cost = cost;
            } else {
                this.cost = 1000;
            }
            if (number.length() == 9) {
                this.number = number;
            } else {
                this.number = "000000000";
            }



        }
    }

    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int productionYear;
    private String productionCountry;
    private int transmission;
    private String bodyType;
    private String regNumber;
    private int sites;
    private String wheels;

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry, int transmission, String bodyType, String regNumber, int sites, String wheels) {
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
        if (engineVolume > 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5;
        }
        if (color != null && !color.isBlank()) {
            this.color = color;
        } else {
            this.color = "default";
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
        if (transmission > 0) {
            this.transmission = transmission;
        } else {
            this.transmission = 5;
        }
        if (bodyType != null && !bodyType.isBlank()) {
            this.bodyType = bodyType;
        } else {
            this.bodyType = "default";
        }
        if (regNumber.length() > 6 && regNumber.length() < 10) {
            this.regNumber = regNumber;
        } else {
            this.regNumber = "x000xx000";
        }
        if (sites > 0) {
            this.sites = sites;
        } else {
            this.sites = 4;
        }
        if (wheels.toLowerCase().equals("зима") || wheels.toLowerCase().equals("лето")) {
            this.wheels = wheels;
        } else {
            this.bodyType = "лето";
        }
    }

    Car() {
        this("default", "default", 1.5, "default", LocalDate.now().getYear(), "default", 5, "default", "x000xx000", 4, "Лето");
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getSites() {
        return sites;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTransmission() {
        return transmission;
    }

    public void setTransmission(int transmission) {
        this.transmission = transmission;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getWheels() {
        return wheels;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    void carList() {
        System.out.println(this.brand + "   " + this.model + "   " + this.engineVolume + "   " + this.color + "   " + this.productionYear + "   " + this.productionCountry);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", productionYear=" + productionYear +
                ", productionCountry='" + productionCountry + '\'' +
                ", transmission=" + transmission +
                ", bodyType='" + bodyType + '\'' +
                ", regNumber='" + regNumber + '\'' +
                ", sites=" + sites +
                ", wheels='" + wheels + '\'' +
                '}';
    }

    public void changeWheels() {
        switch (LocalDate.now().getMonthValue()) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                this.wheels = "Лето";
                break;
            case 11:
            case 12:
            case 1:
            case 2:
            case 3:
                this.wheels = "Зима";
                break;
        }
    }
}

