package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.CalculatorsPage;
import pages.MoneyMarketSavingsCalculatorPage;

public class MoneyMarketSavingsCalculatorPageTest extends TestBase {
    @Test(groups = {"regressionTest"})
    public void navigateToMoneyMarketSavingsPage() throws InterruptedException{
        CalculatorsPage calculatorsPage = new CalculatorsPage();
        calculatorsPage.NavigateToCalculatorsPage();
        MoneyMarketSavingsCalculatorPage moneyMarketSavingsCalculatorPage = new MoneyMarketSavingsCalculatorPage();
        //moneyMarketSavingsCalculatorPage.moneyMarketSavingsCalculatorTab.click();

//        driver.get("https://www.penfed.org/calculators");
//        String link= driver.findElement(By.xpath("//a[@href='https://www.penfed.org/calculators/money-market-savings-calculator']")).getAttribute("href");
//        System.out.println(link);
//        driver.get(link);
        //moneyMarketSavingsCalculatorPage.initialAmount.sendKeys("5000");


    }
}