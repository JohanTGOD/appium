package factory;

import io.appium.java_client.ios.options.XCUITestOptions;

public class IosCapabilities implements ICapabilities<XCUITestOptions> {

    @Override
    public XCUITestOptions getConfigCapabilities() {
        XCUITestOptions capabilities = new XCUITestOptions();
        capabilities.setDeviceName("iPhone 14 Pro");
        capabilities.setPlatformName("IOS");
        capabilities.setPlatformVersion("16.2");
        capabilities.setApp("src/test/resources/UIKitCatalog.app");
        return capabilities;
    }
}
