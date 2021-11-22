package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FindUsedCarPage {

    public FindUsedCarPage(){ PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "(//div//select[@name='truecar-model'])[2]")
    public WebElement make;

    @FindBy(xpath = "(//div/input[@name='truecar-zip'])[2]")
    public WebElement zipCode;

    @FindBy(xpath = "//footer//a[@class='button button--solid-tertiary']")
    public WebElement searchUsedCarsButton;

    @FindBy(xpath = "//div//h1[@class='heading-4 heading-sm-3 heading-md-2 padding-right-2 deprecated-padding-md-0']")
    public WebElement searchResultPageHeadingUsedCars;

    @FindBy(xpath = "//div//select[@aria-label='Change vehicle make']")
    public WebElement carBuyingServiceMainPageUsedCarMake;

    @FindBy(xpath = "//div//span[@class='hidden-sm-down']")
    public WebElement resultPageHeadingUsedCars;

    @FindBy(xpath = "//div//a[@class='button button--solid-primary No Value button--center  ']")
    public WebElement searchVehicleButton;

    @FindBy(xpath = "(//div//select[@class='form-control-select-md form-select-element'])[2]")
    public WebElement carBuyingServicesMainPageUsedCarMake2;

    @FindBy(xpath = "(//div//input[@name='zip'])[2]")
    public WebElement carBuyingServiceMainPageZipCode;

    @FindBy(xpath = "(//button//span[@class='btn-inner'])[2]")
    public WebElement carBuyingServiceMainPageShopUsedCarButton;










}
