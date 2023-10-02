package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Year;

public class EneterdataToweb {
    public static void main(String[] args) throws InterruptedException {
        createaccount();
    }

    public static void createaccount() throws InterruptedException {
        System.setProperty("Webdriver.edge.driver", "C:\\Users\\sreenu\\IdeaProjects\\selinium-maven\\msedgedriver.exe");
//        EdgeDriver driver = new EdgeDriver();
//
//        driver.get("https://www.google.com/");
////
////        Searchbar
//        String Searchbar = "//textarea[@type='search']";
//        By search = By.xpath(Searchbar);
//        WebElement Searchbox = driver.findElement(search);
//
//        Searchbox.sendKeys("selenium"+ Keys.ENTER);
//
////        WebElement button = driver.findElement(By.xpath("//input[@role='button']"));
////
////        button.click();
//
        EdgeDriver driver1 = new EdgeDriver();

        driver1.manage().window().maximize();
        //Automation excercise
        driver1.get("https://automationexercise.com/signup");
//
        //username
        WebElement design = driver1.findElement(By.xpath("//input[@type='text']"));
        design.sendKeys("vasudev krishna");
        //email
        WebElement email = driver1.findElement(By.xpath("//input[ @type='email' and  @data-qa='signup-email']"));
        email.sendKeys("vamsivempalla@gmail.com");
        //signupbutton
        WebElement signupbutton = driver1.findElement(By.xpath("//button[ @type='submit' and @data-qa='signup-button']"));
        signupbutton.click();

//        WebElement error = driver1.findElement(By.xpath("//button[@data-qa='signup-button']//preceding-sibling::p"));
//        String s =error.getText();
//        System.out.println(s);

        //button[@data-qa='signup-button']//preceding-sibling::p
        //checkbox
        WebElement radiobutton = driver1.findElement(By.xpath("//label[@class='top']"));
        radiobutton.click();

        //password
        WebElement pass = driver1.findElement(By.xpath("//input[@type='password']"));
        pass.sendKeys("Sreenivas@735");

        WebElement date = driver1.findElement(By.xpath("//select[@id='days']"));
        date.click();
        date.sendKeys("10");

        WebElement month = driver1.findElement(By.xpath("//select[@id='months']"));
        month.click();
        month.sendKeys("June");

        WebElement year = driver1.findElement(By.xpath("//select[@id='years']"));
        year.click();
        year.sendKeys("1998");

        WebElement checkbox = driver1.findElement(By.xpath("//input[@type='checkbox']"));
        checkbox.click();

        WebElement firstname = driver1.findElement(By.xpath("//input[@type='text' and @id='first_name']"));
        firstname.sendKeys("sreenivas");

        WebElement lastname = driver1.findElement(By.xpath("//input[@type='text' and @id='last_name']"));
        lastname.sendKeys("surepalli");

        WebElement company = driver1.findElement(By.xpath("//input[@type='text' and @id='company']"));
        company.sendKeys("vasudev solutions Pvt Ltd");

        WebElement address1 = driver1.findElement(By.xpath("//input[@type='text' and @id='address1']"));
        address1.sendKeys("1-123, vembuluru, dakkili,tirupathi, Andrapradesh-524134");

        WebElement address2 = driver1.findElement(By.xpath("//input[@type='text' and @id='address2']"));
        address2.sendKeys("1-123, vembuluru, dakkili,tirupathi, Andrapradesh-524134");

        WebElement state = driver1.findElement(By.xpath("//input[@type='text' and @id='state']"));
        state.sendKeys("Andrapradesh");

        WebElement city = driver1.findElement(By.xpath("//input[@type='text' and @id='city']"));
        city.sendKeys("Thirupathi");

        WebElement Pincode = driver1.findElement(By.xpath("//input[@type='text' and @id='zipcode']"));
        Pincode.sendKeys("524134");

        WebElement mobileno = driver1.findElement(By.xpath("//input[@type='text' and @id='mobile_number']"));
        mobileno.sendKeys("Andrapradesh");


        WebElement createbutton = driver1.findElement(By.xpath("//button[@type='submit' and @data-qa='create-account']"));
        createbutton.click();


        Thread.sleep(3000);

        WebElement continuebutton = driver1.findElement(By.xpath("//a[@data-qa='continue-button']"));
        continuebutton.click();

//        WebElement addclose = driver1.findElement(By.xpath("//span[@dir='auto']"));
//        addclose.click();

        WebElement logout = driver1.findElement(By.xpath("//a[@href ='/logout']"));
        logout.click();

        //// login page

//        WebElement emaillogin = driver1.findElement(By.xpath("//input[@type='email']"));
//        emaillogin.sendKeys(email1);
//
//
//        WebElement passlogin = driver1.findElement(By.xpath("//input[@type='password']"));
//        passlogin.sendKeys(pass1);
//
//
//        WebElement signbutton = driver1.findElement(By.xpath("//button[@type='submit']"));
//        signbutton.click();

    }


}
