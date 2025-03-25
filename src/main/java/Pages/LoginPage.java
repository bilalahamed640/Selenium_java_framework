package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By signinbutton=By.partialLinkText("Sign");
    private By emailxpath= By.xpath("//input[@id='email']");
    private By passwordxpath=By.xpath("//input[@id='pass']");
    private By submitbutton=By.xpath("//button[@name='send']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clicksignin(){
        driver.findElement(signinbutton).click();
    }
    public void enterusername(String username){
        driver.findElement(emailxpath).click();
        driver.findElement(emailxpath).clear();
        driver.findElement(emailxpath).sendKeys(username);
    }
    public void enterpassword(String password){
        driver.findElement(passwordxpath).click();
        driver.findElement(passwordxpath).clear();
        driver.findElement(passwordxpath).sendKeys(password);
    }
    public void clicklogin(){
        driver.findElement(submitbutton).click();
    }

}
