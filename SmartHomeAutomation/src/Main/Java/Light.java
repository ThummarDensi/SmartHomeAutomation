
public class Light extends Device {

    public Light(String name) {
        super(name);
    }

    @Override
    public void operate() {
        if (isOn) {
            System.out.println(name + " is already on.");
        } else {
            turnOn();
        }
    }
}
