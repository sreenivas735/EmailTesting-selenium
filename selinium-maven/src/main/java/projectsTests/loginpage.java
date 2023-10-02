package projectsTests;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.text.ParseException;

public class loginpage {
    WebDriver driver;

    loginpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "name")
    private WebElement username;
    @FindBy(id = "email")
    private WebElement useremail;
    @FindBy(id = "phone")
    private WebElement userphone;
    @FindBy(id = "textarea")
    private WebElement address;
    @FindBy(xpath = "//span[@class='icon_calendar']")
    private WebElement calenderinfram;
    @FindBy(xpath = "//select[@data-handler='selectYear']")
    private WebElement yearselctioninframecal;
    @FindBy(id = "datepicker")
    private WebElement maincalender;

    @FindBy(id = "male")
    private WebElement gendermalesel;

    @FindBy(id = "female")
    private WebElement genderfemalesel;

    @FindBy(id = "sunday")
    private WebElement sunday;
    @FindBy(id = "friday")
    private WebElement friday;
    @FindBy(id = "tuesday")
    private WebElement tuesday;

    @FindBy(id = "country")
    private WebElement countrydropdown;

    @FindBy(id = "colors")
    private WebElement colourdropdown;
    @FindBy(id = "Wikipedia1_wikipedia-search-input")
    private WebElement searchbrowser;

    @FindBy(xpath = "//button[@onclick='myFunctionPrompt()']")
    private WebElement alertPrompt;

    @FindBy(xpath = "//button[@onclick='myFunctionConfirm()']")
    private WebElement alertConfirmbox;

    @FindBy(xpath = "//button[@onclick='myFunctionAlert()']")
    private WebElement alert;


    @FindBy(xpath = "//div[@id='draggable']")
    private WebElement draggable;

    @FindBy(xpath = "//div[@id='droppable']")
    private WebElement droppable;

    @FindBy(xpath = "//button[@ondblclick='myFunction1()']")
    private WebElement copypastethetext;

    @FindBy(id = "frame-one796456169")
    private WebElement changeframe;

    @FindBy(id = "RESULT_TextField-0")
    private WebElement usernameinfram;


    @FindBy(id = "RESULT_RadioButton-3")
    private WebElement jobselectin;

    @FindBy(id = "RESULT_TextField-2")
    private WebElement writedatemanually;


    public void userdetails(String name, String mail, String phone, String adress) {

        username.sendKeys(name);

        useremail.sendKeys(mail);

        userphone.sendKeys(phone);

        address.sendKeys(adress);

    }

    public void calenderinmain(String year, String month, String date) throws InterruptedException, GivenVauleisoutofthemonth, ParseException {
        SelectCalender calenders = new SelectCalender(driver);
        maincalender.click();
        Thread.sleep(3000);
        calenders.calenderselect(date, month, year);

    }


    // male or female

    public void gender(String gender) {
        driver.findElement(By.id(gender)).click();
    }

    public void dayselectcheckbox(String day) {

        driver.findElement(By.id(day)).click();
    }

    public void countryselect(String country) {
        WebElement Country = countrydropdown;
        Country.click();
        Select dropcountry = new Select(Country);
        dropcountry.selectByVisibleText(country);

    }

    public void colourselect(String colour) {
        WebElement Colors = colourdropdown;
        Select dropcolors = new Select(Colors);
        dropcolors.selectByVisibleText(colour);
    }
//        WebElement colors = driver.findElement(By.id("colors"));
//        Select dropcolors = new Select(colors);
//        dropcolors.selectByVisibleText("Blue");

    public void tabledataviewingslidebyslide(int slidenum, int selectvalue) throws InterruptedException {
        driver.findElement(By.xpath("(//a[contains(text(), '" + slidenum + "')])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//table[@id='productTable']//input)[" + selectvalue + "]")).click();

    }

    public void browsingthedata(String searchdata) {
        searchbrowser.sendKeys(searchdata + Keys.ENTER);

    }

    public void alerts(String enterdateinalert) throws InterruptedException {
//        alert-1
        Thread.sleep(2000);
        alert.click();
        Alert art = driver.switchTo().alert();
        art.accept();

//        alert-2
        Thread.sleep(2000);
        alertConfirmbox.click();
        Alert artt = art;
        artt.dismiss();


//        alert-3
        Thread.sleep(2000);
        alertPrompt.click();
        Alert arttt = art;
        arttt.sendKeys(enterdateinalert);
        arttt.accept();
    }

    public void draganddropthetext() {
        Actions act = new Actions(driver);

        WebElement drag = draggable;
        WebElement drop = droppable;
        act.dragAndDrop(drag, drop).build().perform();
    }

    public void copypastethetext() {
        Actions act = new Actions(driver);

        WebElement doubleclick = copypastethetext;
        act.doubleClick(doubleclick).build().perform();
    }


    public void calenderinframe(String year, String month, String date) throws ParseException, InterruptedException, GivenVauleisoutofthemonth {
        WebElement frame = changeframe;
        driver.switchTo().frame(frame);

        calenderinfram.click();
        SelectCalender calenders = new SelectCalender(driver);
        calenders.foranothercalinframe(yearselctioninframecal, year, month, date);
        driver.switchTo().defaultContent();
    }

    public void usernameinframe(String username) {
        WebElement frame = changeframe;
        driver.switchTo().frame(frame);

        WebElement user = usernameinfram;
        user.sendKeys(username);
        driver.switchTo().defaultContent();
    }

    public void genderselectinframe(String genderFirstletterCapital) {
        WebElement frame = changeframe;
        driver.switchTo().frame(frame);

        driver.findElement(By.xpath("//label[contains(text(), '" + genderFirstletterCapital + "')]")).click();

        driver.switchTo().defaultContent();
    }

    public void jobinframe(String Skill) {
        WebElement frame = changeframe;
        driver.switchTo().frame(frame);


        WebElement skill = jobselectin;
        Select dropSkill = new Select(skill);
        dropSkill.selectByVisibleText(Skill);
        driver.switchTo().defaultContent();

    }

    public void calenderwritedatemanuallyinframe(String date) {
        WebElement frame = changeframe;
        driver.switchTo().frame(frame);

        WebElement framecal = writedatemanually;
        framecal.sendKeys(date);
        driver.switchTo().defaultContent();
    }

}



