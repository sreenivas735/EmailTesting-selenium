package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Githubloginpage extends CommonBaseActions {

    By usernamexpath = By.id("login_field");
    By passwordxpath = By.id("password");
    By signinbuttonpath = By.xpath("//input[@value='Sign in']");
    By visibletextpath = By.xpath("(//span[contains(text(), 'Dashboard')])[2]");

    By errormessagexpath = By.xpath("//div[contains(text(), 'Incorrect')]");
    WebDriver driver;

    public Githubloginpage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void username(String username) {
        sendkeys(usernamexpath, username);
    }

    public void password(String password) {
        sendkeys(passwordxpath, password);
    }

    public void clickbutton() {
        buttonclick(signinbuttonpath);
    }

    public void userloginsuccessfull() {
        String text = gettextmethod(visibletextpath);
        waitmethodforvVisibletext(visibletextpath);
        System.out.println(text);

    }

    public void waitmethod() {
//        waitmethodforvVisibletext(byelement);
    }

    public void errormassage(String errormsg) {
        String actualerror = gettextmethod(errormessagexpath);
        waitmethodforvVisibletext(errormessagexpath);
        Assert.assertTrue(actualerror.contains(errormsg));

    }
}
