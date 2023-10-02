package pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class CommonBaseActions {

    WebDriver driver;

    public CommonBaseActions(WebDriver driver) {
        this.driver = driver;
    }


    public void sendkeys(By byElement, String input) {
        driver.findElement(byElement).sendKeys(input);
    }

    public void buttonclick(By byElement) {

        driver.findElement(byElement).click();
    }

    public String gettextmethod(By byElement) {
        waitmethodforvVisibletext(byElement);
       String msg = driver.findElement(byElement).getText();
        System.out.println(msg);
       return msg;
    }

    public void waitmethodforvVisibletext(By byelement) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(byelement));

    }

    public void screenshot(String filename) throws IOException {
        TakesScreenshot screen = (TakesScreenshot) driver;
        File source = screen.getScreenshotAs(OutputType.FILE);
        File dest = new File("D:\\TESTING\\Files\\"+filename);
        FileUtils.copyFile(source, dest);
    }

}
