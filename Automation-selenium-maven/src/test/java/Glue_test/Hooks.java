package Glue_test;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.*;
import java.util.Properties;

public class Hooks {
    static WebDriver driver;

    @Before
    public void brforemethod() throws Exception {
        String path = System.getProperty("user.dir");
        File file = new File(path + "\\automation.properties");
        FileReader read = new FileReader(file);

        Properties properties = new Properties();
        properties.load(read);
        String browser = properties.getProperty("browser");
        String appUrl = properties.getProperty("application_url");

        if (browser.equals("edge")) {
            System.setProperty("webdriver.edge.driver", path + "\\msedgedriver.exe");
            driver = new EdgeDriver();

        } else if (browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", path + "\\chromedriver.exe");
            driver = new ChromeDriver();
        } else {
            throw new InvalidObjectException("given browser name is not correct please check it once and try again");
        }
        driver.manage().window().maximize();
        driver.get(appUrl);

    }

    @After
    public void aftermethod() {
        driver.quit();

    }
}
