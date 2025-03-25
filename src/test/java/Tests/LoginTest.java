package Tests;

import Base.BaseTest;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void Testvalidlogin() throws InterruptedException {
        LoginPage login =new LoginPage(driver);
        login.clicksignin();
        login.enterusername("bilal123@gmail.com");
        login.enterpassword("Ahamed@123");
        login.clicklogin();
        System.out.println("Title of the page is:"+driver.getTitle());
    }

}
