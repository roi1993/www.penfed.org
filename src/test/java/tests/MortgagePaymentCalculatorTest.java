package tests;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;

public class MortgagePaymentCalculatorTest extends TestBase{

    @Test(groups={"regressionTest"})
    public void calculateMortgagePaymentWithFullInfo() throws InterruptedException{
        MortgageCalculatorsPage mortgageCalculatorsPage = new MortgageCalculatorsPage();
        mortgageCalculatorsPage.navigateToMortgageCalculators();
        CookiesHandlingPage cookiesHandlingPage = new CookiesHandlingPage();
        cookiesHandlingPage.click();
        MortgagePaymentCalculatorPage mortgagePaymentCalculatorPage = new MortgagePaymentCalculatorPage();
//        mortgagePaymentCalculatorPage.MortPayCal.click();
        mortgagePaymentCalculatorPage.priceOfTheHomeOfMortPayCal.sendKeys("450000");
        mortgagePaymentCalculatorPage.downPaymentOfMortPayCal.sendKeys("15000");
        Select loanTerm = new Select(mortgagePaymentCalculatorPage.loanTermOfMortPayCal);
        loanTerm.selectByValue("180");
        mortgagePaymentCalculatorPage.interestRateOfMortPayCal.sendKeys("3.5");
        mortgagePaymentCalculatorPage.calculateButtonOfMortPayCal.click();
        String expectedResult = "$3,109.74";
        String actualResult = mortgagePaymentCalculatorPage.result.getText();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualResult,expectedResult);

    }

    @Test(groups={"regressionTest"})
    public void calculateMortgagePaymentWithPartialInfo() throws InterruptedException{
        MortgageCalculatorsPage mortgageCalculatorsPage = new MortgageCalculatorsPage();
        mortgageCalculatorsPage.navigateToMortgageCalculators();
        CookiesHandlingPage cookiesHandlingPage = new CookiesHandlingPage();
        cookiesHandlingPage.click();
        MortgagePaymentCalculatorPage mortgagePaymentCalculatorPage = new MortgagePaymentCalculatorPage();
//        mortgagePaymentCalculatorPage.MortPayCal.click();
//        mortgagePaymentCalculatorPage.priceOfTheHomeOfMortPayCal.sendKeys("450000");
        mortgagePaymentCalculatorPage.downPaymentOfMortPayCal.sendKeys("15000");
        Select loanTerm = new Select(mortgagePaymentCalculatorPage.loanTermOfMortPayCal);
        loanTerm.selectByValue("180");
        mortgagePaymentCalculatorPage.interestRateOfMortPayCal.sendKeys("3.5");
        mortgagePaymentCalculatorPage.calculateButtonOfMortPayCal.click();
        String expectedResult = "$3,109.74";
        String actualResult = mortgagePaymentCalculatorPage.result.getText();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualResult,expectedResult);

    }


}
