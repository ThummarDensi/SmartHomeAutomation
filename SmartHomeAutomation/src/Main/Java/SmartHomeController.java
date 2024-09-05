
import java.util.ArrayList;
import java.util.List;

public class SmartHomeController {

    private List<Device> devices;

    public SmartHomeController() {
        devices = new ArrayList<>();
    }

    public void addDevice(Device device) {
        devices.add(device);
    }

    public void controlDevice(String deviceName) {
        for (Device device : devices) {
            if (device.name.equalsIgnoreCase(deviceName)) {
                device.operate();
                return;
            }
        }
        System.out.println("Device " + deviceName + " not found.");
    }

    // Simulate learning user habits (simple rule-based)
    public void adjustSettingsBasedOnUsage() {
        for (Device device : devices) {
            if (device instanceof Thermostat && !device.isOn()) {
                ((Thermostat) device).setTemperature(20);  // Example: Lower temperature if off
                device.turnOn();
            }
        }
    }

    public static void main(String[] args) {
        SmartHomeController controller = new SmartHomeController();

        // Adding devices to the smart home
        Light livingRoomLight = new Light("Living Room Light");
        Thermostat thermostat = new Thermostat("Thermostat");
        SecuritySystem securitySystem = new SecuritySystem("Security System");

        controller.addDevice(livingRoomLight);
        controller.addDevice(thermostat);
        controller.addDevice(securitySystem);

        // Simulating user interaction
        controller.controlDevice("Living Room Light");
        controller.controlDevice("Thermostat");
        controller.controlDevice("Security System");

        // Simulate learning from usage
        controller.adjustSettingsBasedOnUsage();
    }
}
