package examples.aaronhoskins.com.unittesting;

public class AutomotiveInformation {
    private String make;
    private String model;


    public AutomotiveInformation(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        Util.someMethod();
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
