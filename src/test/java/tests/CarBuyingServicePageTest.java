package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutoLoanApplicationPage;
import pages.CarBuyingServicePage;
import pages.FindNewCarPage;

public class CarBuyingServicePageTest extends TestBase {


    @Test(groups = {"smokeTest"})
    public void navigateToCarBuyingServicePage() {

        CarBuyingServicePage carBuyingServicePage = new CarBuyingServicePage();
        carBuyingServicePage.NavigateToCarBuyingServicePage();
        Assert.assertEquals(driver.getTitle(),"Rates on Auto Loans | PenFed Car Buying Service | Used Car Loans");




    }
}
