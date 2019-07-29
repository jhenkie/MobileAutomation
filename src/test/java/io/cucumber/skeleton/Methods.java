package io.cucumber.skeleton;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import static java.lang.Thread.*;

public class Methods extends Setup {
    public Methods() {
    }

    //Click element
    public void click(By selector) {
        int time=0;
        boolean found=false;
        //improve the functionality so it would keep trying in 5 seconds
        while(time<5) {
            List<WebElement> ele=  driver.findElements(selector);
            //When element found
            if(ele.size()>0) {
                found = true;
                break;
            }
            //try next attempt
            else {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                time = time + 1;
            }
        }
        if(found) {
            driver.findElement(selector).click();
        }else {
            Assert.fail("element not found");
        }
    }

    //Accept alert
    public boolean isAlertPresent(){
        try{
            Alert a = new WebDriverWait(driver, 4).until(ExpectedConditions.alertIsPresent());
            if(a!=null){
                driver.switchTo().alert().accept();
                return true;
            }else{
                throw new Throwable();
            }
        }
        catch (Throwable e) {
            return false;
        }
    }

    //Fill in text
    public void fillInText(String text, By selector) {
        click(selector);
        driver.findElement(selector).sendKeys(text);
    }

    //Scroll page (can be applied for multiple direction)
    public static void scrollIos(String direction){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        HashMap<String, String> scrollObject = new HashMap<String, String>();
        scrollObject.put("direction", direction);
        js.executeScript("mobile: swipe", scrollObject);
    }

    //Verify element
    public void verifyElement(String text, By selector) {
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.presenceOfElementLocated(selector));
        Assert.assertEquals(text, driver.findElement(selector).getText());
    }

    //Verify element contains
    public void verifyElementContains(String text, By selector) {
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.presenceOfElementLocated(selector));
        Assert.assertTrue(driver.findElement(selector).getText().contains(text));
    }

}

