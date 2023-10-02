package insta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Forgotpassword {
    String usermail = "//input[@placeholder='Email, Phone, or Username']";
    String loginlinksending = "//div[contains(text(), 'Send login link')]";

    WebDriver driver;

    Forgotpassword(WebDriver driver){
        this.driver = driver;
    }

    public void forgotusername(String usermailidorphone) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(usermail)));
        driver.findElement(By.xpath(usermail)).sendKeys(usermailidorphone);

    }

    public void loginlinksendingbutton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loginlinksending)));
        driver.findElement(By.xpath(loginlinksending)).click();
    }


}
