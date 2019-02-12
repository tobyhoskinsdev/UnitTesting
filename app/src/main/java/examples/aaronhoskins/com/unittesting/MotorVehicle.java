package examples.aaronhoskins.com.unittesting;

public class MotorVehicle {
    private String engine;
    private String axels;
    private String transmission;

    public MotorVehicle() {
    }

    public MotorVehicle(String engine, String axels, String transmission) {
        this.engine = engine;
        this.axels = axels;
        this.transmission = transmission;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getAxels() {
        return axels;
    }

    public void setAxels(String axels) {
        this.axels = axels;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
}
