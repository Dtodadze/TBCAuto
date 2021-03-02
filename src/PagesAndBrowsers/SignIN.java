package PagesAndBrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignIN {

    public  WebElement email;
    public  WebElement createAnAccount;
    public  WebElement emailAddress;
    public  WebElement password;
    public  WebElement forgetPassword;
    public  WebElement signIn;

    public void GetSignInWebElements(WebDriver driver){

        email=driver.findElement(By.xpath("//*[@id=\"email_create\"]"));
        createAnAccount = driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]"));
        emailAddress=driver.findElement(By.xpath("//*[@id=\"email\"]"));
        password =driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
        forgetPassword=driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/p[1]/a"));
        signIn = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]"));
    }

}
