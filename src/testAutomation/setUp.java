package testAutomation;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

import java.awt.*;

public class setUp {

    public static WebDriver driver;
    public Robot robot;
    public static String firstProduct;
    public static String secondProduct;
    public static double amount;

    @BeforeSuite(alwaysRun = true)
    public void setup() {

        driver = PagesAndBrowsers.Browser.startBrowser(driver,"Chrome","http://automationpractice.com/index.php");

    }
}