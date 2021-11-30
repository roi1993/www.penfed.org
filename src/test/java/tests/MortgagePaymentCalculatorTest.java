package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;

public class MortgagePaymentCalculatorTest extends TestBase{

    @Test(groups={"regressionTest"}, dataProvider = "mortgagePaymentsData")
    public void calculateMortgagePaymentWithFullInfo(String priceOfHome, String downPayment, String interestRate) throws InterruptedException{
        MortgageCalculatorsPage mortgageCalculatorsPage = new MortgageCalculatorsPage();
        mortgageCalculatorsPage.navigateToMortgageCalculators();
        CookiesHandlingPage cookiesHandlingPage = new CookiesHandlingPage();
        cookiesHandlingPage.click();
        MortgagePaymentCalculatorPage mortgagePaymentCalculatorPage = new MortgagePaymentCalculatorPage();
//        mortgagePaymentCalculatorPage.MortPayCal.click();
        mortgagePaymentCalculatorPage.priceOfTheHomeOfMortPayCal.sendKeys(priceOfHome);
        mortgagePaymentCalculatorPage.downPaymentOfMortPayCal.sendKeys(downPayment);
        Select loanTerm = new Select(mortgagePaymentCalculatorPage.loanTermOfMortPayCal);
        loanTerm.selectByValue("180");
        mortgagePaymentCalculatorPage.interestRateOfMortPayCal.sendKeys(interestRate);
        mortgagePaymentCalculatorPage.calculateButtonOfMortPayCal.click();
        String expectedResult = "$3,109.74";
        String actualResult = mortgagePaymentCalculatorPage.result.getText();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualResult,expectedResult);

    }

    @Test(groups={"regressionTest"}, dataProvider = "mortgagePaymentsData2")
    public void calculateMortgagePaymentWithPartialInfo( String downPayment, String interestRate) throws InterruptedException{
        MortgageCalculatorsPage mortgageCalculatorsPage = new MortgageCalculatorsPage();
        mortgageCalculatorsPage.navigateToMortgageCalculators();
        CookiesHandlingPage cookiesHandlingPage = new CookiesHandlingPage();
        cookiesHandlingPage.click();
        MortgagePaymentCalculatorPage mortgagePaymentCalculatorPage = new MortgagePaymentCalculatorPage();
//        mortgagePaymentCalculatorPage.MortPayCal.click();
        mortgagePaymentCalculatorPage.priceOfTheHomeOfMortPayCal.clear();
        mortgagePaymentCalculatorPage.priceOfTheHomeOfMortPayCal.sendKeys(Keys.TAB);
        mortgagePaymentCalculatorPage.downPaymentOfMortPayCal.sendKeys(downPayment,Keys.TAB,Keys.TAB);
        Select loanTerm = new Select(mortgagePaymentCalculatorPage.loanTermOfMortPayCal);
        loanTerm.selectByValue("180");
        mortgagePaymentCalculatorPage.interestRateOfMortPayCal.sendKeys(interestRate);
        mortgagePaymentCalculatorPage.calculateButtonOfMortPayCal.click();
        String expectedResult = "rgba(170, 170, 170, 1)";
        String actualResult = mortgagePaymentCalculatorPage.partialInfoElement.getCssValue("color").trim();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualResult,expectedResult);

//        System.out.println( mortgagePaymentCalculatorPage.partialInfoElement.getCssValue("color").trim());




    }

    @DataProvider(name="mortgagePaymentsData")
    public Object[][] getData(){

        Object[][] data = {{"450000","15000","3.5"},{"350000","10000","2.5"}};
        return data;
    }

    @DataProvider(name="mortgagePaymentsData2")
    public Object[][] getData2(){

        Object[][] data = {{"15000","3.5"},{"10000","2.5"}};
        return data;
    }


}
