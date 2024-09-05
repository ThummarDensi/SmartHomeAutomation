
public class SecuritySystem extends Device {

    public SecuritySystem(String name) {
        super(name);
    }

    @Override
    public void operate() {
        if (isOn) {
            System.out.println(name + " is already armed.");
        } else {
            turnOn();
            System.out.println(name + " is now armed.");
        }
    }
}
