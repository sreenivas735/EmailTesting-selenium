package Test;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Properties;

public class tstingpage {
    @Before
    public void openbrowserandclickurl() throws IOException {

        String path = System.getProperty("user.dir");

        File file = new File(path + "\\target\\property.properties");
        FileReader read = new FileReader(file);

        Properties prop = new Properties();
        prop.load(read);
        String browser = prop.getProperty("browser.com");
        String applicationUrl = prop.getProperty("application-url");


        if (browser.equals("edge")) {
            System.setProperty("webdriver.edge.driver", path + "\\msedgedriver.exe");
            driver = new EdgeDriver();
        } else if (browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", path+"\\chromedriver.exe");
            driver = new ChromeDriver();
        } else {
            throw new InvalidObjectException("given browser name is not correct please check once");
        }
        driver.manage().window().maximize();
        driver.get(applicationUrl);
    }
    WebDriver driver;

//    @After
//    public void openafter() {
//        driver.close();
//        System.out.println("after the scenario");
//    }


    @Given("enter username and password")
    public void enteruserandpass() {
        System.out.println("username and password");

    }

    @When("click the login button")
    public void clickTheLoginButton() {
        System.out.println("successfully clicked the login button");
    }

    @And("verify the loginpage is visible")
    public void verifyTheLoginpageIsVisible() {
        System.out.println("user is able to visible the login page");
    }


    // scenario for makemytrip

    @Given("Click on X-mark")
    public void clickOnXMark() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='commonModal__close']")));
        driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();

    }

    @And("select the bus")
    public void selectTheBus() {

        WebElement bus = driver.findElement(By.xpath("//li[@class='menu_Buses']"));
        bus.click();
    }

    @When("click the from option")
    public void clickTheFromOption() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("fromCity")));

        WebElement from = driver.findElement(By.id("fromCity"));
        from.click();
    }

    @And("click the search button")
    public void clickTheSearchButton() {
        driver.findElement(By.id("search_button")).click();
    }


    @Then("verify the user able to see the page")
    public void verifyTheUserAbleToSeeThePage() {

        System.out.println("page is visible ");
    }


    @Then("Enter the from {string} and  enter the {string} for selecting city")
    public void enterTheFromAndEnterTheForSelectingCity(String city, String hintcity) throws givenvillageisnotthere, InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@title='From']")));
        WebElement text = driver.findElement(By.xpath("//input[@title='From']"));
        text.sendKeys(city);

        Makemytrip mt = new Makemytrip(driver);

        mt.fromAndtoselectvillage(hintcity);
    }

    @And("Enetr the to {string} and enter the {string} for seelecting city")
    public void enetrTheToAndEnterTheForSeelectingCity(String city, String hintcity) throws givenvillageisnotthere, InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder ='To']")));
        driver.findElement(By.xpath("//input[@placeholder ='To']")).sendKeys(city);
        Makemytrip mt = new Makemytrip(driver);
        mt.fromAndtoselectvillage(hintcity);

    }

    @When("enter the {string} and {string} and {string} for cal selection")
    public void enterTheAndAndForCalSelection(String year, String month, String day) throws ParseException, givenyearandmonthanddate {
        Makemytrip mt = new Makemytrip(driver);
        mt.caldateselect(year,month,day);
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

//        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM");
//        // Parse the month name into a Date object
//        Date datecon = dateFormat.parse(month);
//
//        // Convert the Date object into a month number (1-12)
//        int monthNumber = date.getMonth() + 1;

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
