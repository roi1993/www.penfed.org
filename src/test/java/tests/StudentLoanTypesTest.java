package tests;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CookiesHandlingPage;
import pages.InSchoolStudentLoansPage;
import pages.PopUpHandlingForStudentLoan;
import pages.StudentLoanTypesPage;
import utilities.SeleniumUtils;

import java.io.IOException;
import java.util.Set;


public class StudentLoanTypesTest extends TestBase{

    @Test(groups = {"regression2"})
    public void navigateToUndergraduateStudentLoans() throws InterruptedException, IOException {
        landOnLoansPage();
        StudentLoanTypesPage studentLoanTypesPage=new StudentLoanTypesPage();
        studentLoanTypesPage.UndergraduateLoan.click();
        acceptPopUp();
        Thread.sleep(3000);
        String newWindowTitle = driver.getTitle();
        SeleniumUtils.switchToWindow(newWindowTitle);
        String expected="PenFed Partnered with Ascent Funding ";


        Assert.assertEquals(driver.getTitle(),expected);


    }
    @Test(groups = {"regression2"})
    public void navigateToGraduateStudentLoans() throws InterruptedException {
        landOnLoansPage();
        StudentLoanTypesPage studentLoanTypesPage=new StudentLoanTypesPage();
        studentLoanTypesPage.GraduateLoan.click();
        acceptPopUp();
        Thread.sleep(3000);
        String newWindowTitle = driver.getTitle();
        SeleniumUtils.switchToWindow(newWindowTitle);
        String expected="PenFed Partnered with Ascent Funding ";


        Assert.assertEquals(driver.getTitle(),expected);


    }
    @Test(groups = {"regression2"})
    public void navigateToNoEssayScholarship() throws InterruptedException {
        landOnLoansPage();
        StudentLoanTypesPage studentLoanTypesPage=new StudentLoanTypesPage();
        studentLoanTypesPage.NoEssayScholarships.click();
        acceptPopUp();
        Thread.sleep(3000);
        String newWindowTitle = driver.getTitle();
        SeleniumUtils.switchToWindow(newWindowTitle);
        String expected="PenFed Partnered with Ascent Funding ";


        Assert.assertEquals(driver.getTitle(),expected);

    }






    public void landOnLoansPage() throws InterruptedException {
        InSchoolStudentLoansPage inSchoolStudentLoansPage=new InSchoolStudentLoansPage();
        CookiesHandlingPage cookiesHandlingPage=new CookiesHandlingPage();
        cookiesHandlingPage.click();
        Thread.sleep(2000);

        SeleniumUtils seleniumUtils=new SeleniumUtils();
        seleniumUtils.hover(inSchoolStudentLoansPage.Loans);
        inSchoolStudentLoansPage.InSchoolStudentLoans.click();

    }
    public void acceptPopUp(){
        PopUpHandlingForStudentLoan popUpHandling=new PopUpHandlingForStudentLoan();
        popUpHandling.accept();


    }



    }



