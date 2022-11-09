package transport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Transport {

    private String brand;
    private String model;
    private double engineVolume;
    private Driver driver;
    private List<Mechanic> mechanics = new ArrayList<>(2);
    private List<Sponsor> sponsors = new ArrayList<>();
    public static ArrayList<Transport> autoPark = new ArrayList<>(12);

    {
        this.brand = "default";
        this.model = "default";
        this.engineVolume = 1;
    }

    protected Transport(String brand, String model, double engineVolume) {
        setBrand(brand);
        setModel(model);
        setEngineVolume(engineVolume);
    }

    public final String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand != null && !brand.isBlank())
            this.brand = brand;
    }

    public final String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model != null && !model.isBlank())
            this.model = model;
    }

    public final double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume > 0)
            this.engineVolume = engineVolume;
    }

    public ArrayList<Transport> getAutoPark() {
        return autoPark;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public List<Mechanic> getMechanics() {
        return mechanics;
    }

    public abstract void move();

    public abstract void stop();


    public static void showStatusOfDiagnostic() {
        try {
            for (Transport one : autoPark) {
                if (one instanceof Car && !((Car) one).isPassedTheDiagnostic()) {
                    if (!((Car) one).isPassedTheDiagnostic()) {
                        throw new Exception("Необходимо пройти диагностику транспортного средства " + one.getBrand() + " " + one.getModel());
                    }
                }
                if (one instanceof Truck) {
                    if (!((Truck) one).isPassedTheDiagnostic()) {
                        throw new Exception("Необходимо пройти диагностику транспортного средства " + one.getBrand() + " " + one.getModel());
                    }
                }
                if (one instanceof Bus)
                    System.out.println("Автобусы в диагностике не нуждаются");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void showInfo() {
        for (int i = 0; i < autoPark.size(); i++) {
            int j = 0, h = 0;
            System.out.printf("Автомобиль: %s %s | Водитель: %s\n", autoPark.get(i).getBrand(), autoPark.get(i).getModel(), autoPark.get(i).getDriver().getName());
            while (j < autoPark.get(i).mechanics.size()) {
                System.out.println("Механик: " + autoPark.get(i).mechanics.get(j).getName());
                j++;
            }
            while (h < autoPark.get(i).sponsors.size()) {
                System.out.println("Спонсор: " + autoPark.get(i).sponsors.get(h).getName());
                h++;
            }
            System.out.println();
        }
    }


}


