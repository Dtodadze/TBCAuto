package PagesAndBrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCardSummery {

    public WebElement Cart(WebDriver driver){
        WebElement element =driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a"));
        return element;
    }
    public WebElement FristProduct(WebDriver driver){
        WebElement element =driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr[1]/td[2]/p/a"));
        return element;

    }
    public WebElement SecondProduct(WebDriver driver){
        WebElement element =driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr[2]/td[2]/p/a"));
        return element;
    }
    public WebElement StartPurchase(WebDriver driver){
        WebElement element = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]"));
        return element;

    }
}
