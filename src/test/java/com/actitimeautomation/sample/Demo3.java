package com.actitimeautomation.sample;

import com.actitimeautomation.common.BaseClass;
import com.actitimeautomation.common.PropertyHandling;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class Demo3 extends BaseClass {
    WebDriver driver;git status
            
    PropertyHandling propertyHandling;
    @Test
    public void setUp() throws IOException {
        propertyHandling=new PropertyHandling();
       String browser= propertyHandling.getProperty("browser");
       launchBrowser(browser);
       driver=super.driver;
       String url= propertyHandling.getProperty("actitime");
       driver.get(url);
    }
}
