package instagram.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class forgotpasswordpage {
    WebDriver driver;
   String username = "//input[@placeholder='Email, Phone, or Username']";
    String loginsend = "//div[contains(text(), 'Send login link')]";
    @FindBy(xpath = "//input[@placeholder='Email, Phone, or Username']")
    private WebElement usernameforgot;

    @FindBy(xpath = "//div[contains(text(), 'Send login link')]")
    private WebElement loginlinksend;


    public forgotpasswordpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void forgotusername(String usermailidorphone) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(username)));
        usernameforgot.sendKeys(usermailidorphone);

    }

    public void loginlinksendingbutton() {
        loginlinksend.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(loginsend)));
    }


}

