package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PopUpHandlingForStudentLoan {
    public PopUpHandlingForStudentLoan(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

   @FindBy(id = "continue")
    public WebElement continueButton;

    public void accept() {
        continueButton.click();

    }
}
