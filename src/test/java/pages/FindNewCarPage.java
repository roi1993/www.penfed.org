package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import javax.print.attribute.standard.Fidelity;

public class FindNewCarPage {

    public FindNewCarPage(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(name = "truecar-model")
    public WebElement make;

    @FindBy(xpath = "//div/input[@name='truecar-zip']")
    public WebElement zipCode;

    @FindBy(xpath = "//footer//a[@class = 'button button--solid-primary']")
    public WebElement searchNewCarsButton;

    @FindBy(xpath = "//div//h1[@class='heading-4 padding-y-1']")
    public WebElement searchResultPageHeadingNewCars;

    @FindBy(xpath = "//div//h1[@class='heading-2 heading-xl-1 _bxjdn2']")
    public WebElement carBuyingServicePageHeading;

    @FindBy(xpath = "//div//select[@class='form-control-select-md form-select-element']")
    public WebElement carBuyingServiceMainPageMake;

    @FindBy(xpath = "//div//input[@name='zip']")
    public WebElement carBuyingServiceMainPageZipCode;

    @FindBy(xpath = "//button//span[@class='btn-inner']")
    public WebElement carBuyingServiceMainPageShopNewCarButton;

    @FindBy(xpath = "//div//a[@class='button button--solid-primary No Value button--center  ']")
    public WebElement searchVehicleButton;



}








