package Email.page;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class loginpage {

    WebDriver driver;

    public loginpage(WebDriver driver) {
        this.driver = driver;

    }

    public void username() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='email']")));
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("xyz@gmail.com");

    }

    public void forgotpass() {
        driver.findElement(By.xpath("//button[@type='button']")).click();

    }

    public void createaccount() {
        driver.findElement(By.xpath("//span[contains(text(), 'Create account')]")).click();

    }

    public void learnmore() {
        driver.findElement(By.xpath("//a[contains(text(), 'Learn more')]")).click();

    }

    public void nextbutton() throws InterruptedException {
        driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
        Thread.sleep(3000);
    }

    public void languagedropdown() {
        WebElement drop = driver.findElement(By.xpath("//div[@role='combobox']"));
        drop.click();
//       Select drop1 = new Select(drop);
//       drop1.selectByValue("తెలుగు");
        drop.sendKeys("తెలుగు");
    }

    public void createdropdown() {
        WebElement drop = driver.findElement(By.xpath("//span[contains(text(), 'For my personal use')]"));

        Select drop1 = new Select(drop);
        drop1.selectByValue("For my personal use");
    }

    public void screenshots(String filename) throws IOException {
        TakesScreenshot sc = (TakesScreenshot) driver;
        File source = sc.getScreenshotAs(OutputType.FILE);
        File dest = new File("D:\\TESTING\\Screenshots\\" + filename);
        FileUtils.copyFile(source, dest);
    }
}
