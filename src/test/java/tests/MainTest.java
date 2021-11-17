package tests;

import org.testng.annotations.Test;
import utilities.ConfigReader;

public class MainTest extends TestBase {


    @Test
    public void mainPage() {

        driver.get(ConfigReader.getProperty("url"));
    }
}
