package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchProduct {
    private WebDriver driver;
    private By searchbar = By.xpath("//input[@id='search']");
    private  By searchbutton = By.xpath("//button[@title='Search']");

    public SearchProduct(WebDriver driver){
        this.driver = driver;
    }
    public void EnterSearch(String keyword){
        driver.findElement(searchbar).sendKeys(keyword);
    }
    public void SearchClick(){
        driver.findElement(searchbutton).click();
    }
}
