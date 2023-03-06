package test;

import io.appium.java_client.AppiumBy;
import org.junit.Test;

public class IosBasicExampleTest extends ConfigDrivers {

    @Test
    public void gestures() {
        iosDriver.findElement(AppiumBy.xpath("//XCUIElementTypeStaticText[@name='Date Picker']")).click();
    }
}
