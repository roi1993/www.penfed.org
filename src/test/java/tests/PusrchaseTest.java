package tests;

import org.testng.annotations.Test;
import pages.AutoLoanApplicationPage;
import pages.AutoRefinancePage;
import pages.PurchasePage;

public class PusrchaseTest extends TestBase {

    @Test(groups = {"regressionTest"})
    public void checkPurchaseRates() {

        AutoLoanApplicationPage autoLoanApplicationPage = new AutoLoanApplicationPage();
        autoLoanApplicationPage.NavigateToAutoRatesPage();
        AutoRefinancePage autoRefinancePage = new AutoRefinancePage();
        autoRefinancePage.purchaseButton.click();
        PurchasePage purchasePage = new PurchasePage();


    }

}
