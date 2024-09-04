package com.actitimeautomation.sample;

import com.actitimeautomation.common.BaseClass;
import com.actitimeautomation.common.PropertyHandling;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;

public class Demo2 extends BaseClass {
    WebDriver driver;
    PropertyHandling propertyHandling;
    @Test
    public void setUp() throws IOException {
        propertyHandling=new PropertyHandling();
       String browser= propertyHandling.getProperty("browser");
       launchBrowser(browser);
       driver=super.driver;
       String url= propertyHandling.getProperty("actitimeUrl");
       driver.get(url);
    }
}
