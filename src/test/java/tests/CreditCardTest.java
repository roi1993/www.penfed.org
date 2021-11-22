package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.CreditCardPage;
import utilities.ConfigReader;

import static org.openqa.selenium.Keys.TAB;


public class CreditCardTest extends TestBase {
        WebDriver driver;

        public void navigateCreditCardOverviewPage() {
            CreditCardPage cd = new CreditCardPage();

            cd.creditCards.sendKeys(TAB);
            cd.creditCardOverview.click();
            cd.calculateBalanceTransfer.click();
            cd.amount.sendKeys(ConfigReader.getProperty("7500"+ Keys.TAB));
            cd.currentInterestRate.sendKeys(ConfigReader.getProperty("18"));
            cd.calculateButton.click();


        }
//
//        @Test
//    public void

    }

