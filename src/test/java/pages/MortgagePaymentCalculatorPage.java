package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MortgagePaymentCalculatorPage {

    public MortgagePaymentCalculatorPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@id='toggle-tab-705153362-tab-1']")
    public WebElement MortPayCal;

    @FindBy(xpath = "//input[@id='mortgage-homePrice']")
    public WebElement priceOfTheHomeOfMortPayCal;

    @FindBy(id = "mortgage-downPayment")
    public WebElement downPaymentOfMortPayCal;

    @FindBy(xpath = "//div//select[@id='mortgage-term']")
    public WebElement loanTermOfMortPayCal;

    @FindBy(xpath = "//div//input[@id='mortgage-interestRate']")
    public WebElement interestRateOfMortPayCal;

    @FindBy(id = "estimatemortgageCTA")
    public WebElement calculateButtonOfMortPayCal;

    @FindBy(xpath = "//div//span[@class='dkblue']")
    public WebElement result;

   @FindBy(xpath = "//div//canvas[@id='PITIChart']")
    public WebElement partialInfoResult;









}
