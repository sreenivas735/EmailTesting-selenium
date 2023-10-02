package practice;

import org.apache.commons.io.FileUtils;
import org.checkerframework.checker.units.qual.K;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.security.Key;
import java.util.Set;

public class practiceAllCommands {

    public static void main11111() throws InterruptedException, IOException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\sreenu\\IdeaProjects\\selinium-maven\\msedgedriver.exe");
        EdgeDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        TakesScreenshot ts = (TakesScreenshot) driver;
//        driver.manage().window().maximize();
        //  driver.get("https://twitter.com/?lang=en-in");
        driver.get("https://www.flipkart.com/?affid=affsiteplug&affExtParam1=c4924133e5c632aaab00174f6b0f9e84&affExtParam2=60827");

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());


        Thread.sleep(2000);

//
//        WebElement newtab = driver.findElement(By.xpath("//a [contains(text(), 'Terms of Use')]"));
//        newtab.click();
//
//        String s = driver.getWindowHandle();
//        System.out.println(s);

//        WebElement newtab1 = driver.findElement(By.xpath("//a [contains(text(), 'Privacy Policy')]"));
//        newtab1.click();


        try {
            WebElement xmark = driver.findElement(By.xpath("//button[@class= '_2KpZ6l _2doB4z']"));
            xmark.click();

        } catch (Exception exception) {
            System.out.println("second one executed-----------");
        }

        try {

            WebElement xmark1 = driver.findElement(By.xpath("//span[@role='button']"));
            xmark1.click();
        } catch (Exception exception) {
            System.out.println("first one executed--------");


        }


        ts.getScreenshotAs(OutputType.FILE);
        File source = ts.getScreenshotAs(OutputType.FILE);
        File dest = new File("D:\\TESTING\\Screenshots\\sc-1.jpg");
        FileUtils.copyFile(source, dest);

        WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
        search.sendKeys("lenova thinkpad" + Keys.ENTER);

//        Actions act = new Actions(driver);
//
//        act.keyDown(Keys.SHIFT).sendKeys(search, "lenova thinkpad " + Keys.ENTER).build().perform();
        //        search.sendKeys("  above 8GB Ram" + Keys.ENTER);

        File source1 = ts.getScreenshotAs(OutputType.FILE);
        File dest1 = new File("D:\\TESTING\\Screenshots\\sc-2.jpg");
        FileUtils.copyFile(source1, dest1);

        Thread.sleep(1000);

        WebElement min = driver.findElement(By.xpath("//div[@class ='_1YAKP4']//select [@class ='_2YxCDZ']"));
        Select select = new Select(min);
        select.selectByValue("50000");

        Thread.sleep(1000);

        WebElement max = driver.findElement(By.xpath("//div[@class ='_3uDYxP']//select [@class ='_2YxCDZ']"));
        Select n = new Select(max);
        n.selectByValue("75000");

        Thread.sleep(1000);

        WebElement text = driver.findElement(By.xpath("//div[@class='_3sckoD']"));
        text.isDisplayed();
        System.out.println(text.getText());

        Thread.sleep(2000);

        File source2 = ts.getScreenshotAs(OutputType.FILE);
        File dest2 = new File("D:\\TESTING\\Screenshots\\sc-3.jpg");
        FileUtils.copyFile(source2, dest2);

        WebElement lenovo = driver.findElement(By.xpath("//div[contains(text(), 'E15 Lap')]"));
        lenovo.click();

        Set<String> s = driver.getWindowHandles();
        s.remove(driver.getWindowHandle());
        for(String child : s){
            driver.switchTo().window(child);
        }

        Thread.sleep(2000);
        File source3 = ts.getScreenshotAs(OutputType.FILE);
        File dest3 = new File("D:\\TESTING\\Screenshots\\sc-4.jpg");
        FileUtils.copyFile(source3, dest3);

    }
}
