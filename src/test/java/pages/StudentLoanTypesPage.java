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

    @FindBy(linkText = "SEE LOAN OPTIONS")
    public WebElement GraduateLoan;

    @FindBy(linkText = "SEE SCHOLARSHIPS")
    public WebElement NoEssayScholarships;

}
