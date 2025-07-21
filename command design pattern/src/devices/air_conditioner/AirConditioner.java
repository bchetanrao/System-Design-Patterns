package devices.air_conditioner;
public class AirConditioner {
    private final String model; // Intrinsic state
    private boolean isOn; // Extrinsic state

    public AirConditioner(String model) {
        this.model = model;
        this.isOn = false;
    }

    public void turnOn() {
        isOn = true;
        System.out.println("Air Conditioner " + model + " is now ON.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Air Conditioner " + model + " is now OFF.");
    }

    public void setTemperature(int temperature) {
        if (isOn) {
            System.out.println("Setting temperature of " + model + " to " + temperature + " degrees.");
        } else {
            System.out.println("Cannot set temperature. " + model + " is OFF.");
        }
    }
}