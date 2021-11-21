package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutoLoanApplicationPage;
import pages.RefinanceNewAutoCalculatorPage;

import java.security.Key;

public class RefinanceNewAutoCalculatorTest extends TestBase {

    @Test(groups = {"regressionTest"})
    public void fillOutAllTheInformationInRefinanceCalculator() throws InterruptedException {

        AutoLoanApplicationPage autoLoanApplicationPage = new AutoLoanApplicationPage();
        autoLoanApplicationPage.NavigateToAutoLoanPage();
        RefinanceNewAutoCalculatorPage refinanceNewAutoCalculatorPage=new RefinanceNewAutoCalculatorPage();
        driver.findElement(By.xpath("//button[@data-pen-category='PRIVACY']")).click();
        refinanceNewAutoCalculatorPage.refinanceCalculator.click();
        refinanceNewAutoCalculatorPage.loanAmount.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
        Thread.sleep(3000);
        refinanceNewAutoCalculatorPage.loanAmount.sendKeys("3000");
        refinanceNewAutoCalculatorPage.buttonCompare.click();
        String expected="$2";
        //String expected="$14";
        String actual= refinanceNewAutoCalculatorPage.differencePerMonth.getText();

        Assert.assertEquals(actual,expected);

    }

    @Test(groups = {"regressionTest"})
    public void leaveDefaultInformationInRefinanceCalculator() throws InterruptedException {

        AutoLoanApplicationPage autoLoanApplicationPage = new AutoLoanApplicationPage();
        autoLoanApplicationPage.NavigateToAutoLoanPage();
        RefinanceNewAutoCalculatorPage refinanceNewAutoCalculatorPage=new RefinanceNewAutoCalculatorPage();
        driver.findElement(By.xpath("//button[@data-pen-category='PRIVACY']")).click();
        refinanceNewAutoCalculatorPage.refinanceCalculator.click();
        refinanceNewAutoCalculatorPage.buttonCompare.click();
        String expected="$16";
        //String expected="$14";
        String actual= refinanceNewAutoCalculatorPage.differencePerMonth.getText();

        Assert.assertEquals(actual,expected);

    }
    @Test(groups = {"regressionTest"})
    public void maxAllowedLoanamountInRefinanceCalculator() throws InterruptedException {

        AutoLoanApplicationPage autoLoanApplicationPage = new AutoLoanApplicationPage();
        autoLoanApplicationPage.NavigateToAutoLoanPage();
        RefinanceNewAutoCalculatorPage refinanceNewAutoCalculatorPage=new RefinanceNewAutoCalculatorPage();
        driver.findElement(By.xpath("//button[@data-pen-category='PRIVACY']")).click();
        refinanceNewAutoCalculatorPage.refinanceCalculator.click();
        refinanceNewAutoCalculatorPage.loanAmount.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
        Thread.sleep(3000);
        refinanceNewAutoCalculatorPage.loanAmount.sendKeys("100000");
        refinanceNewAutoCalculatorPage.buttonCompare.click();
        String expected="$78";
        //String expected="$14";
        String actual= refinanceNewAutoCalculatorPage.differencePerMonth.getText();

        Assert.assertEquals(actual,expected);

    }


}
