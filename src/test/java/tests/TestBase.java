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

    @BeforeMethod (alwaysRun = true)
    public void setUpMethod(){

        driver= Driver.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(ConfigReader.getProperty("url"));

        driver.manage().deleteAllCookies();

    }

    @AfterMethod (alwaysRun = true)
    public void tearDownMethod(){

       Driver.quitDriver();

    }
}
