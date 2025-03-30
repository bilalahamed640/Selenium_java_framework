package Tests;

import Base.BaseTest;
import Pages.LoginPage;
import Utils.ExtentReportManager;
import Utils.Log;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test(priority = 0)
    public void Testvalidlogin() throws InterruptedException {
        test = ExtentReportManager.createTest("Login Test");
        LoginPage login =new LoginPage(driver);
        login.clicksignin();
        Log.info("clicked sign in");
        login.enterusername("bilal123@gmail.com");
        test.info("Username entered");
        login.enterpassword("Ahamed@123");
        test.info("password entered");
        login.clicklogin();
        test.info("login clicked");
        System.out.println("Title of the page is:"+driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Home Page");
        test.pass("Login passed");

    }
    @Test(priority = 1)
    public void Invalidlogin() throws InterruptedException {
        test = ExtentReportManager.createTest("Invalid Login");
        LoginPage login =new LoginPage(driver);
        login.clicksignin();
        Log.info("clicked sign in");
        login.enterusername("bilal123@gmail.com");
        test.info("Username entered");
        login.enterpassword("Ahamed");
        test.info("password entered");
        login.clicklogin();
        test.info("login clicked");
        System.out.println("Title of the page is:"+driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Customer Login");
        test.pass("Login passed");
    }

}
