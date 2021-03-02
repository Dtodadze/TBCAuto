package PagesAndBrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfirmOrder {

    public WebElement tAmount;
    public WebElement otherPaymentMethods;
    public WebElement confirmOrder;

    public void ConfirmOrderWebElements(WebDriver driver){

        tAmount = driver.findElement(By.xpath("//*[@id=\"amount\"]"));
        otherPaymentMethods = driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/a"));
        confirmOrder = driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button"));

    }
}
