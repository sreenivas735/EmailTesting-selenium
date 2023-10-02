package instagram.tests;

import instagram.pages.Loginpage;

import org.openqa.selenium.edge.EdgeDriver;

import java.io.IOException;

public class logintest {


    public static void method() throws IOException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\sreenu\\IdeaProjects\\selinium-maven\\msedgedriver.exe");
        EdgeDriver driver = new EdgeDriver();
//        driver.manage().window().maximize();
        driver.get("https://www.instagram.com/");


        //positive scenario valid username and password
        Loginpage login = new Loginpage(driver);
        login.username("vasudev@gmail.com");
        login.screenshotfile("username.jpg");
        login.password("vasudev");
        login.screenshotfile("password.jpg");
        login.submitbutton();
        login.screenshotfile("afterlogin.jpg");
    }
}
