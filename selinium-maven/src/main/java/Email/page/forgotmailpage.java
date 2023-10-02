package Email.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

public class forgotmailpage {
    WebDriver driver;
    public forgotmailpage(WebDriver driver){
        this.driver = driver;
    }

    public void username() throws IOException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='email']")));
        loginpage l = new loginpage(driver);
        l.screenshots("forgot.jpg");

        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("vasu123@gmail.com");

    }

    public void nextbutton(){
        driver.findElement(By.xpath("//span[contains(text(), 'Next')]")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(), 'Next')]")));

    }
}
