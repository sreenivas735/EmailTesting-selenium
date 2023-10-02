package practice;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.IOException;

public class JSExecuter {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\sreenu\\IdeaProjects\\selinium-maven\\msedgedriver.exe");
        EdgeDriver driver = new EdgeDriver();
//        driver.manage().window().maximize();
//        driver.manage().window().maximize();
        //  driver.get("https://twitter.com/?lang=en-in");
        driver.get("https://www.flipkart.com/?affid=affsiteplug&affExtParam1=c4924133e5c632aaab00174f6b0f9e84&affExtParam2=60827");

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());


        Thread.sleep(2000);

//
        WebElement newtab = driver.findElement(By.xpath("//a [contains(text(), 'Terms of Use')]"));
        newtab.click();

        String s = driver.getWindowHandle();
        System.out.println(s);

        WebElement newtab1 = driver.findElement(By.xpath("//a [contains(text(), 'Privacy Policy')]"));
        newtab1.click();


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
//
//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        WebElement ele = (WebElement) jse.executeScript("return document.getElementsByName('q')[0].style.background='blue';");
//        ele.sendKeys("lenova" + Keys.ENTER);
        TakesScreenshot ts = (TakesScreenshot) driver;
        ts.getScreenshotAs(OutputType.FILE);

        File source = ts.getScreenshotAs(OutputType.FILE);
        File dest = new File("D:\\TESTING\\Screenshots\\sc-1.jpg");
        FileUtils.copyFile(source, dest);

    }

}
