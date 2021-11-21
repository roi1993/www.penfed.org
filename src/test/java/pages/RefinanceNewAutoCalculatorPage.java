package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RefinanceNewAutoCalculatorPage {

    public RefinanceNewAutoCalculatorPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[contains(@id,'toggle-tab')])[3]")
    public WebElement refinanceCalculator;

    @FindBy(id = "loan-amount")
    public WebElement loanAmount;

    @FindBy(xpath = "//button[@class='pfui-button pfui-fluid pfui-btn-mort-cal btnSubmit calc-afford dtm-calculate']")
   public WebElement buttonCompare;

    @FindBy(xpath = "//span[@data-payment-difference='paymentDifference']")
    public WebElement differencePerMonth;


}
