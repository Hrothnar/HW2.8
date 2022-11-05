package transport;

public class Driver<T extends Transport> {

    private String name;
    private char drivingLicense;
    private double standing;
    private static final char[] LICENSES = new char[]{'B', 'b', 'C', 'c', 'D', 'd'};

    public final String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isBlank()) this.name = name;
    }

    public final char getDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(char drivingLicense) {
        try {
            for (char license : LICENSES) {
                if (drivingLicense == license) {
                    this.drivingLicense = drivingLicense;
                    break;
                }
            }
            if (this.drivingLicense == 0)
                throw new IllegalArgumentException("Необходимо указать корректный тип прав у водителя " + this.getName());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public final double getStanding() {
        return standing;
    }

    public void setStanding(double standing) {
        if (standing > 0) this.standing = standing;
    }

    public Driver(String name, char drivingLicense, double standing) {
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
