package io.cucumber.skeleton;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

import static gherkin.deps.com.google.gson.internal.bind.TypeAdapters.URL;

public class Setup {
    //Use iOS driver
    public static IOSDriver driver;

    public IOSDriver initialisation() throws Exception {

        //First run if the driver is null
        if(driver == null) {
            DesiredCapabilities capabilities = new DesiredCapabilities();

            //Set capabilities for driver
            capabilities.setCapability("platformName", "iOS");
            capabilities.setCapability("platformVersion", "12.2");
            capabilities.setCapability("deviceName", "iPhone simulator");
            capabilities.setCapability("automationName", "XCUITest");
            capabilities.setCapability("app", "/Users/johanneshenkie/Desktop/iovio.app");
            capabilities.setCapability("noReset", true);
            capabilities.setCapability("connectHardwareKeyboard",false);
            capabilities.setCapability("newCommandTimeout",20);

            driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        }
        return driver;
    }
}
