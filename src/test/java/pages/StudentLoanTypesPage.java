package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StudentLoanTypesPage {

    public StudentLoanTypesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "SEE COSIGNED & NON-COSIGNED LOANS")
    public WebElement UndergraduateLoan;

    @FindBy(linkText = "Graduate Student Loans")
    public WebElement GraduateLoan;

    @FindBy(linkText = "No Essay Scholarships")
    public WebElement NoEssayScholarships;

}
