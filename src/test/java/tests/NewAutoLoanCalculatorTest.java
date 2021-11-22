package tests;

import com.github.javafaker.Faker;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutoLoanApplicationPage;
import pages.CookiesHandlingPage;
import pages.HomePage;
import pages.NewAutoLoanCalculatorPage;

public class NewAutoLoanCalculatorTest extends TestBase{




@Test(groups={"regressionTest"})
     public void fillOutAllTheInformationInCalculator() throws InterruptedException {

     AutoLoanApplicationPage autoLoanApplicationPage=new AutoLoanApplicationPage();
     autoLoanApplicationPage.NavigateToAutoLoanPage();
     NewAutoLoanCalculatorPage newAutoLoanCalculatorPage=new NewAutoLoanCalculatorPage();
     newAutoLoanCalculatorPage.purchasePrice.clear();
     newAutoLoanCalculatorPage.purchasePrice.sendKeys("5000");
     newAutoLoanCalculatorPage.downPayment.click();
     newAutoLoanCalculatorPage.downPayment.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE);
     newAutoLoanCalculatorPage.downPayment.sendKeys("1000");
     newAutoLoanCalculatorPage.tradeInValue.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE);
     newAutoLoanCalculatorPage.tradeInValue.sendKeys("500");
     newAutoLoanCalculatorPage.amountOwedOnTrade.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE);
     newAutoLoanCalculatorPage.amountOwedOnTrade.sendKeys("400");
     Thread.sleep(3000);
     newAutoLoanCalculatorPage.calculateButton.click();
     String expectedPayments="111";
     String actualPayments=newAutoLoanCalculatorPage.monthlyCost.getText();

     Assert.assertEquals(actualPayments,expectedPayments);

}
@Test(groups={"regressionTest"})
public void checkDefaultValuesInCalculator() {


     AutoLoanApplicationPage autoLoanApplicationPage=new AutoLoanApplicationPage();
     autoLoanApplicationPage.NavigateToAutoLoanPage();
     CookiesHandlingPage cookiesHandlingPage=new CookiesHandlingPage();
     cookiesHandlingPage.click();
     NewAutoLoanCalculatorPage newAutoLoanCalculatorPage=new NewAutoLoanCalculatorPage();
     newAutoLoanCalculatorPage.calculateButton.click();
     String expectedPayments="571";
     String actualPayments=newAutoLoanCalculatorPage.monthlyCost.getText();

     Assert.assertEquals(actualPayments,expectedPayments);


}
@Test(groups={"regressionTest"})
     public void checkMinBoundaryValuesForPurchasePriseInCalculator() throws InterruptedException {

     AutoLoanApplicationPage autoLoanApplicationPage=new AutoLoanApplicationPage();
     autoLoanApplicationPage.NavigateToAutoLoanPage();
     NewAutoLoanCalculatorPage newAutoLoanCalculatorPage=new NewAutoLoanCalculatorPage();
     newAutoLoanCalculatorPage.purchasePrice.clear();
     newAutoLoanCalculatorPage.purchasePrice.sendKeys("500");
     CookiesHandlingPage cookiesHandlingPage=new CookiesHandlingPage();
     cookiesHandlingPage.click();
     Thread.sleep(2000);
     newAutoLoanCalculatorPage.calculateButton.click();
     String expectedPayments="14";
     String actualPayments=newAutoLoanCalculatorPage.monthlyCost.getText();

     Assert.assertEquals(actualPayments,expectedPayments);

}
     @Test(groups={"regressionTest"})
     public void checkMaxBoundaryValuesForPurchasePriseInCalculator() throws InterruptedException {

          AutoLoanApplicationPage autoLoanApplicationPage=new AutoLoanApplicationPage();
          autoLoanApplicationPage.NavigateToAutoLoanPage();
          NewAutoLoanCalculatorPage newAutoLoanCalculatorPage=new NewAutoLoanCalculatorPage();
          newAutoLoanCalculatorPage.purchasePrice.clear();
          newAutoLoanCalculatorPage.purchasePrice.sendKeys("999999999");
          CookiesHandlingPage cookiesHandlingPage=new CookiesHandlingPage();
          cookiesHandlingPage.click();
          Thread.sleep(2000);
          newAutoLoanCalculatorPage.calculateButton.click();
          String expectedPayments="28,550,993";
          String actualPayments=newAutoLoanCalculatorPage.monthlyCost.getText();

          Assert.assertEquals(actualPayments,expectedPayments);

     }

}




