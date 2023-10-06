package Glue_test;

import Page.automationpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class automationTest {

    automationpage automationpage = new automationpage(Hooks.driver);


    @Given("enter username {string}")
    public void enterUsername(String username) {
        automationpage.username(username);

    }

    @When("enter email {string}")
    public void enterEmail(String email) {
        automationpage.email(email);
    }

    @And("enter phone number {string}")
    public void enterPhonenumber(String phonenumber) {
        automationpage.phonenumber(phonenumber);
    }

    @Then("enter address {string}")
    public void enterAddress(String address) {
        automationpage.address(address);
    }

    @And("take screenshot {string}")
    public void takeScreenshot(String filename) throws Exception {
        automationpage.screenshot(filename);
    }

    @Given("click the Gender radiobutton {string}")
    public void clickTheGenderRadiobutton(String gender) {
        automationpage.gender(gender);
    }

    @And("click the days checkbox {string}")
    public void clickTheDaysCheckbox(String day) {
        automationpage.daysselect(day);
    }

    @Given("click the country dropdown")
    public void clickTheCountryDropdown() {
        automationpage.clickthecountrydrop();
    }

    @And("Select the country {string}")
    public void selectTheCountry(String country) {
        automationpage.selctthecountry(country);
    }

    @Then("select the colour {string}")
    public void selectTheColour(String colour) {
        automationpage.selectthecoloyur(colour);
    }

    @Given("click the opencart link")
    public void clickTheOpencartLink() {
        automationpage.opencart();
    }

    @And("verify user able to see the page {string}")
    public void verifyUserAbleToSeeThePage(String input) {
        automationpage.verificationopencart(input);
    }

    @Then("click on open hrm page link")
    public void clickOnOpenHrmPageLink() {
        automationpage.Hrmpage();
    }

    @And("verify user able to see the login page of hrm {string}")
    public void verifyUserAbleToSeeTheLoginPageOfHrm(String input) {
        automationpage.verificationHRMpage(input);

    }
}
