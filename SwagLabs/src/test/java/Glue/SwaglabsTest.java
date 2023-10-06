package Glue;

import Pages.Swaglabspages;
import io.cucumber.java.af.Gegewe;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class SwaglabsTest {
    Swaglabspages swaglabs = new Swaglabspages(Hooks.driver);

    @Given("enter user {string}")
    public void enterUser(String username) {
        swaglabs.username(username);
    }

    @When("enter password {string}")
    public void enterPassword(String password) {
        swaglabs.password(password);
    }

    @And("click on login button")
    public void clickOnLoginButton() {
        swaglabs.clickloginbutton();
    }

    @Then("verify the user able to see the login page")
    public void verifyTheUserAbleToSeeTheLoginPage() {
        swaglabs.succesfullmsg();

    }

    @And("take screenshot {string}")
    public void takescreenshot(String filename) throws IOException {
        swaglabs.screenshot(filename);
    }

    @Then("verify user getting error message {string}")
    public void verifyUserGettingEoorMessage(String errormsg) {
        swaglabs.errormsg(errormsg);

    }
}
