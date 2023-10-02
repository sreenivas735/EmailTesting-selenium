package instagram.pages;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Loginpage {
    String usernameXpath = "//input[@name='username']";
    String loginButtonXpath = "//button[@type='submit']";
    String forgotpassword = "//span[contains(text(), 'Forgot password?')]";

    String facebookloginlink ="//span[contains(text(), 'Log in with Facebook')]";

    WebDriver driver;

    @FindBy(xpath = "//input[@name='username']")
    private WebElement userrnameinsta;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordinsta;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement button;

    @FindBy(xpath = "//span[contains(text(), 'Log in with Facebook')]")
    private WebElement facebooklogin;

    @FindBy(xpath = "//span[contains(text(), 'Forgot password?')]")
    private WebElement forgotpass;


    public Loginpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void username(String username) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(usernameXpath)));
        userrnameinsta.sendKeys(username);
    }

    public void password(String password) {
        passwordinsta.sendKeys(password);
    }

    public void submitbutton() {
        button.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(loginButtonXpath)));
    }

    public void facebooklogin() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(facebookloginlink)));
        facebooklogin.click();
    }

    public void forgotpassword() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(forgotpassword)));
        forgotpass.click();

    }


    public void screenshotfile(String filename) throws IOException {

        TakesScreenshot sc = (TakesScreenshot) driver;
        File sourec = sc.getScreenshotAs(OutputType.FILE);
        File dest = new File("D:\\TESTING\\Screenshots\\" + filename);
        FileUtils.copyFile(sourec, dest);
    }
}

