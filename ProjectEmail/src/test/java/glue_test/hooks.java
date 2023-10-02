package glue_test;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class hooks {
   static WebDriver driver;

    @Before
    public void beforemethod() throws Exception {
        String path = System.getProperty("user.dir");
        File file = new File(path + "\\EmailLogin.properties");

        FileReader reader = new FileReader(file);
        Properties prop = new Properties();
        prop.load(reader);
        String browser = prop.getProperty("browser");
        String appurl = prop.getProperty("application_url");


        if (browser.equals("edge")) {
            System.setProperty("webdriver.edge.driver",path+"\\msedgedriver.exe" );
            driver = new EdgeDriver();
        }else if(browser.equals("chrome")){
            System.setProperty("webdriver.chrome.driver",path+"\\chromedriver.exe" );
            driver = new ChromeDriver();
        }else {
            throw new driverinvalid("given driver is invalid please check it once");
        }
        driver.manage().window().maximize();
        driver.get(appurl);


    }

    @After
    public void aftermethod() {

    }
}

class driverinvalid extends Exception{

    driverinvalid(String str){
        super(str);
    }
}
