package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.HashSet;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver", "C:\\Users\\sreenu\\IdeaProjects\\Rock-Bhai\\msedgedriver.exe");
        EdgeDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/resizable/");

        WebElement fr = driver.findElement(By.className("demo-frame"));

        driver.switchTo().frame(fr);
        WebElement ele = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));


        Actions ac = new Actions(driver);
        ac.dragAndDropBy(ele, 150, 150).build().perform();


    }
}