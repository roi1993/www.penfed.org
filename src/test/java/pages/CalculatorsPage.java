package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CalculatorsPage {
    public CalculatorsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@data-id='Learn']")
    public WebElement learnTab;

    @FindBy(xpath = "//a[@href='https://www.penfed.org/calculators']")
    public WebElement calculatorTab;


    @FindBy(xpath = "//a[@data-di-id='di-id-2114e928-99cb287b']")
    public WebElement moneyMarketSavingsCalculatorTab;

    public void NavigateToMoneyMarketSavingsCalculatorTab() {
        moneyMarketSavingsCalculatorTab.click();
    }

    public void NavigateToCalculatorsPage() {
        learnTab.click();
        calculatorTab.click();
    }
}
