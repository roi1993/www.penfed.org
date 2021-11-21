package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class CarBuyingServicePage {

    public CarBuyingServicePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath="//span[@data-id='Auto']")
    public WebElement Auto;

    @FindBy(xpath = "//a[@data-id='Auto: Auto Loans: Car Buying Service']")
    public WebElement CarBuyingService;


    public void NavigateToCarBuyingServicePage(){
        Auto.click();
        CarBuyingService.click();
    }
}