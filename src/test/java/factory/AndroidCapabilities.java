package factory;

import io.appium.java_client.android.options.UiAutomator2Options;

public class AndroidCapabilities implements ICapabilities<UiAutomator2Options> {

    @Override
    public UiAutomator2Options getConfigCapabilities() {
        UiAutomator2Options capabilitiesFirstWay = new UiAutomator2Options();
        capabilitiesFirstWay.setUdid("emulator-5554");
        capabilitiesFirstWay.setPlatformName("Android");
        capabilitiesFirstWay.setPlatformVersion("11.0");
        capabilitiesFirstWay.setDeviceName("Johan1");
        capabilitiesFirstWay.setAutomationName("UiAutomator2");
        capabilitiesFirstWay.setAppPackage("io.appium.android.apis");
        capabilitiesFirstWay.setAppActivity(".ApiDemos");
        capabilitiesFirstWay.setChromedriverExecutable("/the/path for chromium");
        return capabilitiesFirstWay;
    }
}
