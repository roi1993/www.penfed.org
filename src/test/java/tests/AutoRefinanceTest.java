package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutoLoanApplicationPage;
import pages.AutoRefinancePage;

public class AutoRefinanceTest extends TestBase {

    @Test(groups = {"regressionTest"})
    public void checkNewAutoRefinaceRates() {

        AutoLoanApplicationPage autoLoanApplicationPage = new AutoLoanApplicationPage();
        autoLoanApplicationPage.NavigateToAutoRatesPage();
        AutoRefinancePage autoRefinancePage=new AutoRefinancePage();
        autoRefinancePage.refinanceButton.click();
        driver.findElement(By.xpath("//button[@data-pen-category='PRIVACY']")).click();
        autoRefinancePage.newAutoRefinanceLink.click();

        Assert.assertEquals(driver.findElement(By.xpath("//strong")).getText(),"NEW REFINANCE RATES");


    }
    @Test(groups = {"regressionTest"})
    public void checkUsedAutoRefinaceRates() {

        AutoLoanApplicationPage autoLoanApplicationPage = new AutoLoanApplicationPage();
        autoLoanApplicationPage.NavigateToAutoRatesPage();
        AutoRefinancePage autoRefinancePage=new AutoRefinancePage();
        autoRefinancePage.refinanceButton.click();
        driver.findElement(By.xpath("//button[@data-pen-category='PRIVACY']")).click();
        autoRefinancePage.usedAutoRefinanceLink.click();

        Assert.assertEquals(driver.findElement(By.xpath("(//strong)[6]")).getText(),"USED REFINANCE RATES");





    }
}
