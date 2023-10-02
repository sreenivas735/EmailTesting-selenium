package insta;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.IOException;

public class Instagram {
    @Test
    public void instalogin() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\sreenu\\IdeaProjects\\selinium-maven\\msedgedriver.exe");
        EdgeDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.instagram.com/");

        String expectedtitle = "Instagram";

        loginpage login = new loginpage(driver);

       String actualtitle = driver.getTitle();

        Assert.assertEquals(expectedtitle,actualtitle);

        login.username("vasudev@gmail.com");
//        login.screenshotfile("username.jpg");
        login.password("vasudev");
//        login.screenshotfile("password.jpg");

        WebElement playstore = driver.findElement(By.xpath("//img[@alt='Get it on Google Play']"));

        System.out.println(playstore.isDisplayed());
        Assert.assertTrue(playstore.isDisplayed());

        login.submitbutton();
//        login.screenshotfile("afterlogin.jpg");

    }

    @Test
    public void instaforgotpass() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\sreenu\\IdeaProjects\\selinium-maven\\msedgedriver.exe");
        EdgeDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.instagram.com/");

        //forgotpassword
        loginpage login = new loginpage(driver);
        login.forgotpassword();
        Forgotpassword forgotpass = new Forgotpassword(driver);
        forgotpass.forgotusername("sreevasu@gmail.com");
        forgotpass.loginlinksendingbutton();
    }

    @Test
    public void instafacebooklogin() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\sreenu\\IdeaProjects\\selinium-maven\\msedgedriver.exe");
        EdgeDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.instagram.com/");

        //forgotpassword
        loginpage login = new loginpage(driver);
        //facebooklogin
        login.facebooklogin();
        usingFacebooklogin fblogin = new usingFacebooklogin(driver);
        fblogin.Fbusername("vasudevkrishna@gmail.com");
        fblogin.Fbpassword("krishna");
        fblogin.Fbloginbutton();
    }
}
