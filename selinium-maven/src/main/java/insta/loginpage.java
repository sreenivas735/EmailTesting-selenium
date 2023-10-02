package insta;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class loginpage {
    String usernameXpath = "//input[@name='username']";
    String passwordXpath = "//input[@name='password']";
    String loginButtonXpath = "//button[@type='submit']";

    String usingfacebooklogin = "//span[contains(text(), 'Log in with Facebook')]";
    String forgotpassXpath = "//span[contains(text(), 'Forgot password?')]";

    WebDriver driver;


    public loginpage(WebDriver driver) {
        this.driver = driver;
    }

    public void username(String username) {

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(usernameXpath)));
        driver.findElement(By.xpath(usernameXpath)).sendKeys(username);
    }

    public void password(String password) {
        driver.findElement(By.xpath(passwordXpath)).sendKeys(password);
    }

    public void submitbutton() {
        driver.findElement(By.xpath(loginButtonXpath)).click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(loginButtonXpath)));
    }

    public void facebooklogin() {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(usingfacebooklogin)));
        driver.findElement(By.xpath(usingfacebooklogin)).click();
    }

    public void forgotpassword() {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(forgotpassXpath)));
       driver.findElement(By.xpath(forgotpassXpath)).click();
    }

    public void waitingtime(int sec){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));

    }


    public void screenshotfile(String filename) throws IOException {

        TakesScreenshot sc = (TakesScreenshot) driver;
        File sourec = sc.getScreenshotAs(OutputType.FILE);
        File dest = new File("D:\\TESTING\\Screenshots\\" + filename);
        FileUtils.copyFile(sourec, dest);
    }
}
