package transport;

public class Train extends Transport {
    int tripCost;
    int travelTime;
    String departureStation;
    String endingStation;
    int numbersOfWagons;

    public Train(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed, int tripCost, int travelTime, String departureStation, String endingStation, int numbersOfWagons) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
        if (tripCost > 0) {
            this.tripCost = tripCost;
        } else {
            this.tripCost = 1000;
        }
        if (travelTime > 0) {
            this.travelTime = travelTime;
        } else {
            this.travelTime = 1;
        }
        if (departureStation != null && !departureStation.isBlank()) {
            this.departureStation = departureStation;
        } else {
            this.departureStation = "default";
        }
        if (endingStation != null && !endingStation.isBlank()) {
            this.endingStation = endingStation;
        } else {
            this.endingStation = "default";
        }
        if (numbersOfWagons > 0) {
            this.numbersOfWagons = numbersOfWagons;
        } else {
            this.numbersOfWagons = 1;
        }
    }

    public void showInfo() {
        System.out.printf("Brand: %s | Model: %s | Production year: %d | Production country: %s |" +
                " Color: %s | Max speed: %d | Trip cost: %d | Travel time: %d | Departure station: %s | " +
                "Ending station: %s | Numbers of wagons: %d\n", brand, model, productionYear, productionCountry,
                color, maxSpeed, tripCost, travelTime, departureStation, endingStation, numbersOfWagons);
    }

    @Override
    public void refill() {
        System.out.println("Дизель");
    }



}
