package glue_test;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RockybhaiPage;

import java.text.ParseException;

public class RockybhaiTest {

    RockybhaiPage Rocky = new RockybhaiPage(Hooks.driver);


    @Given("enter username {string}")
    public void enterUsername(String username) {
        Rocky.username(username);

    }

    @When("enter email {string}")
    public void enterEmail(String email) {
        Rocky.email(email);
    }

    @And("enter phone number {string}")
    public void enterPhonenumber(String phonenumber) {
        Rocky.phonenumber(phonenumber);
    }

    @Then("enter address {string}")
    public void enterAddress(String address) {
        Rocky.address(address);
    }

    @And("take screenshot {string}")
    public void takeScreenshot(String filename) throws Exception {
        Rocky.screenshot(filename);
    }

    @Given("click the Gender radiobutton {string}")
    public void clickTheGenderRadiobutton(String gender) {
        Rocky.gender(gender);
    }

    @And("click the days checkbox {string}")
    public void clickTheDaysCheckbox(String day) {
        Rocky.daysselect(day);
    }

    @Given("click the country dropdown")
    public void clickTheCountryDropdown() {
        Rocky.clickthecountrydrop();
    }

    @And("Select the country {string}")
    public void selectTheCountry(String country) {
        Rocky.selctthecountry(country);
    }

    @Then("select the colour {string}")
    public void selectTheColour(String colour) {
        Rocky.selectthecoloyur(colour);
    }


    @Given("click the opencart link")
    public void clickTheOpencartLink() {
        Rocky.opencart();
    }

    @And("verify user able to see the page {string}")
    public void verifyUserAbleToSeeThePage(String input) {
        Rocky.verificationopencart(input);
    }

    @Then("click on open hrm page link")
    public void clickOnOpenHrmPageLink() {
        Rocky.Hrmpage();
    }

    @And("verify user able to see the login page of hrm {string}")
    public void verifyUserAbleToSeeTheLoginPageOfHrm(String input) {
        Rocky.verificationHRMpage(input);

    }

    @Given("Enter the data into browser {string}")
    public void enterTheDataIntoBrowser(String data) {
        Rocky.browser(data);

    }

    @And("click the searchbutton")
    public void clickTheSearchbutton() {
        Rocky.browsersearch();
    }

    @Then("verify the browser display the elements {string}")
    public void verifyTheBrowserDisplayTheElements(String data) {
        Rocky.verifytheelements(data);
    }

    @Given("click the alert-one")
    public void clickTheAlertOne() {
        Rocky.clickthealertone();
    }

    @And("click the alert accept")
    public void clickTheAlertAccept() {
        Rocky.alertaccept();
    }

    @When("click the alert-two-Confirmbox")
    public void clickTheAlertTwoConfirmbox() {
        Rocky.clickthealertTwo();
    }

    @And("click the alert dismiss")
    public void clickTheAlertDismiss() {
        Rocky.alertdismiss();
    }

    @Then("cleck the alert-three Prompt")
    public void cleckTheAlertThreePrompt() {
        Rocky.alertPromptthree();
    }

    @And("pass the sendkeys {string} and click the accept")
    public void passTheSendkeysAndClickTheAccept(String data) {
        Rocky.passthedatatoalert(data);
    }

    @And("verify the msg {string}")
    public void verifyTheMsg(String msg) {
        Rocky.verifythemsg(msg);
    }

    @Given("double click the copy button")
    public void doubleClickTheCopyButton() {
        Rocky.copyandpastethetext();
    }

    @When("drag and drop the elements")
    public void dragAndDropTheElements() {
        Rocky.draganddropthelements();
    }

    @Then("move the slider button to some length {int} {int}")
    public void moveTheSliderButtonToSomeLength(int x, int y) {
        Rocky.slider(x, y);
    }

    @Then("resize the resizablebox {int} {int}")
    public void resizeTheResizablebox(int x, int y) {
        Rocky.slider(x, y);
    }

    @Given("enter the frame")
    public void enterTheFrame() {
        Rocky.enterintoframe();
    }

    @And("enter the username {string}")
    public void enterTheUsername(String username) {
        Rocky.entertheuser(username);
    }

    @When("select the gender {string}")
    public void selectTheGender(String gender) {
        Rocky.genderselectinframe(gender);
    }

    @Then("select the date {string}")
    public void selectTheDate(String date) {
        Rocky.selectdate(date);
    }

    @And("select the value from {string} dropdowm")
    public void selectTheValueFromDropdowm(String skill) {
        Rocky.dropdown(skill);
    }

    @Then("back out of the frame")
    public void backOutOfTheFrame() {
        Rocky.framebacktoparent();
    }

    @Given("click the calender")
    public void clickTheCalender() {
        Rocky.clickcalender();
    }

    @And("select the date {string} and {string} and {string}")
    public void selectTheDateAndAnd(String day, String month, String year) throws Exception {
        Rocky.selectdatefromcalender(day, month, year);
    }

    @And("click the frame calender")
    public void clickTheFrameCalender() {
        Rocky.framecalenderclick();
    }

    @Then("select the date {string} and {string} and {string} from framecal")
    public void selectTheDateAndAndFromFramecal(String day, String month, String year) throws Exception {
        Rocky.framecalenderselect(day, month, year);
    }
}
