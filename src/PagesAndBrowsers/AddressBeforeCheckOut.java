package PagesAndBrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddressBeforeCheckOut {

    public WebElement updatePersonalAddress;
    public WebElement updateBillingAddress;
    public WebElement addNewAddress;
    public WebElement comment;
    public WebElement continueShopping;
    public WebElement proceedToCheckOut;

    public void AddressPageWebElements(WebDriver driver){

        updatePersonalAddress =driver.findElement(By.xpath("//*[@id=\"address_delivery\"]/li[9]/a")) ;
        updateBillingAddress =driver.findElement(By.xpath("//*[@id=\"address_invoice\"]/li[9]/a")) ;
        addNewAddress = driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/div/p/a"));
        comment = driver.findElement(By.xpath("//*[@id=\"ordermsg\"]/textarea"));
        continueShopping =driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/a")) ;
        proceedToCheckOut = driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button"));

    }
}