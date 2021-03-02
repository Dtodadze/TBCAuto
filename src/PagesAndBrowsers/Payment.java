package PagesAndBrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Payment {

    public WebElement firstProductPrice ;
    public WebElement firstProductQty;
    public WebElement secondProductPrice;
    public WebElement secondProductQty;
    public WebElement shippingPrice;
    public WebElement totalAmount;
    public WebElement payByBank;
    public WebElement payByCheck;

    public void PaymentWebElements(WebDriver driver){

        firstProductPrice = driver.findElement(By.xpath("//*[starts-with(@id,'product_price_1_3')]"));
        firstProductQty = driver.findElement(By.xpath("//*[starts-with(@id,'product_1_3_0')]/td[5]/span"));
        secondProductPrice = driver.findElement(By.xpath("//*[starts-with(@id,'product_price_3')]"));
        secondProductQty = driver.findElement(By.xpath("//*[starts-with(@id,'product_3_13_0')]/td[5]/span"));
        shippingPrice = driver.findElement(By.xpath("//*[@id=\"total_shipping\"]"));
        totalAmount = driver.findElement(By.xpath("//*[@id=\"total_price\"]")); ;
        payByBank = driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a"));
        payByCheck = driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a"));
    }
}
