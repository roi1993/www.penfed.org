package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath ="//span[@data-id='Learn']")
    public WebElement learnTab;

    @FindBy(xpath = "//a[@class='dtm-global-nav']")
    public WebElement calculatorTab;

    public void NavigateToCalculatorsPage(){
        learnTab.click();
        calculatorTab.click();
    }


}

