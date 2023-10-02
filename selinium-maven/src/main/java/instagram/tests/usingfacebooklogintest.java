package instagram.tests;

import instagram.pages.Loginpage;
import instagram.pages.usingfacebookloginpage;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.IOException;

public class usingfacebooklogintest {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\sreenu\\IdeaProjects\\selinium-maven\\msedgedriver.exe");
        EdgeDriver driver = new EdgeDriver();
//        driver.manage().window().maximize();
        driver.get("https://www.instagram.com/");

        Loginpage login = new Loginpage(driver);
        login.facebooklogin();
        usingfacebookloginpage fblogin = new usingfacebookloginpage(driver);
        fblogin.Fbusername("vasudevkrishna@gmail.com");
        fblogin.Fbpassword("krishna");
        fblogin.Fbloginbutton();
        login.screenshotfile("facebooklogin240.jpg");
    }
}
