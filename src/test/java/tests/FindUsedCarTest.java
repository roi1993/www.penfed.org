package tests;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.CarBuyingServicePage;
import pages.CookiesHandlingPage;
import pages.FindNewCarPage;
import pages.FindUsedCarPage;

public class FindUsedCarTest extends TestBase {

    @Test(groups={"regressionTest"})
    public void SelectModelAndZipCode() throws InterruptedException{

        CarBuyingServicePage carBuyingServicePage = new CarBuyingServicePage();
        carBuyingServicePage.NavigateToCarBuyingServicePage();
        CookiesHandlingPage cookiesHandlingPage = new CookiesHandlingPage();
        cookiesHandlingPage.click();
        FindUsedCarPage findUsedCarPage = new FindUsedCarPage();
        Select model = new Select(findUsedCarPage.make);
        model.selectByValue("2217"); //BMW
        findUsedCarPage.zipCode.sendKeys("22204");
        findUsedCarPage.searchUsedCarsButton.click();
        SoftAssert softAssert = new SoftAssert();
        String expectedResult = "Showing 1 – 30 of 2,930 Listings";
        String actualResult = findUsedCarPage.resultPageHeadingUsedCars.getText();

        softAssert.assertEquals(actualResult,expectedResult);

    }

    @Test(groups={"regressionTest"})
    public void SelectZipCodeWithoutModel() throws InterruptedException{

        CarBuyingServicePage carBuyingServicePage = new CarBuyingServicePage();
        carBuyingServicePage.NavigateToCarBuyingServicePage();
        CookiesHandlingPage cookiesHandlingPage = new CookiesHandlingPage();
        cookiesHandlingPage.click();
        FindUsedCarPage findUsedCarPage = new FindUsedCarPage();
        findUsedCarPage.zipCode.sendKeys("22204");
        findUsedCarPage.searchUsedCarsButton.click();
        Select model = new Select(findUsedCarPage.carBuyingServiceMainPageUsedCarMake);
        model.selectByValue("bmw"); //BMW
        SoftAssert softAssert = new SoftAssert();
        String expectedResultOfNewCarSearchPage = "Showing 1 – 30 of 2,930 Listings";
        String actualResultOfNewCarSearchPage = findUsedCarPage.resultPageHeadingUsedCars.getText();

        softAssert.assertEquals(actualResultOfNewCarSearchPage,expectedResultOfNewCarSearchPage);

    }


    @Test(groups={"regressionTest"})
    public void SearchVehicleButton() throws InterruptedException{

        CarBuyingServicePage carBuyingServicePage = new CarBuyingServicePage();
        carBuyingServicePage.NavigateToCarBuyingServicePage();
        CookiesHandlingPage cookiesHandlingPage = new CookiesHandlingPage();
        cookiesHandlingPage.click();
        FindUsedCarPage findUsedCarPage = new FindUsedCarPage();
        findUsedCarPage.searchVehicleButton.click();
        Select model = new Select(findUsedCarPage.carBuyingServicesMainPageUsedCarMake2);
        model.selectByValue("bmw"); //BMW
        findUsedCarPage.carBuyingServiceMainPageZipCode.sendKeys("22031");
        findUsedCarPage.carBuyingServiceMainPageShopUsedCarButton.click();
        SoftAssert softAssert = new SoftAssert();
        String expectedResultOfNewCarSearchPage = "Showing 1 – 30 of 2,930 Listings";
        String actualResultOfNewCarSearchPage = findUsedCarPage.resultPageHeadingUsedCars.getText();

        softAssert.assertEquals(actualResultOfNewCarSearchPage,expectedResultOfNewCarSearchPage);

    }



}
