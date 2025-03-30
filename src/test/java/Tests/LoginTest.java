package Tests;

import Base.BaseTest;
import Pages.LoginPage;
import Utils.ExcelUtils;
import Utils.ExtentReportManager;
import Utils.Log;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTest extends BaseTest {
//    @DataProvider(name = "logindata")
//    public Object[][] getlogindata()throws IOException {
//        String filepath="C:\\Users\\bilal\\Selenium_java_framework\\TestData\\testdata.xlsx";
//        ExcelUtils.LoadExcel(filepath, "Sheet1");
//        int rowcount = ExcelUtils.getRowcount();
//        Object[][] data=new Object[rowcount-1][2];
//
//        for (int i=1;i<rowcount;i++){
//            data[i-1][0]=ExcelUtils.getcelldata(i, 0);//username
//            data[i-1][1]=ExcelUtils.getcelldata(i, 1);//password
//        }
//        ExcelUtils.closeexcel();
//        return data;
//    }
    @Test(priority = 0)
    public void Testvalidlogin() throws InterruptedException {
        test = ExtentReportManager.createTest("Login Test");
        LoginPage login = new LoginPage(driver);
        login.clicksignin();
        Log.info("clicked sign in");
        login.enterusername("bilal123@gmail.com");
        //login.enterusername(username);
        test.info("Username entered");
        login.enterpassword("Ahamed@123");
        //login.enterpassword("");
        test.info("password entered");
        login.clicklogin();
        test.info("login clicked");
        System.out.println("Title of the page is:" + driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Home Page");
        test.pass("Login passed");

    }

    @Test(priority = 1)
    public void Invalidlogin() throws InterruptedException {
        test = ExtentReportManager.createTest("Invalid Login");
        LoginPage login = new LoginPage(driver);
        login.clicksignin();
        Log.info("clicked sign in");
        login.enterusername("bilal123@gmail.com");
        test.info("Username entered");
        login.enterpassword("Ahamed");
        test.info("password entered");
        login.clicklogin();
        test.info("login clicked");
        System.out.println("Title of the page is:" + driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Customer Login");
        test.pass("Login passed");
    }

}
