package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.security.Key;

public class bookmyshow {

    public static void main(String[] args) throws InterruptedException {
        bookmyshow();

    }

    public static void bookmyshow() throws InterruptedException {

        System.setProperty("webdriver.edge.driver", "C:\\Users\\sreenu\\IdeaProjects\\selinium-maven\\msedgedriver.exe");
        EdgeDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://in.bookmyshow.com/");

        Thread.sleep(3000);

       WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
       search.sendKeys("Nellore");

       Thread.sleep(2000);
//       Thread.sleep(2000);
//
//       WebElement data = driver.findElement(By.xpath("//input[@type='text']"));
//
//       data.sendKeys("nellore"+Keys.ENTER);
        Select s = new Select(search);
        s.selectByValue("Kovur");




    }
}
