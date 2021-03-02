package PagesAndBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Browser {

    public static WebDriver startBrowser(WebDriver driver, String browserName , String URL) {

        if (browserName.equals("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
            driver = new ChromeDriver();

        }
        else if (browserName.equals("Firefox")){
            System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if (browserName.equals("Edge")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        else
            System.out.println("We do mot support this browser");

        driver.manage().timeouts().pageLoadTimeout(30 , TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        return driver;
    }


}
