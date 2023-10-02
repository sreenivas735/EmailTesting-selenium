package Calender;

import io.cucumber.java.sl.In;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class calendermakemytrip {

    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\sreenu\\IdeaProjects\\selinium-maven\\msedgedriver.exe");
        EdgeDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='commonModal__close']")));
        driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();


        WebElement bus = driver.findElement(By.xpath("//li[@class='menu_Buses']"));
        bus.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@for='travelDate']")));
        driver.findElement(By.xpath("//label[@for='travelDate']")).click();

        WebElement datetext = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]"));
        String mothyear = datetext.getText();
        String presentmonth = mothyear.split(" ")[0];  //sept
        String presentyear = mothyear.split(" ")[1];   //2023

        String givenyear = "2023";  // integer convert
        String givenmonth = "December";  // number convert
        String givenday = "25";

        int lastyearofcal = 2024;
        int lastmonthofcal = monthTonumberconvert("January");
        int latdayofcal = 2;



//        int calyear = Integer.parseInt(givenyear);
        int presentmonthnumber = monthTonumberconvert(presentmonth);
        int givenmoonthnumber = monthTonumberconvert(givenmonth);

        if (Integer.parseInt(givenyear) >= Integer.parseInt(presentyear)) {

            if(Integer.parseInt(givenyear)>=lastyearofcal & givenmoonthnumber>lastmonthofcal & Integer.parseInt(givenday)>latdayofcal){
                throw new GivenvaluesException("given "+givenyear+" or "+givenmonth+" or "+givenday+"  one of the value is not there in that calender");
            }
            while (!(presentyear.equals(givenyear) & presentmonth.equals(givenmonth))) {
                WebElement navigaetonext = driver.findElement(By.xpath("//span[@aria-label='Next Month']"));
                navigaetonext.click();

                datetext = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]"));
                mothyear = datetext.getText();
                presentmonth = mothyear.split(" ")[0];  //sept
                presentyear = mothyear.split(" ")[1];
            }
            WebElement datepick = driver.findElement(By.xpath("(//div[@class='DayPicker-Day'  and contains(text(), '" + givenday+ "')])[1]"));
            datepick.click();
//        }else if(Integer.parseInt(givenyear)== Integer.parseInt(presentyear)) {
//
//            while (!(presentmonth.equals(givenmonth))){
//                driver.findElement(By.xpath("//span[contains(text(), 'Next')]")).click();
//
//                datetext = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]"));
//                mothyear = datetext.getText();
//                presentmonth = mothyear.split(" ")[0];  //sept
//                presentyear = mothyear.split(" ")[1];
//            }
//            WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//            wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class ='ui-state-default' and contains(text(), '" + givenday + "')])[1]")));
//            WebElement date = driver.findElement(By.xpath("(//a[@class ='ui-state-default' and contains(text(), '" + givenday + "')])[1]"));
//            date.click();
        }


    }

    public static int monthTonumberconvert(String monthName) throws ParseException {
        // Replace with your desired month name

        // Create a SimpleDateFormat object to parse month names
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM");
        // Parse the month name into a Date object
        Date date = dateFormat.parse(monthName);

        // Convert the Date object into a month number (1-12)
        int monthNumber = date.getMonth() + 1; // Adding 1 because month numbers are 0-based
        return monthNumber; // 6
    }
}

class GivenvaluesException extends Exception{
    GivenvaluesException(String str){
        super(str);
    }
}
