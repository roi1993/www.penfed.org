package tests;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CarBuyingServicePage;
import pages.FindNewCarPage;
import pages.FindUsedCarPage;

public class FindUsedCarTest extends TestBase {

    @Test(groups={"regressionTest"})
    public void SelectModelAndZipCode() throws InterruptedException{

        CarBuyingServicePage carBuyingServicePage = new CarBuyingServicePage();
        carBuyingServicePage.NavigateToCarBuyingServicePage();
        FindUsedCarPage findUsedCarPage = new FindUsedCarPage();
        Select model = new Select(findUsedCarPage.make);
        model.selectByValue("2217"); //BMW
        findUsedCarPage.zipCode.sendKeys("22204");
        //  new WebDriverWait(getWebDriver), 10.until(ExpectedConditions.elementToBeClickable(findNewCarPage.searchNewCarsButton))).click();
        findUsedCarPage.searchUsedCarsButton.click(); //need to fix wait to the click button to be available
        String expectedResultOfNewCarSearchPage = "Used BMWs for Sale in \n" +
                "Arlington, VA";
        String actualResultOfNewCarSearchPage = findUsedCarPage.searchResultPageHeadingUsedCars.getText();

        Assert.assertEquals(actualResultOfNewCarSearchPage,expectedResultOfNewCarSearchPage);

    }

    @Test(groups={"regressionTest"})
    public void SelectZipCodeWithoutModel() throws InterruptedException{

        CarBuyingServicePage carBuyingServicePage = new CarBuyingServicePage();
        carBuyingServicePage.NavigateToCarBuyingServicePage();
        FindUsedCarPage findUsedCarPage = new FindUsedCarPage();
        findUsedCarPage.zipCode.sendKeys("22204");
        //  new WebDriverWait(getWebDriver), 10.until(ExpectedConditions.elementToBeClickable(findNewCarPage.searchNewCarsButton))).click();
        findUsedCarPage.searchUsedCarsButton.click(); //need to fix wait to the click button to be available
        //without chosen model website takes you to car buying services main page where you have to enter make and zip code and shop
//        String expectedResult = "Find & Finance Your Next New or Used Car";
//        String actualResult = findNewCarPage.carBuyingServicePageHeading.getText();
//        Assert.assertEquals(actualResult,expectedResult);
        Select model = new Select(findUsedCarPage.carBuyingServiceMainPageUsedCarMake);
        model.selectByValue("bmw"); //BMW
        String expectedResultOfNewCarSearchPage = "Showing 1 – 30 of 2,979 Listings";
        String actualResultOfNewCarSearchPage = findUsedCarPage.resultPageHeadingUsedCars.getText();

        Assert.assertEquals(actualResultOfNewCarSearchPage,expectedResultOfNewCarSearchPage);

    }



}
