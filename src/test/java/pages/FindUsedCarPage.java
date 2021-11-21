package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FindUsedCarPage {

    public FindUsedCarPage(){ PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(name = "truecar-model")    //need to correct xpath //this choosing left new car side
    public WebElement make;

    @FindBy(xpath = "//div/input[@name='truecar-zip']")  //need to correct xpath //this choosing left new car side
    public WebElement zipCode;

    @FindBy(xpath = "//footer//a[@class='button button--solid-tertiary']")
    public WebElement searchUsedCarsButton;

    @FindBy(xpath = "//div//h1[@class='heading-4 heading-sm-3 heading-md-2 padding-right-2 deprecated-padding-md-0']")
    public WebElement searchResultPageHeadingUsedCars;

    @FindBy(xpath = "//div//select[@aria-label='Change vehicle make']")
    public WebElement carBuyingServiceMainPageUsedCarMake;

    @FindBy(xpath = "//div//span[@class='hidden-sm-down']")
    public WebElement resultPageHeadingUsedCars;








}
