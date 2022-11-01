package transport;

public abstract class Transport {

    private String brand;
    private String model;
    private double engineVolume;


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


}


