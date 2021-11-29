package tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutoLoanApplicationPage;
import pages.CookiesHandlingPage;
import pages.InSchoolStudentLoansPage;

public class InSchoolStudentLoansPageTest extends TestBase {

    @Test(groups = {"smokeTest2"})
    public void navigateToInSchoolStudentLoanPage() throws InterruptedException {
        //logger.info("Smoke Test");
        InSchoolStudentLoansPage inSchoolStudentLoansPage=new InSchoolStudentLoansPage();
        CookiesHandlingPage cookiesHandlingPage=new CookiesHandlingPage();
        cookiesHandlingPage.click();
        Thread.sleep(2000);
        Actions action = new Actions(driver);
        action.moveToElement(inSchoolStudentLoansPage.Loans).perform();
        inSchoolStudentLoansPage.InSchoolStudentLoans.click();

        String expected="Student Loans | PenFed";
        Assert.assertEquals(driver.getTitle(),expected);



    }



}
