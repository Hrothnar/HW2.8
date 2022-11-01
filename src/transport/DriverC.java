package transport;

public class DriverC<T extends Truck & Competing> extends Driver<T> {

    public DriverC(String name, boolean drivingLicense, double standing) {
        super(name, drivingLicense, standing);
    }


}
