package transport;

public class Mechanic<T extends Transport> {

    private String name;
    private String workplace;
    private T[] transport;

    public Mechanic(String name, String workplace, T... transport) {
        this.name = name;
        this.workplace = workplace;
        this.transport = transport;
    }

    public String getName() {
        return name;
    }

    public String getWorkplace() {
        return workplace;
    }

    public T[] getTransport() {
        return transport;
    }

    public void doDiagnostic(T transport) {
        if (transport instanceof Car)
            ((Car) transport).passDiagnostics();
        if (transport instanceof Truck)
            ((Truck) transport).passDiagnostics();
    }

    public void repairTransport() {
        for (Transport one : transport)
            System.out.println("Машина " + one.getBrand() + " " + one.getModel() + " отремонтирована");
    }

}
