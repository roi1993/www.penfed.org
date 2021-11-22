package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CookiesHandlingPage;
import pages.CreditCardPage;
import utilities.ConfigReader;

import java.util.ArrayList;
import java.util.List;

import static org.openqa.selenium.Keys.TAB;


public class CreditCardTest extends TestBase {
    WebDriver driver;

    @Test
    public void navigateCreditCardOverview() {
        CreditCardPage cd = new CreditCardPage();
        cd.navigateCreditCardOverviewPage();

        List<String> expected = new ArrayList<>();
        expected.add("Power Cash Rewards Visa Signature® Card");
        expected.add("Gold Visa® Card");
        expected.add("Platinum Rewards Visa Signature® Card");
        expected.add("PenFed Pathfinder Rewards Visa Signature® Card");

        String actual = cd.creditCardOverview.getText();
        Assert.assertEquals(actual, expected);


//        cd.creditCards.sendKeys(TAB);
//        cd.creditCardOverview.click();
//        cd.calculateBalanceTransfer.click();
//        cd.amount.sendKeys(ConfigReader.getProperty("7500" + Keys.TAB));
//        cd.currentInterestRate.sendKeys(ConfigReader.getProperty("18"));
//        cd.calculateButton.click();
//
//
//    }
//
//    @Test
//    public void navigateCreditCardOverviewPage() {
//        CookiesHandlingPage cookiesHandlingPage = new CookiesHandlingPage();
//        cookiesHandlingPage.click();
//        CreditCardPage cd = new CreditCardPage();
//        cd.creditCards.click();
//        Assert.assertTrue(driver.getTitle().equals("Web Orders"));
//        cd.creditCardOverview.click();

//        String expectedPage =
//        Assert.assertEquals();
//        String amount = "7500";
//        String interestRate = "18%";


    }

}

