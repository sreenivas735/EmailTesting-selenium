package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RockybhaiPage extends RockybhaiCommonmethods {
    WebDriver driver;

    public RockybhaiPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    By usernamexpath = By.id("name");
    By emailxpath = By.id("email");
    By phonexpath = By.id("phone");
    By addressxpath = By.id("textarea");

    By dropdowncountryxpath = By.id("country");
    By dropdowncolourxpath = By.id("colors");
    By opencartlist = By.xpath("//li[contains(@class, 'nav-nav-item')]");

    By HRMpagexpath = By.xpath("//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']");

    By opencartlinkxpath = By.xpath("//a[contains(text(), 'open cart')]");
    By orangeHRMxpath = By.xpath("//a[contains(text(), 'orange HRM')]");

    By browserxpath = By.id("Wikipedia1_wikipedia-search-input");

    By browsersearch = By.xpath("//input[@type='submit']");

    By browserlistxpath = By.id("wikipedia-search-result-link");

    By alert1xpath = By.xpath("//button[@onclick='myFunctionAlert()']");
    By alertconfirmbox = By.xpath("//button[@onclick='myFunctionConfirm()']");
    By alertPrompt = By.xpath("//button[@onclick='myFunctionPrompt()']");

    By alerttext = By.id("demo");

    By copytextxpath = By.xpath("//button[@ondblclick='myFunction1()']");

    By draggablexpath = By.id("draggable");
    By droppablexpath = By.id("droppable");

    By sliderxpath = By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']");

    By framexpath = By.id("frame-one796456169");

    By frameuser = By.name("RESULT_TextField-0");

    By framecalender = By.name("RESULT_TextField-2");

    By framedropdown = By.name("RESULT_RadioButton-3");

    By calender = By.id("datepicker");

    By framecalenderxpath = By.xpath("//span[@class='icon_calendar']");

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

    public void clickthecountrydrop() {
        click(dropdowncountryxpath);
    }

    public void selctthecountry(String country) {

        dropdownbyvisibletext(dropdowncountryxpath, country);

    }

    public void selectthecoloyur(String colour) {

        dropdownbyvisibletext(dropdowncolourxpath, colour);
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
        String s = gettext(HRMpagexpath, input);
    }

    public void browser(String data) {
        sendkeys(browserxpath, data);
    }

    public void browsersearch() {
        click(browsersearch);
    }

    public void verifytheelements(String data) {
        waitmethod(browserlistxpath);
        gettextList(browserlistxpath, data);
    }

    public void clickthealertone() {
        click(alert1xpath);
    }


    public void alertaccept() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void clickthealertTwo() {
        click(alertconfirmbox);
    }

    public void alertdismiss() {
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    public void alertPromptthree() {
        click(alertPrompt);
    }

    public void passthedatatoalert(String data) {
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(data);
        alert.accept();
    }

    public void verifythemsg(String msg) {
        gettext(alerttext, msg);
    }

    public void copyandpastethetext() {
        copyandpaste(copytextxpath);
    }

    public void draganddropthelements() {
        draganddrop(draggablexpath, droppablexpath);
    }

    public void slider(int x, int y) {
        slidebar(sliderxpath, x, y);
    }

    public void enterintoframe() {
        enterintofram(framexpath);
    }

    public void framebacktoparent() {
        driver.switchTo().parentFrame();
    }

    public void framebacktomain() {
        driver.switchTo().defaultContent();
    }

    public void entertheuser(String username) {
        sendkeys(frameuser, username);
    }

    public void genderselectinframe(String gender) {

        click(By.xpath("//label[contains(text(), '" + gender + "')]"));

    }

    public void selectdate(String date) {
        sendkeys(framecalender, date);
    }

    public void dropdown(String skill) {
        dropdownbyvisibletext(framedropdown, skill);
    }

    public void clickcalender() {
        click(calender);
    }

    public void selectdatefromcalender(String day, String month, String year) throws Exception {
        calenderselect(day, month, year);

    }

    public void framecalenderclick() {
        click(framecalenderxpath);
    }

    public void framecalenderselect(String day, String month, String year) throws Exception {

        WebElement dropyear = driver.findElement(By.xpath("//select[@data-handler='selectYear']"));

        framecalender(dropyear,day,month,year);

    }

}
