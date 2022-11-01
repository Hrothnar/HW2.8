package transport;

public class DriverB<T extends Car & Competing> extends Driver<T> {

    public DriverB(String name, boolean drivingLicense, double standing) {
        super(name, drivingLicense, standing);
    }

}
