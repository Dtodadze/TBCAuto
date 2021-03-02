package PagesAndBrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage {

    public  WebElement product (WebDriver driver){
        WebElement element = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img"));
        return element;
    }
    public  WebElement itemtShirt(WebDriver driver) {

        WebElement element=   driver.findElement(By.xpath("//img[@class='replace-2x img-responsive'][@title='Faded Short Sleeve T-shirts']"));

        return element;
    }
    public  WebElement quickView(WebDriver driver){
        WebElement element=driver.findElement(By.xpath("//a[@class='quick-view']"));
        return element;

    }
    public  List<WebElement> imgList(WebDriver driver){
        List<WebElement> images =driver.findElements(By.xpath("//*[starts-with(@id,'thumb_')]"));
        images.size();


        return images;
    }

    public  WebElement[] itemParameters(WebDriver driver){

        WebElement [] itemDetails= new WebElement[3];
        itemDetails[0] = driver.findElement(By.xpath("/html/body/div/div/div[3]/form/div/div[2]/p[1]/a[2]"));
        itemDetails[1]= driver.findElement(By.xpath("/html/body/div/div/div[3]/form/div/div[2]/div/fieldset[1]/div/div/select"));
        itemDetails[2]=driver.findElement(By.xpath("/html/body/div/div/div[3]/form/div/div[3]/div[1]/p/button"));
        return itemDetails;
    }
    public  WebElement[] shopingWindow(WebDriver driver){
        WebElement [] shopingOptions= new WebElement[2];
        //continue shopping
        shopingOptions[0]= driver.findElement(By.xpath("//span[@title='Continue shopping']"));
        // Proceed to checkout
        shopingOptions[1]=driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));

        return shopingOptions;
    }
    public WebElement CasualDressesPage(WebDriver driver){
        WebElement element=driver.findElement(By.
                xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[1]/div/a[1]/img"));

        return element;
    }
    public WebElement AddDress(WebDriver driver){
        WebElement element =driver.findElement(By.
                xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[2]/div[2]/a[1]"));

        return element;
    }

}
