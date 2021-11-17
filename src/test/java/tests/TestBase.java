package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilities.ConfigReader;
import utilities.Driver;
import java.lang.reflect.Method;
import java.time.Duration;

public class TestBase {
    protected WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){

        driver= Driver.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(ConfigReader.getProperty("url"));

    }

    @AfterMethod
    public void tearDownMethod(){

        Driver.quitDriver();

    }
}
