package tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.SeleniumUtils;

import java.lang.reflect.Method;
import java.time.Duration;

public class TestBase {
    protected WebDriver driver;
//    protected static ExtentReports report;  //manage entire report
//    protected static ExtentSparkReporter htmlReporter;  //generate html report
//    protected static ExtentTest logger;  //to logging the test steps

//    @BeforeSuite
//    public void setUpSuit(){
//        report= new ExtentReports();
//        String pass=System.getProperty("user.dir")+ "/test-output/extentReports/index.html";
//        htmlReporter =new ExtentSparkReporter(pass);
//        report.attachReporter(htmlReporter);
//
//    }
//    @AfterSuite
//    public void afterSuit(){
//        report.flush(); // writes the report in aa file
//    }


    @BeforeMethod (alwaysRun = true)
    //public void setUpMethod(Method method){
    public void setUpMethod(){

        driver= Driver.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(ConfigReader.getProperty("url"));

        driver.manage().deleteAllCookies();

    }

    @AfterMethod
    public void tearDownMethod(){
//    public void tearDownMethod(ITestResult testResult){
//
//        if(testResult.getStatus()==ITestResult.SUCCESS){
//            logger.pass("Test pass");
//        }
//        else if(testResult.getStatus()==ITestResult.SKIP){
//            logger.skip("Test skipped");
//        }
//        else if(testResult.getStatus()==ITestResult.FAILURE){
//            logger.fail("Test fail");
//            logger.fail(testResult.getThrowable());
//            logger.addScreenCaptureFromPath(SeleniumUtils.getScreenshot());
//        }

        //Driver.quitDriver();

    }
}
