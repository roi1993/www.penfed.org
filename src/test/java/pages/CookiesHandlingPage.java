package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import javax.xml.xpath.XPath;

public class CookiesHandlingPage {

    public CookiesHandlingPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@data-pen-clickid='PF-BTN-CLK-GLOBAL-COOKIE-REJECT']")
    public WebElement cookiesRejectButton;

    public void click() {
        cookiesRejectButton.click();

    }
}
