package tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CarBuyingServicePage;
import pages.CookiesHandlingPage;
import pages.FindNewCarPage;

public class FindNewCarTest extends TestBase{

    @Test(groups={"regressionTest"})
    public void SelectModelAndZipCode() throws InterruptedException{

        CarBuyingServicePage carBuyingServicePage = new CarBuyingServicePage();
        carBuyingServicePage.NavigateToCarBuyingServicePage();
        CookiesHandlingPage cookiesHandlingPage = new CookiesHandlingPage();
        cookiesHandlingPage.click();
        FindNewCarPage findNewCarPage = new FindNewCarPage();
        Select model = new Select(findNewCarPage.make);
        model.selectByValue("2217"); //BMW
        findNewCarPage.zipCode.sendKeys("22031");
        findNewCarPage.searchNewCarsButton.click();
        String expectedResultOfNewCarSearchPage = "Showing 24 new BMW models. Select a model for pricing details.";
        String actualResultOfNewCarSearchPage = findNewCarPage.searchResultPageHeadingNewCars.getText();

        Assert.assertEquals(actualResultOfNewCarSearchPage,expectedResultOfNewCarSearchPage);

    }


    @Test(groups={"regressionTest"})
    public void SelectZipCodeWithoutModel() throws InterruptedException{

        CarBuyingServicePage carBuyingServicePage = new CarBuyingServicePage();
        carBuyingServicePage.NavigateToCarBuyingServicePage();
        CookiesHandlingPage cookiesHandlingPage = new CookiesHandlingPage();
        cookiesHandlingPage.click();
        FindNewCarPage findNewCarPage = new FindNewCarPage();
        findNewCarPage.zipCode.sendKeys("22031");
        findNewCarPage.searchNewCarsButton.click();
        //without chosen model website takes you to car buying services main page where you have to enter make and zip code and shop
//        String expectedResult = "Find & Finance Your Next New or Used Car";
//        String actualResult = findNewCarPage.carBuyingServicePageHeading.getText();
//        Assert.assertEquals(actualResult,expectedResult);
        Select model = new Select(findNewCarPage.carBuyingServiceMainPageMake);
        model.selectByValue("bmw"); //BMW
        findNewCarPage.carBuyingServiceMainPageZipCode.sendKeys("22031");
        findNewCarPage.carBuyingServiceMainPageShopNewCarButton.click();
        String expectedResultOfNewCarSearchPage = "Showing 24 new BMW models. Select a model for pricing details.";
        String actualResultOfNewCarSearchPage = findNewCarPage.searchResultPageHeadingNewCars.getText();

        Assert.assertEquals(actualResultOfNewCarSearchPage,expectedResultOfNewCarSearchPage);

    }

    @Test(groups={"regressionTest"})
    public void SelectVehicleButton() throws InterruptedException{

        CarBuyingServicePage carBuyingServicePage = new CarBuyingServicePage();
        carBuyingServicePage.NavigateToCarBuyingServicePage();
        CookiesHandlingPage cookiesHandlingPage = new CookiesHandlingPage();
        cookiesHandlingPage.click();
        FindNewCarPage findNewCarPage = new FindNewCarPage();
        findNewCarPage.searchVehicleButton.click();
        Select model = new Select(findNewCarPage.carBuyingServiceMainPageMake);
        model.selectByValue("bmw"); //BMW
        findNewCarPage.carBuyingServiceMainPageZipCode.sendKeys("22031");
        findNewCarPage.carBuyingServiceMainPageShopNewCarButton.click();
        String expectedResultOfNewCarSearchPage = "Showing 24 new BMW models. Select a model for pricing details.";
        String actualResultOfNewCarSearchPage = findNewCarPage.searchResultPageHeadingNewCars.getText();

        Assert.assertEquals(actualResultOfNewCarSearchPage,expectedResultOfNewCarSearchPage);

    }

}



