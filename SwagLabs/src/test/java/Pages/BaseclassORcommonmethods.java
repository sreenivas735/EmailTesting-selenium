package Pages;

import com.google.j2objc.annotations.Weak;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class BaseclassORcommonmethods {
    WebDriver driver;


    public BaseclassORcommonmethods(WebDriver driver) {
        this.driver = driver;

    }

    public void sendkeys(By byElement, String input) {
        driver.findElement(byElement).sendKeys(input);
    }

    public void click(By byElement) {
        driver.findElement(byElement).click();
    }

    public void waitFormethodclick(By byElement) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(byElement));
    }

    public void waitformethodvisible(By byElement) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(byElement));
    }

    public void Screenshot(String filename) throws IOException {
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File source = screenshot.getScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\Users\\sreenu\\IdeaProjects\\SwagLabs\\target\\screenshots\\"+ filename);
        FileUtils.copyFile(source,dest);
    }

    public String gettextmethod(By byElement) {
        String text = driver.findElement(byElement).getText();
        System.out.println(text);
        return text;
    }

}
