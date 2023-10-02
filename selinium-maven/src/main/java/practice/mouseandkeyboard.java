package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class mouseandkeyboard {
    public static void main(String[] args) throws InterruptedException {
        mouseoperator();
    }

    public static void mouseoperator() throws InterruptedException {
        System.setProperty("webdrivar.edge.driver", "C:\\Users\\sreenu\\IdeaProjects\\selinium-maven\\msedgedriver.exe");
        EdgeDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.youtube.com/");

//        Thread.sleep(2000);
//        WebElement mouse = driver.findElement(By.xpath("//yt-formatted-string[contains(text(), 'Shorts')]"));

        Actions a = new Actions(driver);
//        a.moveToElement(mouse).build().perform();

        Thread.sleep(2000);

//        a.click().build().perform();

//        WebElement key  = driver.findElement(By.xpath("//input[@id='search']"));
//
//        a.keyDown(Keys.SHIFT).sendKeys(key,"jr8ntr"+Keys.ENTER).build().perform();
//
//
//        Thread.sleep(2000);


        WebElement mouse = driver.findElement(By.xpath("//yt-formatted-string[contains(text(), 'Shorts')]"));
        a.moveToElement(mouse).build().perform();
        Thread.sleep(2000);
        a.contextClick(mouse).build().perform();


        //ul//li//span[@class='bwc__sc-ttnkwg-14 flGQbT'][2]


    }
}