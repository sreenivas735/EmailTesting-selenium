package Email.tests;

import Email.page.createaccountpage;
import Email.page.loginpage;
import org.openqa.selenium.edge.EdgeDriver;

public class createACtest {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\sreenu\\IdeaProjects\\selinium-maven\\msedgedriver.exe");
        EdgeDriver driver = new EdgeDriver();
//        driver.manage().window().maximize();
        driver.get("https://mail.google.com/");


        loginpage login = new loginpage(driver);
        login.createaccount();
        login.createdropdown();

        createaccountpage newac = new createaccountpage(driver);
        newac.firstname();
        newac.lastname();
        newac.nextbutton();
    }
}
