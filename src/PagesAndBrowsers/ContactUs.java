package PagesAndBrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUs {
    public WebElement objectHeading;
    public WebElement orderReference;
    public WebElement product;
    public WebElement attachFile;
    public WebElement message;
    public WebElement send;

    public void ContactUsWebElements(WebDriver driver){
        objectHeading = driver.findElement(By.xpath("//*[@id=\"id_contact\"]"));
        product = driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/fieldset/div[1]/div[1]/div[2]/div/select"));
        orderReference = driver.findElement(By.xpath("//select[@name='id_order']"));
        attachFile = driver.findElement(By.xpath("//*[@id=\"fileUpload\"]"));;
        message = driver.findElement(By.xpath("//*[@id=\"message\"]"));;
        send = driver.findElement(By.xpath("//*[@id=\"submitMessage\"]"));
    }

}
