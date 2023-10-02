package Email.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class createaccountpage {
    WebDriver driver;

    public createaccountpage(WebDriver driver){

        this.driver=driver;
    }
    public void firstname() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='firstName']")));
        driver.findElement(By.xpath(" //input[@id='firstName']")).sendKeys("vasudev");

    }

    public void lastname() {
        driver.findElement(By.xpath(" //input[@id='lasttName']")).sendKeys("krishna");

    }

    public void nextbutton(){

        driver.findElement(By.xpath("//span[contains(text(), 'Next')]")).click();

    }

}
