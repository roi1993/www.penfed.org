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

public class AutoLoanApplicationPage {

    public AutoLoanApplicationPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath="//span[@data-id='Auto']")
    public WebElement Auto;

    @FindBy(xpath = "//a[@data-clickid='PF-BTN-CLK-AUTO-LOANS_REVIEW']")
    public WebElement AutoLoanApplication;

    @FindBy(xpath = "//a[@class='pfui-button pfui-btn-tertiary-blue-outline']")
    public  WebElement seeRatesButton;


    public void NavigateToAutoLoanPage(){
        Auto.click();
        AutoLoanApplication.click();
    }

    public void NavigateToAutoRatesPage(){
        Auto.click();
        AutoLoanApplication.click();
        seeRatesButton.click();
    }
}
