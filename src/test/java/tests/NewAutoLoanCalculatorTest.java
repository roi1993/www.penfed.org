package tests;

import com.github.javafaker.Faker;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutoLoanApplicationPage;
import pages.HomePage;
import pages.NewAutoLoanCalculatorPage;

public class NewAutoLoanCalculatorTest extends TestBase{


     ///Faker faker=new Faker();

@Test
     public void fillOutAllTheInformationInCalculator(){
     AutoLoanApplicationPage autoLoanApplicationPage=new AutoLoanApplicationPage();
     autoLoanApplicationPage.NavigateToAutoLoanPage();
     NewAutoLoanCalculatorPage newAutoLoanCalculatorPage=new NewAutoLoanCalculatorPage();
     newAutoLoanCalculatorPage.purchasePrice.clear();
     newAutoLoanCalculatorPage.purchasePrice.sendKeys("2000");
     newAutoLoanCalculatorPage.downPayment.click();
     newAutoLoanCalculatorPage.downPayment.clear();
     newAutoLoanCalculatorPage.downPayment.sendKeys("1000");
     newAutoLoanCalculatorPage.tradeInValue.clear();
     newAutoLoanCalculatorPage.tradeInValue.sendKeys("500");
     newAutoLoanCalculatorPage.amountOwedOnTrade.clear();
     newAutoLoanCalculatorPage.amountOwedOnTrade.sendKeys("400");
     newAutoLoanCalculatorPage.calculateButton.click();
     String expectedPayments="26";
     String actualPayments=newAutoLoanCalculatorPage.monthlyCost.getText();
     Assert.assertEquals(actualPayments,expectedPayments);





}
@Test
     public void checkDefaultValuesInCalculator(){

}
@Test
     public void checkBoundaryValuesInCalculatorForPurchasePrice(){

}






}
