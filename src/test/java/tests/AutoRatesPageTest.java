package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutoLoanApplicationPage;

public class AutoRatesPageTest extends TestBase {

    @Test(groups = {"smokeTest"})
    public void navigateToCarBuyingServicePage() {

        AutoLoanApplicationPage autoLoanApplicationPage=new AutoLoanApplicationPage();
        autoLoanApplicationPage.NavigateToAutoRatesPage();

        Assert.assertEquals(driver.getTitle(),"Auto Loan Rates & Calculators | New, Used, & Refinancing | PenFed");
    }
}
