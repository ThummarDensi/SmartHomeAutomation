
public class Thermostat extends Device {

    private int temperature;

    public Thermostat(String name) {
        super(name);
        this.temperature = 22;  // Default temperature
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println(name + " temperature set to " + temperature + "°C.");
    }

    @Override
    public void operate() {
        if (isOn) {
            System.out.println(name + " is already on.");
        } else {
            turnOn();
        }
        System.out.println(name + " is operating at " + temperature + "°C.");
    }
}
