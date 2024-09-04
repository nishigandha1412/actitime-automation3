package com.actitimeautomation.sample;

import com.actitimeautomation.common.BaseClass;
import com.actitimeautomation.common.PropertyHandling;
import com.actitimeautomation.pages.LoginPage;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

public class Demo1 extends BaseClass {
    WebDriver driver;
    PropertyHandling propertyHandling;
    @Test
    public void setUp() throws IOException {
        PropertyHandling propertyHandling=new PropertyHandling();
       String browser= propertyHandling.getProperty("browser");
       launchBrowser(browser);
        driver=super.driver;
       String url= propertyHandling.getProperty("actitimeUrl");
       driver.get(url);

    }

}
