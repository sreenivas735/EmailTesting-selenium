package Email.tests;

import Email.page.loginpage;
import org.openqa.selenium.edge.EdgeDriver;

public class logintest {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\sreenu\\IdeaProjects\\selinium-maven\\msedgedriver.exe");
        EdgeDriver driver = new EdgeDriver();
//        driver.manage().window().maximize();
        driver.get("https://mail.google.com/");


        loginpage login = new loginpage(driver);
        login.screenshots("login.jpg");
        login.username();
        login.languagedropdown();
        login.nextbutton();
        login.screenshots("afterlogin.jpg");

    }

}
