package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class automationpage extends BaseORcommonmethods {
    WebDriver driver;

    public automationpage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }


    By usernamexpath = By.id("name");
    By emailxpath = By.id("email");
    By phonexpath = By.id("phone");
    By addressxpath = By.id("textarea");
    By dropdowncountryxpath = By.id("country");
    By dropdowncolourxpath = By.id("colors");

    By opencartlinkxpath = By.xpath("//a[contains(text(), 'open cart')]");
    By orangeHRMxpath = By.xpath("//a[contains(text(), 'orange HRM')]");

    By webseachxpath = By.id("Wikipedia1_wikipedia-search-input");
    By seachbutton = By.xpath("//input[@type='submit']");
    By opennewpage = By.xpath("//button[contains(text(),'New Browser Window')]");

    By alertxpath = By.xpath("//button[contains(text(),'Alert')]");
    By confiemalertxpath = By.xpath("//button[contains(text(),'Confirm Box')]");
    By sendkeysalertbox = By.xpath("//button[contains(text(),'Prompt')]");

    By doubleclickxpath = By.xpath("//button[@ondblclick='myFunction1()']");

    By dragablexpath = By.id("draggable");
    By dropablexpath = By.id("droppable");

    By framchangepath = By.id("frame-one796456169");
    By frameuser = By.className("text_field");
    By framecalender = By.className("text_field calendar_field hasDatepicker");
    By framedrop = By.className("drop_down");

    By opencartlist = By.xpath("//li[contains(@class, 'nav-nav-item')]");

    By HRMpagexpath= By.xpath("//h5[contains(text(), '')]");


    public void username(String username) {
        sendkeys(usernamexpath, username);
    }

    public void email(String email) {
        sendkeys(emailxpath, email);
    }

    public void phonenumber(String phonenumber) {
        sendkeys(phonexpath, phonenumber);
    }

    public void address(String address) {
        sendkeys(addressxpath, address);
    }

    public void daysselect(String day) {
        click(By.id(day));
    }

    public void gender(String gender) {
        click(By.id(gender));
    }

    public void genderinfram(String gender1stCapital) {
        click(By.xpath("//label[contains(text(), '" + gender1stCapital + "')]"));
    }

    public void clickthecountrydrop() {
        click(dropdowncountryxpath);
    }

    public void selctthecountry(String country) {
        WebElement ele = driver.findElement(dropdowncountryxpath);
        Select select = new Select(ele);
        select.selectByVisibleText(country);

    }

    public void selectthecoloyur(String colour) {
        WebElement ele = driver.findElement(dropdowncolourxpath);
        Select select = new Select(ele);
        select.selectByVisibleText(colour);
    }

    public void opencart() {
        click(opencartlinkxpath);
    }

    public void verificationopencart(String input) {
        gettextList(opencartlist, input);
    }

    public void Hrmpage() {
        click(orangeHRMxpath);
    }

    public void verificationHRMpage(String input) {
       String s = gettext(HRMpagexpath,input);
    }
}
