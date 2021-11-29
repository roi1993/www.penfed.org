package tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CarBuyingServicePage;
import pages.MortgageCalculatorsPage;

public class MortgageCalculatorsPageTest extends TestBase{


    @Test(groups = {"smokeTest"})
    public void navigateToMortgageCalculatorsPage() {

        MortgageCalculatorsPage mortgageCalculators = new MortgageCalculatorsPage();
        mortgageCalculators.navigateToMortgageCalculators();
//        Actions actions = new Actions(driver);
//        actions.moveToElement(mortgageCalculators.MortgageAndHomeEquity).moveToElement(mortgageCalculators.MortgageCalculators);

        Assert.assertEquals(driver.getTitle(),"Calculate a Mortgage Payment | PenFed Mortgage and Refinance Calculators");





    }
}
