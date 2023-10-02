package practice;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashSet;
import java.util.Set;

public class frames {

    public static void frame() throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\sreenu\\IdeaProjects\\selinium-maven\\msedgedriver.exe");
        EdgeDriver driver = new EdgeDriver();
//        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement fram1 = driver.findElement(By.xpath("//iframe[@id='frm1']"));
        driver.switchTo().frame(fram1);
        WebElement drop = driver.findElement(By.id("course"));
        Select drop1 = new Select(drop);
        drop1.selectByVisibleText("Python");

        driver.switchTo().parentFrame();

        WebElement fram3 = driver.findElement(By.xpath("//iframe[@id='frm3']"));
        driver.switchTo().frame(fram3);

        WebElement text = driver.findElement(By.xpath("//input[@class='frmTextBox']"));
        text.sendKeys("hello world");

        WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='frm2']"));
        driver.switchTo().frame(frame1);

        WebElement text1 = driver.findElement(By.id("firstName"));
        text1.sendKeys("sreenivasulu");
        driver.switchTo().parentFrame();

        WebElement text2 = driver.findElement(By.xpath("//input[@class='frmTextBox']"));
        text2.sendKeys("  how are you");

        driver.switchTo().defaultContent();
        WebElement text3 = driver.findElement(By.id("name"));
        text3.sendKeys("frame practice");

    }



    public static void method1() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\sreenu\\IdeaProjects\\selinium-maven\\msedgedriver.exe");
        EdgeDriver driver = new EdgeDriver();
//        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement ele = (WebElement) js.executeScript("return document.getElementById('name')");
        ele.sendKeys("hello");

    }


}
