package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PopUpHandling {
    public PopUpHandling(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@data-pen-clickid='PF-BTN-CLK-GLOBAL-COOKIE-REJECT']")
    public WebElement continueButton;

    public void accept() {
        continueButton.click();

    }
}
