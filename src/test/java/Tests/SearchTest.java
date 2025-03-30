package Tests;
import Utils.ExtentReportManager;
import Base.BaseTest;
import Pages.SearchProduct;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import Utils.Log;
import java.util.List;

public class SearchTest extends BaseTest {
    @Test(priority = 3)
    public void searchtest() throws InterruptedException{
        test=ExtentReportManager.createTest("SeatchTest");
        SearchProduct search = new SearchProduct(driver);
        Log.info("Entering the search keyword");
        test.info("Entering the search keyword");
        search.EnterSearch("jacket");
        search.SearchClick();
        test.info("Clicked on search");
        List<WebElement> products= (List<WebElement>) driver.findElements(By.xpath("//li[@class='item product product-item']"));
        test.info("Extracting the web elements");
        System.out.println("element"+ products.size());
        for (WebElement i : products){
            System.out.println("element"+i.getText());
        }
    }
}
