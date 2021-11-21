package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutoRefinancePage {


    public AutoRefinancePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath ="(//button[@class='button button--tab'])[2]")
    public WebElement refinanceButton;

    @FindBy(xpath = "//a[@href='/auto/refinance']")
    public WebElement newAutoRefinanceLink;

    @FindBy(xpath = "(//a[@href='/auto/refinance'])[2]")
    public WebElement usedAutoRefinanceLink;



}
