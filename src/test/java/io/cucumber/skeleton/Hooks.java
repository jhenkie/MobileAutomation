package io.cucumber.skeleton;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks extends Methods {

    //Start appium server
    public Hooks() {
        AppiumServer AS = new AppiumServer();
        AS.startAppiumServer();
    }

    //Initialisation process, launch the app if we have run it before
    @Before
    public void beforeScenario(Scenario scenario) throws Exception {
        if(driver != null) {
            driver.launchApp();
        }else {
            initialisation();
        }
    }


    //Close application and take screenshot for every failed case
    @After()
    public void AfterSteps(Scenario scenario) {
        if (scenario.isFailed()) {
            scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES),"image/png");
        }
        driver.closeApp();
    }
}
