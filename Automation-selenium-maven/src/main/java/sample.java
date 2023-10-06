import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class sample {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","C:\\Users\\sreenu\\IdeaProjects\\Automation-Testing\\msedgedriver.exe");
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");

        driver.findElement(By.xpath("//a[contains(text(), 'open cart')]")).click();
    }
}
