package projectsTests;


import io.cucumber.java.an.Y;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.awt.*;
import java.security.Key;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

public class Automation {
    public static void main(String[] args) throws InterruptedException, ParseException, GivenVauleisoutofthemonth {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\sreenu\\IdeaProjects\\selinium-maven\\msedgedriver.exe");
        EdgeDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
//        driver.findElement(By.id("name")).sendKeys("Sreenivas Surepalli");
//
//        driver.findElement(By.id("email")).sendKeys("Vasusurepalli735@gmail.com");
//
//        driver.findElement(By.id("phone")).sendKeys("6302305451");
//
//        driver.findElement(By.id("textarea")).sendKeys("Vembuluru, Dakkili, Tirupathi, Andrapradesh - 524134");
//
//        driver.findElement(By.id("male")).click();
//
//
//        driver.findElement(By.id("sunday")).click();
//        driver.findElement(By.id("friday")).click();
//        driver.findElement(By.id("tuesday")).click();
//

//        WebElement country = driver.findElement(By.id("country"));
//        country.click();
//        Select dropcountry = new Select(country);
//        dropcountry.selectByVisibleText("Japan");
////
//
//        WebElement colors = driver.findElement(By.id("colors"));
//        Select dropcolors = new Select(colors);
//        dropcolors.selectByVisibleText("Blue");
//
//
////        WebElement opencartlink = driver.findElement(By.xpath("//a[contains(text(), 'open cart')]"));
////        opencartlink.click();
////
////        WebElement openOrangeHRM = driver.findElement(By.xpath("//a[contains(text(), 'orange HRM')]"));
////        openOrangeHRM.click();
//
//
//        WebElement eleTable = driver.findElement(By.xpath("(//a[contains(text(), '2')])[1]"));
//        eleTable.click();
        //for table selection
        //(//table[@id='productTable']//input)[5]
//
//        Thread.sleep(2000);
//        WebElement eleTable1 = driver.findElement(By.xpath("(//a[contains(text(), '3')])[1]"));
//        eleTable1.click();
//        Thread.sleep(2000);
//        WebElement eleTable2 = driver.findElement(By.xpath("(//a[contains(text(), '4')])[1]"));
//        eleTable2.click();
//
//
//        driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("selenium" + Keys.ENTER);
//
////        WebElement nextpage = driver.findElement(By.xpath("//button[contains(text(), 'New Browser Window')]"));
////        nextpage.click();
//
//
//        WebElement art1 = driver.findElement(By.xpath("//button[@onclick='myFunctionAlert()']"));
//        art1.click();
//        Alert art = driver.switchTo().alert();
////        System.out.println(art.getText());
//        art.accept();
//
//
//        Thread.sleep(2000);
//        WebElement art2 = driver.findElement(By.xpath("//button[@onclick='myFunctionConfirm()']"));
//        art2.click();
//        Alert artt = art;
////        System.out.println(art.getText());
//        artt.dismiss();
//        Thread.sleep(2000);
//
//
//        WebElement art3 = driver.findElement(By.xpath("//button[@onclick='myFunctionPrompt()']"));
//        art3.click();
//        Alert arttt = art;
//        arttt.sendKeys("vasudev");
////        System.out.println(art.getText());
//        arttt.accept();
//
//
//        Actions act = new Actions(driver);
//
//        WebElement doubleclick = driver.findElement(By.xpath("//button[@ondblclick='myFunction1()']"));
//        act.doubleClick(doubleclick).build().perform();
//
//        WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
//        WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
//        act.dragAndDrop(drag, drop).build().perform();
//
//
//        WebElement frame = driver.findElement(By.id("frame-one796456169"));
//        driver.switchTo().frame(frame);
//
//        WebElement user = driver.findElement(By.id("RESULT_TextField-0"));
//        user.sendKeys("vasudev krishna");
//
//
//        WebElement radio = driver.findElement(By.xpath("//label[@for='RESULT_RadioButton-1_0']"));
//        radio.click();
//
//        WebElement skill = driver.findElement(By.id("RESULT_RadioButton-3"));
//        Select dropSkill = new Select(skill);
//        dropSkill.selectByVisibleText("Developer");
//
//        WebElement framecal = driver.findElement(By.id("RESULT_TextField-2"));
//        framecal.sendKeys("04/25/2020");
//
//        Thread.sleep(5000);
//
//        WebElement framcal1 = driver.findElement(By.xpath("//span[@class='icon_calendar']"));
//        framcal1.click();
//
//
//        WebElement yearselect = driver.findElement(By.xpath("//select[@data-handler='selectYear']"));
        SelectCalender calenders = new SelectCalender(driver);
//        calenders.foranothercalinframe(yearselect, "1998", "October", "18");
//
////        WebElement submit = driver.findElement(By.name("Submit"));
////        submit.click();
//
//        driver.switchTo().defaultContent();
//
        WebElement cal = driver.findElement(By.id("datepicker"));
        cal.click();

        Thread.sleep(3000);

        calenders.calenderselect("30", "February", "2023");


    }

}


class SelectCalender extends Exception {

    WebDriver driver;

    SelectCalender(WebDriver driver) {
        this.driver = driver;
    }


    public void calenderselect(String givenday, String givenmonth, String givenyear) throws ParseException, GivenVauleisoutofthemonth {
        SelectCalender obj = new SelectCalender(driver);

        if (Integer.parseInt(givenday) == 29 & givenmonth.equals("February")) {
            int leapyear1 = Integer.parseInt(givenyear) % 4;
            int leap = 0;
            if (!(leap == leapyear1)) {
                throw new GivenVauleisoutofthemonth("please check the value you have given, and the value { " + givenday + " } is not there in the given month " + givenmonth + ", and the given year is " + givenyear + "not a leap-year ");
            } else {
                obj.methodforcalender(givenday, givenmonth, givenyear);
            }
        } else if (Integer.parseInt(givenday) > 29 & givenmonth.equals("February")) {
            throw new GivenVauleisoutofthemonth("please check the value you have given, and the value { " + givenday + " } is not there in the given month " + givenmonth);

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
        }else if (Integer.parseInt(givenyear) == Integer.parseInt(Year) & monthnum==monthgivennum){
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


    public void foranothercalinframe(WebElement ele, String year, String month, String date) throws ParseException {
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

