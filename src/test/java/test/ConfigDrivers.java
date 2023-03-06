package test;

import factory.DriverFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.junit.Before;
import utilitys.AppiumConfig;
import utilitys.Devices;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class ConfigDrivers {

    private final String APPIUM_URL = String.format("http://%s:%s", AppiumConfig.HOST.value, AppiumConfig.PORT.value);
    protected AndroidDriver androidDriver;
    protected IOSDriver iosDriver;

    AppiumDriverLocalService appiumService = new AppiumServiceBuilder()
            .withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js"))
            .withIPAddress(AppiumConfig.HOST.value).usingPort(Integer.parseInt(AppiumConfig.PORT.value)).build();

    @Before
    public void before() throws MalformedURLException {
        String currentDevice = System.getenv("device");
        appiumService.start();
        if (Devices.IOS.name().equals(currentDevice)) {
            XCUITestOptions xcuiTestOptions = (XCUITestOptions) new DriverFactory().getDriver(currentDevice).getConfigCapabilities();
            iosDriver = new IOSDriver(new URL(APPIUM_URL), xcuiTestOptions);
        } else {
            UiAutomator2Options configCapabilities = (UiAutomator2Options) new DriverFactory().getDriver(currentDevice).getConfigCapabilities();
            androidDriver = new AndroidDriver(new URL(APPIUM_URL), configCapabilities);
        }
    }
}
