package projectsTests;

import org.junit.Test;
import org.openqa.selenium.edge.EdgeDriver;

import java.text.ParseException;
import java.util.Set;

public class Testing {
    @Test
    public void testingtheapplication() throws GivenVauleisoutofthemonth, ParseException, InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\sreenu\\IdeaProjects\\selinium-maven\\msedgedriver.exe");
        EdgeDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        loginpage s = new loginpage(driver);
//        s.userdetails("sree", "krishna@gmail", "8978095451", "bengalore, marathahalli, ckb layout-630021");
//        s.gender("male");
//        s.dayselectcheckbox("sunday");
//        s.dayselectcheckbox("saturday");
//        s.countryselect("Canada");
//        s.colourselect("Green");
        s.calenderinmain("2022", "March", "14");
//        s.tabledataviewingslidebyslide(3, 5);
//        s.browsingthedata("selenium");
//        s.alerts("sreenivas");
//        s.copypastethetext();
//        s.draganddropthetext();


//        frame elements

        s.usernameinframe("vasudev krishna");
        s.genderselectinframe("Male");
        s.calenderinframe("2022", "March", "14");
        s.jobinframe("QA Engineer");

    }

}
