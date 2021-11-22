package tests;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutoLoanApplicationPage;
import pages.AutoRefinancePage;
import pages.CookiesHandlingPage;
import pages.PurchasePage;

public class PurchaseTest extends TestBase {


    @Test(groups = {"regressionTest"})
    public void veryfyLinkForPurchaseRatesforNewCarBuyingServise() {

        AutoLoanApplicationPage autoLoanApplicationPage = new AutoLoanApplicationPage();
        autoLoanApplicationPage.NavigateToAutoRatesPage();
        AutoRefinancePage autoRefinancePage = new AutoRefinancePage();
        autoRefinancePage.purchaseButton.click();
        CookiesHandlingPage cookiesHandlingPage=new CookiesHandlingPage();
        cookiesHandlingPage.click();
        PurchasePage purchasePage = new PurchasePage();
        purchasePage.newCarBuyingService.click();
        String expected="Rates on Auto Loans | PenFed Car Buying Service | Used Car Loans";


        Assert.assertEquals(driver.getTitle(),expected);


    }

    @Test(groups = {"regressionTest"})
    public void veryfyLinkForPurchaseForNewAuto() {

        AutoLoanApplicationPage autoLoanApplicationPage = new AutoLoanApplicationPage();
        autoLoanApplicationPage.NavigateToAutoRatesPage();
        AutoRefinancePage autoRefinancePage = new AutoRefinancePage();
        autoRefinancePage.purchaseButton.click();
        CookiesHandlingPage cookiesHandlingPage=new CookiesHandlingPage();
        cookiesHandlingPage.click();
        PurchasePage purchasePage = new PurchasePage();
        purchasePage.newAutoPurchase.click();
        String expected="New Auto Loans from PenFed - Find, Compare, and Apply Today";

       Assert.assertEquals(driver.getTitle(),expected);


    }

    @Test(groups = {"regressionTest"})
    public void veryfyLinkForPurchase() {

        AutoLoanApplicationPage autoLoanApplicationPage = new AutoLoanApplicationPage();
        autoLoanApplicationPage.NavigateToAutoRatesPage();
        AutoRefinancePage autoRefinancePage = new AutoRefinancePage();
        autoRefinancePage.purchaseButton.click();
        CookiesHandlingPage cookiesHandlingPage=new CookiesHandlingPage();
        cookiesHandlingPage.click();
        PurchasePage purchasePage = new PurchasePage();
        purchasePage.newPaymentSaver.click();
        String expected="Payment Saver Auto Loans from PenFed - Find, Compare, and Apply Today";

        Assert.assertEquals(driver.getTitle(),expected);


    }

    @Test(groups = {"regressionTest"})
    public void veryfyLinkForRatesforNewCarBuyingServise() {

        AutoLoanApplicationPage autoLoanApplicationPage = new AutoLoanApplicationPage();
        autoLoanApplicationPage.NavigateToAutoRatesPage();
        AutoRefinancePage autoRefinancePage = new AutoRefinancePage();
        autoRefinancePage.purchaseButton.click();
        CookiesHandlingPage cookiesHandlingPage=new CookiesHandlingPage();
        cookiesHandlingPage.click();
        PurchasePage purchasePage = new PurchasePage();
        purchasePage.usedCarBuyingService.click();
        String expected="Rates on Auto Loans | PenFed Car Buying Service | Used Car Loans";

        Assert.assertEquals(driver.getTitle(),expected);


    }
}




