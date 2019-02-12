package examples.aaronhoskins.com.unittesting;

public class Car extends MotorVehicle {
    private int numOfDoors;
    private String color;
    private boolean isFourWheelDrive;
    private AutomotiveInformation automotiveInformation;



    public Car(String engine, String axels, String transmission, int numOfDoors, String color, boolean isFourWheelDrive, AutomotiveInformation automotiveInformation) {
        super(engine, axels, transmission);
        this.numOfDoors = numOfDoors;
        this.color = color;
        this.isFourWheelDrive = isFourWheelDrive;
        this.automotiveInformation = automotiveInformation;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFourWheelDrive() {
        return isFourWheelDrive;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        isFourWheelDrive = fourWheelDrive;
    }

    public AutomotiveInformation getAutomotiveInformation() {
        return automotiveInformation;
    }

    public void setAutomotiveInformation(AutomotiveInformation automotiveInformation) {
        this.automotiveInformation = automotiveInformation;
    }
}
