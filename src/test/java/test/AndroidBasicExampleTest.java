package test;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

public class AndroidBasicExampleTest extends ConfigDrivers {

    @Test
    public void gestures() {
        androidDriver.findElement(AppiumBy.accessibilityId("Views")).click();
        androidDriver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
        androidDriver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
        WebElement element = androidDriver.findElement(AppiumBy.xpath("(//android.widget.TextView)[2]"));
        ((JavascriptExecutor) androidDriver).executeScript("mobile: longClickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId(), "duration", 2000
        ));
        System.out.println();
    }

    @Test
    public void uiAutomatortAndroidTest() {
        androidDriver.findElement(AppiumBy.accessibilityId("Preference")).click();
        //This is when you do not have to use attributes
        androidDriver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]"));
    }

    @Test
    public void desiredAndroidTEst() {
//        androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723"), capabilitiesSecondWay);
    }

}
