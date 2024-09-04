package com.actitimeautomation.sample;

import com.actitimeautomation.common.BaseClass;
import com.actitimeautomation.common.CommonUtil;
import com.actitimeautomation.common.PropertyHandling;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

public class FileUploadTest extends BaseClass {
    WebDriver driver;
    CommonUtil commonUtil;
    @BeforeClass
    public void setUp() throws IOException {
        PropertyHandling propertyHandling=new PropertyHandling();
        String browser = propertyHandling.getProperty("browser");
        launchBrowser(browser);
        driver=super.driver;
        driver.get(propertyHandling.getProperty("fileUploadUrl"));
        commonUtil=new CommonUtil(driver);
    }
    @Test
    public void verifyFileUpload() throws InterruptedException, IOException {
    commonUtil.waitForElementClickable(By.xpath("//span[text()='Add Files']"));
    driver.findElement(By.xpath("//span[text()='Add Files']"));
    Thread.sleep(5000);
    Runtime.getRuntime().exec("C:\\Users\\Lenovo\\Documents\\FileUploadScript.exe");
    }
}
