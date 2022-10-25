package transport;

import java.time.LocalDate;

public class Car extends Transport {

    public class Key {
        private String remoteEngineStart;
        private String keylessEntry;


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

    private double engineVolume;
    private int transmission;
    private String bodyType;
    private String regNumber;
    private int sites;
    private String tires;

    public Car(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed, int transmission, String bodyType, String regNumber, int sites, String tires) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
        if (engineVolume > 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5;
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
        if (tires.toLowerCase().equals("зима") || tires.toLowerCase().equals("лето")) {
            this.tires = tires;
        } else {
            this.tires = "лето";
        }
    }

    @Override
    public void showInfo() {
        System.out.println(this.brand + "   " + this.model + "   " + this.engineVolume + "   " + this.color + "   " + this.productionYear + "   " + this.productionCountry);
    }

    @Override
    public void refill() {
        System.out.println("Бензин, Дизель, Эелектричество");

    }

    public void installSeasonalTires() {
        switch (LocalDate.now().getMonthValue()) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                this.tires = "Лето";
                break;
            case 11:
            case 12:
            case 1:
            case 2:
            case 3:
                this.tires = "Зима";
                break;
        }
    }
}

