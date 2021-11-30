package tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CarBuyingServicePage;
import pages.MortgageCalculatorsPage;
import utilities.SeleniumUtils;

public class MortgageCalculatorsPageTest extends TestBase{


    @Test(groups = {"smokeTest"})
    public void navigateToMortgageCalculatorsPage() {

        MortgageCalculatorsPage mortgageCalculators = new MortgageCalculatorsPage();
//        mortgageCalculators.navigateToMortgageCalculators();
        SeleniumUtils utils = new SeleniumUtils();
        utils.hover(mortgageCalculators.MortgageAndHomeEquity);
        mortgageCalculators.MortgageCalculators.click();


        Assert.assertEquals(driver.getTitle(),"Calculate a Mortgage Payment | PenFed Mortgage and Refinance Calculators");





    }
}
