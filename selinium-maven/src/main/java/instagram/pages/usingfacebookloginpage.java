package instagram.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class usingfacebookloginpage {
    WebDriver driver;
    String usernname = "//input[@id='email']";
    String button ="//button[@name='login']";

    public usingfacebookloginpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='email']")
    private WebElement usertext;

    @FindBy(xpath = "//input[@id='pass']")
    private WebElement password;

    @FindBy(xpath = "//button[@name='login']")
    private WebElement loginbutton;

    public void Fbusername(String fbusername) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(usernname)));
        usertext.sendKeys(fbusername);
    }

    public void Fbpassword(String fbpassword) {
        password.sendKeys(fbpassword);

    }

    public void Fbloginbutton() {
        loginbutton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(button)));

    }
}
