package PagesAndBrowsers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {



    public  WebElement womenCategory(WebDriver driver) {
        WebElement element =   driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));

        return element;
    }
    public  WebElement tShirt(WebDriver driver){
        WebElement element = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a"));
        return element;
    }
    public WebElement homePageButton(WebDriver driver){
        WebElement element =driver.findElement(By.xpath("//a[@title='My Store']"));
        return element;
    }
    public WebElement[] dresses(WebDriver driver){

        WebElement [] dressesOptions= new WebElement[4];
        //dresses
        dressesOptions[0]=driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/a"));
        //Casual Dresses
        dressesOptions[1]=driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/ul/li[1]/a"));
        //Evening Dresses
        dressesOptions[2]=driver.findElement(By.xpath("//a[@title='Casual Dresses']"));
        //Evening Dresses
        dressesOptions[2]=driver.findElement(By.xpath("//a[@title='Casual Dresses']"));

        return dressesOptions;

    }

}