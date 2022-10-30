package transport;

public abstract class Driver<T extends Transport> {

    private String name;
    private boolean drivingLicense;
    private double standing;

    public final String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isBlank()) this.name = name;
    }

    public final boolean isDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(boolean drivingLicense) {
        this.drivingLicense = drivingLicense;
    }

    public final double getStanding() {
        return standing;
    }

    public void setStanding(double standing) {
        if (standing > 0) this.standing = standing;
    }

    public Driver(String name, boolean drivingLicense, double standing) {
        setName(name);
        setDrivingLicense(drivingLicense);
        setStanding(standing);
    }

    public void move() {
        System.out.println("Начать движение");

    }

    public void stop() {
        System.out.println("Остановиться и заглушить мотор");

    }

    public void refill() {
        System.out.println("Заправиться");
    }

    public void drive(T transport) {
        System.out.println("Водитель " + getName() + " управляет автомобилем " + transport.getBrand() + " " + transport.getModel() + " и будет участвовать в заезде");

    }

}
