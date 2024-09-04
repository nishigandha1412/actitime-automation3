package com.actitimeautomation.sample;

import com.actitimeautomation.common.BaseClass;
import com.actitimeautomation.common.PropertyHandling;
import com.actitimeautomation.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

public class GitBashCode extends BaseClass {
    WebDriver driver;
    PropertyHandling propertyHandling;
    LoginPage loginPage;

    @BeforeClass
    public void setUp(ITestContext context) throws Exception {
        PropertyHandling PropertyHandling = new PropertyHandling();
        String browser = propertyHandling.getProperty("browser");
        driver = super.driver;
        String url = propertyHandling.getProperty("actitimeUrl");
        context.setAttribute("driver", driver);

    }

    @Test
    public void verifyLogin() throws Exception {
        String username = propertyHandling.getProperty("username");
        String password = propertyHandling.getProperty("password");
        loginPage.login(username, password);
    }
}


