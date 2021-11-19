package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class NewAutoLoanCalculatorPage {


    public NewAutoLoanCalculatorPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "Purchase-Price")
    public WebElement purchasePrice;

    @FindBy(name = "Down-Payment")
    public WebElement downPayment;

    @FindBy(name = "Term-of-Loan")
    public WebElement termOfLoan;

    @FindBy(name = "Trade-In-Value")
    public WebElement tradeInValue;

    @FindBy(name="Amount-Owed-on-Trade")
    public WebElement amountOwedOnTrade;

    @FindBy(xpath = "//a[@href='#'] [@data-style='expand-right']")
    public WebElement calculateButton;

    @FindBy(xpath = "//span[@class='monthly-cost']")
    public WebElement monthlyCost;


}