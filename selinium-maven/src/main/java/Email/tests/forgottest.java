package Email.tests;

import Email.page.forgotmailpage;
import Email.page.loginpage;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.IOException;

public class forgottest {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\sreenu\\IdeaProjects\\selinium-maven\\msedgedriver.exe");
        EdgeDriver driver = new EdgeDriver();
//        driver.manage().window().maximize();
        driver.get("https://mail.google.com/");


        loginpage login = new loginpage(driver);
        login.forgotpass();
        forgotmailpage forgot = new forgotmailpage(driver);
        forgot.username();
        forgot.nextbutton();
        login.screenshots("afterdetails.jpg");

    }
}
