package devices;

public class Stereo implements Device {
    @Override
    public void turnOn() {
        System.out.println("devices.Stereo is now on");
    }

    @Override
    public void turnOff() {
        System.out.println("devices.Stereo is now off");
    }

    public void adjustVolume() {
        System.out.println("Volume adjusted");
    }
}
