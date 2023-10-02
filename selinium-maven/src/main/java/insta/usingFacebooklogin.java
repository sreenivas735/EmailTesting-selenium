package insta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.swing.plaf.PanelUI;

public class usingFacebooklogin {
    String FBusername = "//input[@id='email']";
    String FBPassword = "//input[@id='pass']";
    String FBloginButton = "//button[@name='login']";


    WebDriver driver;

    usingFacebooklogin(WebDriver driver) {
        this.driver = driver;
    }

    public void Fbusername(String fbusername) {
        driver.findElement(By.xpath(FBusername)).sendKeys(fbusername);
    }

    public void Fbpassword(String fbpassword) {
        driver.findElement(By.xpath(FBPassword)).sendKeys(fbpassword);

    }

    public void Fbloginbutton() {
        driver.findElement(By.xpath(FBloginButton)).click();
    }
}
