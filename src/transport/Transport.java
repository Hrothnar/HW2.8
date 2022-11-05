package transport;

import java.util.Arrays;

public abstract class Transport {

    private String brand;
    private String model;
    private double engineVolume;
    private static Transport[] autoPark = autoPark = new Transport[1];


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


    public abstract void move();

    public abstract void stop();


    public static void addToPark(Transport... tr) {
        int j = 0;
        for (int i = 0; j < tr.length; i++) {
            if (autoPark[i] == null) {
                autoPark[i] = tr[j];
                j++;
                if (j != tr.length)
                    autoPark = Arrays.copyOf(autoPark, autoPark.length + 1);
            }
        }
    }

    public static void showStatusOfDiagnostic() throws Exception {
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
    }


}


