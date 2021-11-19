package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;

public class HomePageTest extends TestBase {


    @Test(groups={"smokeTest"})
    public void homePage() {

        HomePage homePage= new HomePage();
        Assert.assertEquals(driver.getTitle(),"Mortgages, VA Loans, HELOC, Credit Cards, Auto & Personal Loans | PenFed.org");
    }
}
