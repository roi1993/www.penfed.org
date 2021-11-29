package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MortgageCalculatorsPage {


    public MortgageCalculatorsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath="//span[@data-id='Mortgages']")
    public WebElement MortgageAndHomeEquity ;

    @FindBy(xpath = "//a[@data-clickid='PF-BTN-CLK-MORTGAGES-MORTGAGE_CALCULATORS']")
    public WebElement MortgageCalculators;


    public void navigateToMortgageCalculators(){
        MortgageAndHomeEquity.click();
        MortgageCalculators.click();
    }
}

