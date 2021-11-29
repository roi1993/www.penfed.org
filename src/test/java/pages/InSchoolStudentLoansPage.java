package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class InSchoolStudentLoansPage {
    public InSchoolStudentLoansPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//span[@data-id='Personal Loans']")
    public WebElement Loans;

    @FindBy(linkText = "In-School Student Loans")
    public WebElement InSchoolStudentLoans;


}
