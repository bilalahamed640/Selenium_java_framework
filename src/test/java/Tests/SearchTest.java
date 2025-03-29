package Tests;

import Base.BaseTest;
import Pages.SearchProduct;
import net.bytebuddy.implementation.bytecode.collection.ArrayLength;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class SearchTest extends BaseTest {
    @Test
    public void searchtest(){
        SearchProduct search = new SearchProduct(driver);
        search.EnterSearch("jacket");
        search.SearchClick();
        List<WebElement> products= (List<WebElement>) driver.findElements(By.xpath("//li[@class='item product product-item']"));
        System.out.println("element"+ products.size());
        for (WebElement i : products){
            System.out.println("element"+i.getText());
        }
    }
}
