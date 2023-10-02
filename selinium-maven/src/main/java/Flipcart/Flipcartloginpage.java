package Flipcart;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class Flipcartloginpage {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\sreenu\\IdeaProjects\\selinium-maven\\msedgedriver.exe");
        EdgeDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");

        WebElement Xmark = driver.findElement(By.xpath("//span[@role='button']"));
        Xmark.click();
        WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
        search.sendKeys("mobiles" + Keys.ENTER);

        WebElement brand = driver.findElement(By.xpath("//input[@placeholder='Search Brand']"));

        brand.sendKeys("OnePlus");

        WebElement mobileselect = driver.findElement(By.xpath("//div[@class='_24_Dny']"));
        mobileselect.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='_1YAKP4']//select[@class='_2YxCDZ']")));
        WebElement minprice = driver.findElement(By.xpath("//div[@class='_1YAKP4']//select[@class='_2YxCDZ']"));

        Select dropdownmin = new Select(minprice);
        dropdownmin.selectByValue("20000");

//        WebElement maxprice = driver.findElement(By.xpath("//div[@class='_3uDYxP']//select[@class='_2YxCDZ']"));
//        Select dropdownmax = new Select(maxprice);
//        dropdownmax.selectByValue("30000+");

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='OnePlus 11R 5G (Sonic Black, 128 GB)'][1]")));
            WebElement phone = driver.findElement(By.xpath("//a[@title='OnePlus 11R 5G (Sonic Black, 128 GB)'][1]"));
            phone.click();
        } catch (Exception ex) {
            System.out.println("2nd");
        }
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(), 'OnePlus 11R 5G (Sonic Black, 128 GB)')]")));
            WebElement phone1 = driver.findElement(By.xpath("//div[contains(text(), 'OnePlus 11R 5G (Sonic Black, 128 GB)')]"));
            phone1.click();
        } catch (Exception ex1) {
            System.out.println("1st");
        }


//        String parent = driver.getWindowHandle();
//        Set<String> s = driver.getWindowHandles();
//
//        s.remove(parent);
//
//        for (String m : s) {
//            driver.switchTo().window(m);
//        }


        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")));
        WebElement cart = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
        cart.click();



        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(), 'Save for later')]")));
        WebElement save = driver.findElement(By.xpath("//div[contains(text(), 'Save for later')]"));
         save.click();

    }

}
