package automationtestingEx;

import io.cucumber.java.be.I;
import io.cucumber.java.sl.In;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

public class testingautomation {
    public static void main(String[] args) throws InterruptedException, givenvillageisnotthere, ParseException, givenyearandmonthanddate {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\sreenu\\IdeaProjects\\selinium-maven\\msedgedriver.exe");
        EdgeDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();


        WebElement bus = driver.findElement(By.xpath("//li[@class='menu_Buses']"));
        bus.click();


        wait.until(ExpectedConditions.elementToBeClickable(By.id("fromCity")));

        WebElement from = driver.findElement(By.id("fromCity"));
        from.click();

        Thread.sleep(2000);

        WebElement text = driver.findElement(By.xpath("//input[@title='From']"));
        text.sendKeys("nellore");

        Makemytrip mt = new Makemytrip(driver);

        mt.fromAndtoselectvillage("Nellore");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder ='To']")));
        driver.findElement(By.xpath("//input[@placeholder ='To']")).sendKeys("beng");
        mt.fromAndtoselectvillage("Bangalore (Bengaluru)");
//        village.caldateselect("2024","November", "5");

        mt.caldateselect("2023", "November", "25");

        driver.findElement(By.id("search_button")).click();

    }
}

class Makemytrip extends Exception {
    WebDriver driver;

    Makemytrip(WebDriver driver) {
        this.driver = driver;
    }

    public void fromAndtoselectvillage(String selectvillage) throws givenvillageisnotthere, InterruptedException {

        Thread.sleep(3000);
        List<WebElement> listofelements = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
        int count = 0;
        for (WebElement value : listofelements) {

            String starting1 = value.getText();

            if (starting1.contains(selectvillage)) {
                count++;
                value.click();

                break;
            }

        }
        if (!(count == 0)) {
            System.out.println("given village is selected");
        } else {
            throw new givenvillageisnotthere("given village is not there, please check it once");
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

    public void caldateselect(String givenyear, String givenmonth, String givendate) throws ParseException, givenyearandmonthanddate {

        WebElement date = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]"));
        String monthyear = date.getText();

//        String givenmonth = "November";
//        String givenyear = "2023";
//        String givendate = "24";
        String month = monthyear.split(" ")[0];
        String year = monthyear.split(" ")[1];

        int monthnum = monthTonumberconvert(month);
        int monthgivennum = monthTonumberconvert(givenmonth);

        if (!(Integer.parseInt(givenyear) == Integer.parseInt(year))) {
            throw new givenyearandmonthanddate("given " + givenyear + " or " + givenmonth + " or " + givendate + " one of the value is not there in the calender");

        } else if (Integer.parseInt(givenyear) > Integer.parseInt(year)) {

            while (!(month.equals(givenmonth))) {
                WebElement navigaetonext = driver.findElement(By.xpath("//span[@aria-label='Next Month']"));
                navigaetonext.click();

                date = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]"));
                monthyear = date.getText();
                month = monthyear.split(" ")[0];
                year = monthyear.split(" ")[1];

            }
            WebElement datepick = driver.findElement(By.xpath("(//div[@class='DayPicker-Day'  and contains(text(), '" + givendate + "')])[1]"));
            datepick.click();

        } else if (Integer.parseInt(givenyear) == Integer.parseInt(year) & monthnum < monthgivennum) {

            while (!(month.equals(givenmonth))) {
                WebElement navigaetonext = driver.findElement(By.xpath("//span[@aria-label='Next Month']"));
                navigaetonext.click();

                date = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]"));
                monthyear = date.getText();
                month = monthyear.split(" ")[0];
                year = monthyear.split(" ")[1];

            }
            WebElement datepick = driver.findElement(By.xpath("(//div[@class='DayPicker-Day'  and contains(text(), '" + givendate + "')])[1]"));
            datepick.click();
        } else if (Integer.parseInt(givenyear) == Integer.parseInt(year) & monthnum == monthgivennum) {

            WebElement datepick = driver.findElement(By.xpath("(//div[@class='DayPicker-Day'  and contains(text(), '" + givendate + "')])[1]"));
            datepick.click();
        }

    }

}

class givenyearandmonthanddate extends Exception {
    givenyearandmonthanddate(String str) {
        super(str);
    }

}

class givenvillageisnotthere extends Exception {
    givenvillageisnotthere(String s) {
        super(s);

    }

}
