package PagesAndBrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SigneUp {

    public WebElement genderMr;
    public WebElement genderMrs;
    public WebElement firstName;
    public WebElement lastName;
    public WebElement email;
    public WebElement password;
    public WebElement birthDay;
    public WebElement birthMonth;
    public WebElement birthYear;
    public WebElement newsletter;
    public WebElement partner;
    public WebElement addressFirstName;
    public WebElement addressLastName;
    public WebElement addressCompany;
    public WebElement addressAddress;
    public WebElement addressAddressLine2;
    public WebElement addressCity;
    public WebElement addressState;
    public WebElement addressPostalCode;
    public WebElement addressCountry;
    public WebElement addressAddInfo;
    public WebElement addressHomePhone;
    public WebElement addressMobilePhone;
    public WebElement addressAddressAlias;
    public WebElement register;

    public void GetSingUpWebElements(WebDriver driver){

        genderMr = driver.findElement(By.xpath("//*[@id=\"id_gender1\"]"));
        genderMrs = driver.findElement(By.xpath("//*[@id=\"id_gender2\"]"));
        firstName = driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]"));
        lastName = driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]"));
        email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        password = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
        birthDay = driver.findElement(By.xpath("//*[@id=\"days\"]"));
        birthMonth = driver.findElement(By.xpath("//*[@id=\"months\"]"));
        birthYear = driver.findElement(By.xpath("//*[@id=\"years\"]"));
        newsletter = driver.findElement(By.xpath("//*[@id=\"newsletter\"]"));
        partner = driver.findElement(By.xpath("//*[@id=\"optin\"]"));
        addressFirstName = driver.findElement(By.xpath("//*[@id=\"firstname\"]"));
        addressLastName = driver.findElement(By.xpath("//*[@id=\"lastname\"]"));
        addressCompany = driver.findElement(By.xpath("//*[@id=\"company\"]"));
        addressAddress = driver.findElement(By.xpath("//*[@id=\"address1\"]"));
        addressAddressLine2 = driver.findElement(By.xpath("//*[@id=\"address2\"]"));
        addressCity = driver.findElement(By.xpath("//*[@id=\"city\"]"));
        addressState = driver.findElement(By.xpath("//*[@id=\"id_state\"]"));
        addressPostalCode = driver.findElement(By.xpath("//*[@id=\"postcode\"]"));
        addressCountry = driver.findElement(By.xpath("//*[@id=\"id_country\"]"));
        addressAddInfo = driver.findElement(By.xpath("//*[@id=\"other\"]"));
        addressHomePhone = driver.findElement(By.xpath("//*[@id=\"phone\"]"));
        addressMobilePhone = driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]"));
        addressAddressAlias = driver.findElement(By.xpath("//*[@id=\"alias\"]"));
        register = driver.findElement(By.xpath("//*[@id=\"submitAccount\"]"));

    }

}
