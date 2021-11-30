package pages;

import org.jsoup.internal.FieldsAreNonnullByDefault;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AffordabiltyCalculatorPage {

    public AffordabiltyCalculatorPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@data-di-id='#toggle-tab-1353052451-tab-2']")
    public WebElement affordabilityTab;

    @FindBy(id = "afford-income")
    public WebElement annualIncome;

    @FindBy(id = "afford-debts")
    public WebElement monthlyDebts;

    @FindBy(id = "afford-down")
    public WebElement downPayment;

    @FindBy(xpath = "//div//select[@id='afford-term']")
    public WebElement loanTerms;

    @FindBy(id = "estimateaffordabilityCTA")
    public WebElement affordabilityCalculateButton;

    @FindBy(xpath = "//div//span[@class='ui-slider-handle ui-corner-all ui-state-default']")
    public WebElement slider;



}
