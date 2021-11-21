package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutoLoanApplicationPage;
import pages.CarBuyingServicePage;
import pages.FindNewCarPage;

public class CarBuyingServicePageTest extends TestBase {


    @Test(groups = {"smokeTest"})
    public void navigateToCarBuyingServicePage() {

        CarBuyingServicePage carBuyingServicePage = new CarBuyingServicePage();
        carBuyingServicePage.NavigateToCarBuyingServicePage();
        Assert.assertEquals(driver.getTitle(),"Rates on Auto Loans | PenFed Car Buying Service | Used Car Loans");




    }
 // not sure where to include for now
    //as a user want to verify if I am on car buying services main page only using zipcode
    @Test(groups = {"smokeTest"})
    public void navigateToMainCarBuyingServicePage(){
        CarBuyingServicePage carBuyingServicePage = new CarBuyingServicePage();
        carBuyingServicePage.NavigateToCarBuyingServicePage();
        FindNewCarPage findNewCarPage = new FindNewCarPage();
        findNewCarPage.zipCode.sendKeys("22031");
        //  new WebDriverWait(getWebDriver), 10.until(ExpectedConditions.elementToBeClickable(findNewCarPage.searchNewCarsButton))).click();
        findNewCarPage.searchNewCarsButton.click(); //need to fix wait to the click button to be available
        //without chosen model website takes you to car buying services main page where you have to enter make and zip code and shop
        String expectedResult = "Find & Finance Your Next New or Used Car";
        String actualResult = findNewCarPage.carBuyingServicePageHeading.getText();

        Assert.assertEquals(actualResult,expectedResult);

    }
}
