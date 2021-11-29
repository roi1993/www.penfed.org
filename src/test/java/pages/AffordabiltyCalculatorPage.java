package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AffordabiltyCalculatorPage {

    public AffordabiltyCalculatorPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
