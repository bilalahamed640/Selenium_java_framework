package Base;

import Utils.ExtentReportManager;
import Utils.Log;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    protected WebDriver driver;
    protected ExtentReports extent;
    protected ExtentTest test;
    @BeforeSuite
    public void setupReport(){
        extent = ExtentReportManager.getReportInstance();
    }
    @AfterSuite
    public void teardownReport(){
        extent.flush();
    }

    @BeforeMethod
    public void setup() {
        Log.info("Starting web driver");
        driver =new ChromeDriver();
        driver.get("https://magento.softwaretestingboard.com/");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void TearDown(ITestResult result){
        if (result.getStatus()==ITestResult.FAILURE){
            String screenshotpath=ExtentReportManager.captureScreenshot(driver,"Login Failure");
            test.fail("Check screenshot", MediaEntityBuilder.createScreenCaptureFromPath(screenshotpath).build());
        }

        if (driver!=null){
           driver.quit();
        }

    }
}
