package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutoLoanApplicationPage;

public class AutoLoanApplicationPageTest extends TestBase {


    @Test(groups = {"smokeTest"})
    public void navigateToAutoLoanApplicationPage() {

        AutoLoanApplicationPage autoLoanApplicationPage = new AutoLoanApplicationPage();
        autoLoanApplicationPage.NavigateToAutoLoanPage();
        Assert.assertEquals(driver.getTitle(), "Auto Loans - New, Used, Car Loan Refinancing | PenFed Credit Union");


    }
}
