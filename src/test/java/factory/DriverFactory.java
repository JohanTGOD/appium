package factory;

import utilitys.Devices;

public class DriverFactory {

    public ICapabilities getDriver(String option) {
        if (Devices.ANDROID.name().equals(option)) {
            return new AndroidCapabilities();
        } else {
            return new IosCapabilities();
        }
    }

}
