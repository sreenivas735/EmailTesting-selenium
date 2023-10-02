package instagram.tests;

import instagram.pages.Loginpage;
import instagram.pages.forgotpasswordpage;
import org.openqa.selenium.edge.EdgeDriver;


import java.io.IOException;

public class forgotpasswordtest {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\sreenu\\IdeaProjects\\selinium-maven\\msedgedriver.exe");
        EdgeDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.instagram.com/");

        Loginpage login = new Loginpage(driver);
        login.forgotpassword();
        forgotpasswordpage forgotpass = new forgotpasswordpage(driver);
        forgotpass.forgotusername("sreevasu@gmail.com");
        forgotpass.loginlinksendingbutton();
        login.screenshotfile("forgot.jpg");
        driver.close();


    }
}
