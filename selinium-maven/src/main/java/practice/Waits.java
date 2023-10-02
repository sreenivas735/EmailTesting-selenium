package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waits {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.edge.driver", "C:\\Users\\sreenu\\IdeaProjects\\selinium-maven\\msedgedriver.exe");
        EdgeDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
        WebElement button = driver.findElement(By.xpath("//button[@id='btn1']"));
        button.click();
//        Thread.sleep(6000);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txt1']")));
        WebElement text1 = driver.findElement(By.xpath("//input[@id='txt1']"));
        text1.sendKeys("vasudev");


        WebElement button1 = driver.findElement(By.xpath("//button[@id='btn2']"));
        button1.click();


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txt2']")));
        WebElement text2 = driver.findElement(By.xpath("//input[@id='txt2']"));
        text2.sendKeys("vasudev krishna");
    }
}
