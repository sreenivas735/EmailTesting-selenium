package pages;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

public class RockybhaiCommonmethods {
    static WebDriver driver;

    RockybhaiCommonmethods(WebDriver driver) {
        this.driver = driver;
    }

    public void sendkeys(By byEle, String input) {
        driver.findElement(byEle).sendKeys(input);
    }

    public void screenshot(String filename) throws Exception {

        Thread.sleep(1000);
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File source = screenshot.getScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\Users\\sreenu\\IdeaProjects\\Rock-Bhai\\target\\screenshots\\" + filename + ".jpg");
        FileUtils.copyFile(source, dest);
    }

    public void click(By byEle) {
        driver.findElement(byEle).click();
    }

    public String gettext(By byEle, String input) {
        String text = driver.findElement(byEle).getText();
        Assert.assertEquals(input, text);
        return text;
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

    public void waitmethod(By byEle) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(byEle));
    }

    public void copyandpaste(By byEle) {
        Actions actions = new Actions(driver);
        WebElement ele = driver.findElement(byEle);
        actions.doubleClick(ele).build().perform();
    }

    public void draganddrop(By byEle, By byEle1) {

        Actions actions = new Actions(driver);
        WebElement source = driver.findElement(byEle);
        WebElement dest = driver.findElement(byEle1);
        actions.dragAndDrop(source, dest).build().perform();

    }

    public void slidebar(By sliderxpath, int x, int y) {
        Actions actions = new Actions(driver);
        WebElement ele = driver.findElement(sliderxpath);
        actions.dragAndDropBy(ele, x, y);

    }

    public void enterintofram(By byEle) {
        WebElement ele = driver.findElement(byEle);
        driver.switchTo().frame(ele);
    }

    public void dropdownbyvisibletext(By byEle, String data) {
        WebElement ele = driver.findElement(byEle);
        Select select = new Select(ele);
        select.selectByVisibleText(data);

    }


    public void calenderselect(String givenday, String givenmonth, String givenyear) throws Exception {
        RockybhaiCommonmethods obj = new RockybhaiCommonmethods(driver);

        if (Integer.parseInt(givenday) == 29 & givenmonth.equals("February")) {
            int leapyear1 = Integer.parseInt(givenyear) % 4;
            int leap = 0;
            if (!(leap == leapyear1)) {
                throw new GivenVauleisoutofthemonth("please check the value you have given, and the value { " + givenday + " } is not there in the given month " + givenmonth + ", and the given year is " + givenyear + "not a leap-year ");
            } else {
                obj.methodforcalender(givenday, givenmonth, givenyear);
            }
        } else if (Integer.parseInt(givenday) == 31) {
            if (givenmonth.equals("June") || givenmonth.equals("April") || givenmonth.equals("September") || givenmonth.equals("November")) {
                throw new GivenVauleisoutofthemonth("please check the value you have given, and the value { " + givenday + " } is not there in the given month " + givenmonth);
            } else {
                obj.methodforcalender(givenday, givenmonth, givenyear);
            }
        } else if (Integer.parseInt(givenday) > 31 || Integer.parseInt(givenday) < 1) {
            throw new GivenVauleisoutofthemonth("please check the value you have given, and the value { " + givenday + " } is out of the month");
        } else {
            obj.methodforcalender(givenday, givenmonth, givenyear);
        }
    }

    public void methodforcalender(String givenday, String givenmonth, String givenyear) throws ParseException {

//
//        String givenday = "30";
//        String givenmonth = "February";
//        String givenyear = "2025";

        WebElement MonthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
        String monthyear = MonthYear.getText();
        String Month = monthyear.split(" ")[0];
        String Year = monthyear.split(" ")[1];

        int monthnum = monthTonumberconvert(Month);
        int monthgivennum = monthTonumberconvert(givenmonth);


        if ((Integer.parseInt(givenyear) > Integer.parseInt(Year))) {
            while (!(Month.equals(givenmonth) & Year.equals(givenyear))) {

                driver.findElement(By.xpath("//span[contains(text(), 'Next')]")).click();

                MonthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
                monthyear = MonthYear.getText();
                Month = monthyear.split(" ")[0];
                Year = monthyear.split(" ")[1];
            }

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class ='ui-state-default' and contains(text(), '" + givenday + "')])[1]")));
            WebElement date = driver.findElement(By.xpath("(//a[@class ='ui-state-default' and contains(text(), '" + givenday + "')])[1]"));
            date.click();
        } else if ((Integer.parseInt(givenyear) < Integer.parseInt(Year))) {
            while (!(Month.equals(givenmonth) & Year.equals(givenyear))) {

                driver.findElement(By.xpath("//span[contains(text(), 'Prev')]")).click();

                MonthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
                monthyear = MonthYear.getText();
                Month = monthyear.split(" ")[0];
                Year = monthyear.split(" ")[1];
            }

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class ='ui-state-default' and contains(text(), '" + givenday + "')])[1]")));
            WebElement date = driver.findElement(By.xpath("(//a[@class ='ui-state-default' and contains(text(), '" + givenday + "')])[1]"));
            date.click();

        } else if ((Integer.parseInt(givenyear) == Integer.parseInt(Year) & monthnum > monthgivennum)) {

            while (!(Month.equals(givenmonth) & Year.equals(givenyear))) {

                driver.findElement(By.xpath("//span[contains(text(), 'Prev')]")).click();

                MonthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
                monthyear = MonthYear.getText();
                Month = monthyear.split(" ")[0];
                Year = monthyear.split(" ")[1];
            }
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class ='ui-state-default' and contains(text(), '" + givenday + "')])[1]")));
            WebElement date = driver.findElement(By.xpath("(//a[@class ='ui-state-default' and contains(text(), '" + givenday + "')])[1]"));
            date.click();
        } else if ((Integer.parseInt(givenyear) == Integer.parseInt(Year) & monthnum < monthgivennum)) {
            while (!(Month.equals(givenmonth) & Year.equals(givenyear))) {

                driver.findElement(By.xpath("//span[contains(text(), 'Next')]")).click();

                MonthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
                monthyear = MonthYear.getText();
                Month = monthyear.split(" ")[0];
                Year = monthyear.split(" ")[1];
            }
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class ='ui-state-default' and contains(text(), '" + givenday + "')])[1]")));
            WebElement date = driver.findElement(By.xpath("(//a[@class ='ui-state-default' and contains(text(), '" + givenday + "')])[1]"));
            date.click();
        }

    }

    public int monthTonumberconvert(String monthName) throws ParseException {
        // Replace with your desired month name

        // Create a SimpleDateFormat object to parse month names
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM");
        // Parse the month name into a Date object
        Date date = dateFormat.parse(monthName);

        // Convert the Date object into a month number (1-12)
        int monthNumber = date.getMonth() + 1; // Adding 1 because month numbers are 0-based
        return monthNumber;
    }


    public void framecalender(WebElement ele, String date, String month, String year) throws ParseException {
        Select cal = new Select(ele);
        cal.selectByVisibleText(year);

        WebElement Month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
        String presentmonth = Month.getText();
        int monthnum = monthTonumberconvert(presentmonth);
        int monthgivennum = monthTonumberconvert(month);
        if ((monthnum < monthgivennum)) {
            while (!month.equals(presentmonth)) {

                driver.findElement(By.xpath("//span[contains(text(), 'Next')]")).click();

                Month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
                presentmonth = Month.getText();

            }

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class ='ui-state-default' and contains(text(), '" + date + "')])[1]")));
            WebElement date1 = driver.findElement(By.xpath("(//a[@class ='ui-state-default' and contains(text(), '" + date + "')])[1]"));
            date1.click();
        } else if (monthnum > monthgivennum) {
            while (!month.equals(presentmonth)) {

                driver.findElement(By.xpath("//span[contains(text(), 'Prev')]")).click();

                Month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
                presentmonth = Month.getText();

            }

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class ='ui-state-default' and contains(text(), '" + date + "')])[1]")));
            WebElement date1 = driver.findElement(By.xpath("(//a[@class ='ui-state-default' and contains(text(), '" + date + "')])[1]"));
            date1.click();
        } else {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class ='ui-state-default' and contains(text(), '" + date + "')])[1]")));
            WebElement date1 = driver.findElement(By.xpath("(//a[@class ='ui-state-default' and contains(text(), '" + date + "')])[1]"));
            date1.click();
        }


    }

}

class GivenVauleisoutofthemonth extends Exception {
    GivenVauleisoutofthemonth(String str) {
        super(str);
    }
}


