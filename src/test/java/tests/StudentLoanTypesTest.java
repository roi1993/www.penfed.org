package tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.CookiesHandlingPage;
import pages.InSchoolStudentLoansPage;
import pages.StudentLoanTypesPage;

public class StudentLoanTypesTest extends TestBase{

    @Test(groups = {"regression2"})
    public void navigateToUndergraduateStudentLoans() throws InterruptedException {
        InSchoolStudentLoansPage inSchoolStudentLoansPage=new InSchoolStudentLoansPage();
        CookiesHandlingPage cookiesHandlingPage=new CookiesHandlingPage();
        cookiesHandlingPage.click();
        Thread.sleep(2000);
        Actions action = new Actions(driver);
        action.moveToElement(inSchoolStudentLoansPage.Loans).perform();
        inSchoolStudentLoansPage.InSchoolStudentLoans.click();
        StudentLoanTypesPage studentLoanTypesPage=new StudentLoanTypesPage();
        studentLoanTypesPage.UndergraduateLoan.click();




    }
    @Test(groups = {"regression2"})
    public void navigateToGraduateStudentLoans(){

    }
    @Test(groups = {"regression2"})
    public void navigateToNoEssayScholarship(){

    }


}
