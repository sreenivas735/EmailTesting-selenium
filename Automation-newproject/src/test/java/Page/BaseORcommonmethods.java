package Page;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.devtools.v85.webaudio.WebAudio;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class BaseORcommonmethods {
    WebDriver driver;

    BaseORcommonmethods(WebDriver driver) {
        this.driver = driver;
    }

    public void sendkeys(By byEle, String input) {
        driver.findElement(byEle).sendKeys(input);
    }

    public void click(By byEle) {
        driver.findElement(byEle).click();
    }

    public String gettext(By byEle, String input) {
        String text = driver.findElement(byEle).getText();
        Assert.assertEquals(input, text);
        return text;
    }

    public void screenshot(String filename) throws IOException {
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File source = screenshot.getScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\Users\\sreenu\\IdeaProjects\\Automation-Testing\\target\\screenshots\\" + filename + ".jpg");
        FileUtils.copyFile(source, dest);
    }

    public void ExplicitwaittimeVisible(By byEle) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(byEle));
    }

    public void ExplicitwaitClickable(By byEle) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(byEle));
    }

    public void gettextList(By byEle, String input) {
        List<WebElement> list = driver.findElements(byEle);
        for (WebElement ele : list) {
            String element = ele.getText();
            if (element.equals(input)) {
                Assert.assertEquals(element, input);
            }
        }
    }

}
