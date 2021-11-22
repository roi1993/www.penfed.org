package tests;

import org.testng.annotations.Test;
import pages.AutoLoanApplicationPage;
import pages.AutoRefinancePage;
import pages.PurchasePage;

public class PurchaseTest extends TestBase {

    @Test(groups = {"regressionTest"})
    public void checkPurchaseRatesforNewCarBuyingServise() {

        AutoLoanApplicationPage autoLoanApplicationPage = new AutoLoanApplicationPage();
        autoLoanApplicationPage.NavigateToAutoRatesPage();
        AutoRefinancePage autoRefinancePage = new AutoRefinancePage();
        autoRefinancePage.purchaseButton.click();
        PurchasePage purchasePage = new PurchasePage();



    }

}
