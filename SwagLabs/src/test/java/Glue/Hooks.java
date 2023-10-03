package Glue;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.FileReader;
import java.io.InvalidObjectException;
import java.util.Properties;

public class Hooks {
   static WebDriver driver;
    @Before
    public void beforemethod() throws Exception {
        String path = System.getProperty("user.dir");

        File file = new File(path + "\\Swaglabs.properties");
        FileReader read = new FileReader(file);

        Properties prop = new Properties();
        prop.load(read);


        String browser = prop.getProperty("browser");
        String appUrl = prop.getProperty("application_url");

        if (browser.equals("edge")) {
            System.setProperty("webdriver.edge.driver", path + "\\msedgedriver.exe");
            driver = new EdgeDriver();
        } else if (browser.equals("chrome")) {
            System.setProperty("webdriver.edge.driver", path + "\\chromedriver.exe");
            driver = new ChromeDriver();
        } else {

            throw new InvalidObjectException(browser + " it is not a browser please check it once");
        }
        driver.manage().window().maximize();
        driver.get(appUrl);
    }

    @After
    public void aftermethod(){
        driver.quit();

    }
}
