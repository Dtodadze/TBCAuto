package PagesAndBrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testAutomation.setUp;

public class Wait extends setUp
{

    public WebElement WaitXpath(String path){
        WebDriverWait waitacc=new WebDriverWait(driver, 60) ;
        WebElement element=  waitacc.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(path))));
        return element;
    }
    public WebElement WaitId(String id){
        WebDriverWait waitacc=new WebDriverWait(driver, 60) ;
        WebElement element= waitacc.until(ExpectedConditions.visibilityOfElementLocated((By.id(id))));
        return  element;
    }
}
