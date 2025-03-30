package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpression;

public class LoginPage {
    private WebDriver driver;
    @FindBy(partialLinkText="Sign")
    WebElement signinbutton;
    @FindBy(xpath = "//input[@id='email']")
    WebElement emailxpath;
    @FindBy(xpath = "//input[@id='pass']")
    WebElement passwordxpath;
    @FindBy(xpath = "//button[@name='send']")
    WebElement submitbutton;

    //private By emailxpath= By.xpath("//input[@id='email']");
    //private By passwordxpath=By.xpath("//input[@id='pass']");
    //private By submitbutton=By.xpath("//button[@name='send']");

    public LoginPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clicksignin(){
        signinbutton.click();
        //driver.findElement(signinbutton).click();
    }
    public void enterusername(String username){
        emailxpath.click();
        emailxpath.clear();
        emailxpath.sendKeys(username);
        //driver.findElement(emailxpath).click();
       // driver.findElement(emailxpath).clear();
       // driver.findElement(emailxpath).sendKeys(username);
    }
    public void enterpassword(String password){
        passwordxpath.click();
        passwordxpath.clear();
        passwordxpath.sendKeys(password);
       //driver.findElement(passwordxpath).click();
       //driver.findElement(passwordxpath).clear();
        // driver.findElement(passwordxpath).sendKeys(password);
    }
    public void clicklogin(){
        submitbutton.click();
       // driver.findElement(submitbutton).click();
    }

}
