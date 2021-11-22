package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;



    public class CreditCardPage {

        public CreditCardPage() {
            PageFactory.initElements(Driver.getDriver(), this);
        }

        @FindBy(xpath = "//span[@data-id='Cards']")
        public WebElement creditCards;

        @FindBy(xpath = "//a[@data-id='Cards: Our Cards: Cards Overview']")
        public WebElement creditCardOverview;

        @FindBy(xpath = " //a[@data-di-id='di-id-fa8a9a8c-36ef1011']")
        public WebElement calculateBalanceTransfer;

        @FindBy(id = "text-0i6094iko75k")
        public WebElement amount;

        @FindBy(xpath = "//input[@id='text-ubnt1c3uicj']")
        public WebElement currentInterestRate;

        @FindBy(xpath = "//button[@data-di-id='di-id-755e8f0b-13ab7287']")
        public WebElement calculateButton;

        public void navigateCreditCardOverviewPage() {
        }

//        public void enterData(){
//
//            amount.sendKeys(ConfigReader.getProperty("7500"+ Keys.TAB));
//            currentInterestRate.sendKeys(ConfigReader.getProperty("18"));
//            calculateButton.click();
//
//        }

}
