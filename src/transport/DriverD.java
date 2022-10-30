package transport;

public class DriverD<T extends Bus & Competing> extends Driver<T> {

    public DriverD(String name, boolean drivingLicense, double standing) {
        super(name, drivingLicense, standing);
    }

    @Override
    public void drive(T transport) {
        super.drive(transport);
    }
}
