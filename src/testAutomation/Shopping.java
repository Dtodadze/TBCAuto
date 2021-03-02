package testAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import PagesAndBrowsers.ProductPage;
import PagesAndBrowsers.homePage;

import java.awt.*;
import java.util.List;


public class Shopping extends setUp {

    ProductPage productPage=new ProductPage();
    homePage HomePage = new homePage();


    @Test(priority = 1)
    void selectCategory() throws InterruptedException, AWTException {

        Point location = HomePage.womenCategory(driver).getLocation();
        robot = new Robot();
        String actualCategory = HomePage.womenCategory(driver).getText();
        robot.mouseMove(location.getX(),location.getY()+120);
        if(actualCategory.equals("WOMEN")) {
            System.out.println("mouse moved to category button 'WOMEN'");
            Thread.sleep(400);
            HomePage.tShirt(driver).click();
        }
        else
            System.out.println("wrong category");
    }
    @Test(priority = 2)
    void checkQuickView() throws AWTException, InterruptedException {

        firstProduct=productPage.itemtShirt(driver).getAttribute("title");
        System.out.println(firstProduct);
        Point location = productPage.itemtShirt(driver).getLocation();
        robot = new Robot();
        robot.mouseMove(location.getX(),location.getY()+120);
        Thread.sleep(500);
        productPage.quickView(driver).click();
        Thread.sleep(500);
    }

    @Test(priority = 3)
    void checkImages() throws InterruptedException {

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[starts-with(@id,'fancybox-frame')]")) );
        Thread.sleep(2000);
        List<WebElement> images =driver.findElements(By.xpath("//img[starts-with(@id,'thumb_')]"));
        for (WebElement items:images
        ) {
            items.click();
            Thread.sleep(1000);
            String link =items.getAttribute("src");
            link.indexOf("-");
            link=link.substring(0,link.indexOf("-"));
            String link1= driver.findElement(By.xpath("//img[@id='bigpic']")).getAttribute("src");
            link1.indexOf("-");
            link1=link1.substring(0,link1.indexOf("-"));
            if (!link.equals(link1)){
                System.out.println("Image test failed");
            }
        }
    }
    @Test(priority = 4)
    void selectDetails() throws InterruptedException {

        WebElement[] test= productPage.itemParameters(driver);
        test[0].click();
        Select size = new Select(test[1]);
        size.selectByVisibleText("M");
        Thread.sleep(500);
        test[2].click();
        Thread.sleep(500);
    }
    @Test(priority = 5)
    void continueShoping() throws InterruptedException {

        Thread.sleep(5000);
        WebElement[] shopingOptions = productPage.shopingWindow(driver);
        shopingOptions[0].click();
        Thread.sleep(500);
    }
    @Test(priority = 6)
    void dress() throws InterruptedException, AWTException {

        HomePage.homePageButton(driver).click();
        Thread.sleep(3000);
        WebElement[] dressess= HomePage.dresses(driver);
        String actualCategory = dressess[0].getText();
        Point location = dressess[0].getLocation();
        robot = new Robot();
        robot.mouseMove(location.getX(),location.getY()+120);
        if(actualCategory.equals("DRESSES")) {
            System.out.println("mouse moved to category button 'DRESSES'");
            Thread.sleep(4000);
            dressess[1].click();
        }
        else
            System.out.println("wrong category");
    }
    @Test(priority = 7)
    void addDress() throws AWTException, InterruptedException {

        WebElement dress= productPage.CasualDressesPage(driver);
        Point location = dress.getLocation();
        robot = new Robot();
        robot.mouseMove(location.getX(),location.getY()+120);
        Thread.sleep(1000);
        secondProduct=dress.getAttribute("title");
        System.out.println(secondProduct);
        WebElement addDress =productPage.AddDress(driver);
        addDress.click();
        Thread.sleep(3000);
        WebElement[] shopingOptions = productPage.shopingWindow(driver);
        shopingOptions[0].click();
        Thread.sleep(2000);
    }
}

