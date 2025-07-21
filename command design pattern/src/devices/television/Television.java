package devices.television;

public class Television {
    private String brand;
    private boolean isOn;

    public Television(String brand) {
        this.brand = brand;
        this.isOn = false;
    }

    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println(brand + " TV is now ON.");
        }
    }

    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println(brand + " TV is now OFF.");
        }
    }
}
