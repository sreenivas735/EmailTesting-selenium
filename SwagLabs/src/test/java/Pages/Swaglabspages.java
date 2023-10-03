package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Swaglabspages extends BaseclassORcommonmethods {

    By usernamexpath = By.xpath("//input[@data-test='username']");
    By passwordxpath = By.xpath("//input[@data-test='password']");
    By loginxpath = By.xpath("//input[@id='login-button']");
    By errormsgxpath = By.xpath("//h3[@data-test='error']");
    By sucesstest = By.xpath("//span[contains(text(), 'Products')]");


    public Swaglabspages(WebDriver driver) {
        super(driver);
    }

    public void username(String username) {
        sendkeys(usernamexpath, username);
    }

    public void password(String password) {
        sendkeys(passwordxpath, password);

    }

    public void clickloginbutton() {
        click(loginxpath);
    }

    public void succesfullmsg() {
        waitformethodvisible(sucesstest);
        String msg = gettextmethod(sucesstest);
        System.out.println(msg);
    }

    public void screenshot(String filename) throws IOException {
        Screenshot(filename);
    }

    public void errormsg(String errormsg) {
        String actualmsg = gettextmethod(errormsgxpath);
        Assert.assertEquals(actualmsg, errormsg);
    }
}
