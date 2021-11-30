package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AffordabiltyCalculatorPage;
import pages.CookiesHandlingPage;
import pages.MortgageCalculatorsPage;
import pages.MortgagePaymentCalculatorPage;
import utilities.Driver;

import javax.swing.*;
import java.security.Key;

public class AffordabilityCalculatorTest {

    @Test(groups={"regressionTest"}, dataProvider = "affordabilityCalcData")
    public void calculateAffordabilityWithFullInfo(String income, String debt, String downPayment) throws InterruptedException{
        MortgageCalculatorsPage mortgageCalculatorsPage = new MortgageCalculatorsPage();
        mortgageCalculatorsPage.navigateToMortgageCalculators();
        CookiesHandlingPage cookiesHandlingPage = new CookiesHandlingPage();
        cookiesHandlingPage.click();
        AffordabiltyCalculatorPage affordabiltyCalculatorPage = new AffordabiltyCalculatorPage();
        affordabiltyCalculatorPage.affordabilityTab.click();
        affordabiltyCalculatorPage.annualIncome.sendKeys(Keys.BACK_SPACE,income,Keys.TAB,Keys.TAB);
        affordabiltyCalculatorPage.monthlyDebts.sendKeys(Keys.BACK_SPACE,debt,Keys.TAB);
        affordabiltyCalculatorPage.downPayment.sendKeys(Keys.BACK_SPACE,downPayment,Keys.TAB,Keys.TAB);
        Select loanTerm = new Select(affordabiltyCalculatorPage.loanTerms);
        loanTerm.selectByValue("15");
        affordabiltyCalculatorPage.affordabilityCalculateButton.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(Driver.getDriver().getPageSource().contains("RATIO SLIDER"));

    }
//need to fix issues under actions
    @Test(groups={"regressionTest"}, dataProvider = "affordabilityCalcData")
    public void moveRatioSliderAllTheWayToRight(String income, String debt, String downPayment) throws InterruptedException{
        MortgageCalculatorsPage mortgageCalculatorsPage = new MortgageCalculatorsPage();
        mortgageCalculatorsPage.navigateToMortgageCalculators();
        CookiesHandlingPage cookiesHandlingPage = new CookiesHandlingPage();
        cookiesHandlingPage.click();
        AffordabiltyCalculatorPage affordabiltyCalculatorPage = new AffordabiltyCalculatorPage();
        affordabiltyCalculatorPage.affordabilityTab.click();
        affordabiltyCalculatorPage.annualIncome.sendKeys(Keys.BACK_SPACE,income,Keys.TAB,Keys.TAB);
        affordabiltyCalculatorPage.monthlyDebts.sendKeys(Keys.BACK_SPACE,debt,Keys.TAB);
        affordabiltyCalculatorPage.downPayment.sendKeys(Keys.BACK_SPACE,downPayment,Keys.TAB,Keys.TAB);
        Select loanTerm = new Select(affordabiltyCalculatorPage.loanTerms);
        loanTerm.selectByValue("15");
        affordabiltyCalculatorPage.affordabilityCalculateButton.click();
        Driver.getDriver().switchTo().frame(0);
        Actions move = new Actions(Driver.getDriver());
        Action action = (Action) move.dragAndDropBy(affordabiltyCalculatorPage.slider,30,0).build();


        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(Driver.getDriver().getPageSource().contains("$486,200.00"));

    }
//need to fix issues under action class
    @Test(groups={"regressionTest"}, dataProvider = "affordabilityCalcData")
    public void moveRatioSliderAllTheWayToLeft(String income, String debt, String downPayment) throws InterruptedException{
        MortgageCalculatorsPage mortgageCalculatorsPage = new MortgageCalculatorsPage();
        mortgageCalculatorsPage.navigateToMortgageCalculators();
        CookiesHandlingPage cookiesHandlingPage = new CookiesHandlingPage();
        cookiesHandlingPage.click();
        AffordabiltyCalculatorPage affordabiltyCalculatorPage = new AffordabiltyCalculatorPage();
        affordabiltyCalculatorPage.affordabilityTab.click();
        affordabiltyCalculatorPage.annualIncome.sendKeys(Keys.BACK_SPACE,income,Keys.TAB,Keys.TAB);
        affordabiltyCalculatorPage.monthlyDebts.sendKeys(Keys.BACK_SPACE,debt,Keys.TAB);
        affordabiltyCalculatorPage.downPayment.sendKeys(Keys.BACK_SPACE,downPayment,Keys.TAB,Keys.TAB);
        Select loanTerm = new Select(affordabiltyCalculatorPage.loanTerms);
        loanTerm.selectByValue("15");
        affordabiltyCalculatorPage.affordabilityCalculateButton.click();
        Driver.getDriver().switchTo().frame(0);
        Actions move = new Actions(Driver.getDriver());
        Action action = (Action) move.dragAndDropBy(affordabiltyCalculatorPage.slider,30,0).build();


        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(Driver.getDriver().getPageSource().contains("$486,200.00"));

    }

    @DataProvider(name="affordabilityCalcData")
    public Object[][] getData(){

        Object[][] data = {{"110000","500","11000"},{"550000","10000","20000"}};
        return data;
    }
}
