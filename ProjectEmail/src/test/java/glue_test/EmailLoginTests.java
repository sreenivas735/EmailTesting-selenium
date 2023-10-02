package glue_test;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.Emailloginpage;

import javax.annotation.processing.Generated;
import java.io.IOException;

public class EmailLoginTests {

    Emailloginpage emailloginpage= new Emailloginpage(hooks.driver);
//
//    public EmailLoginTests() {
//        emailloginpage = new Emailloginpage(hooks.driver);
//    }

    @Given("enter valid username {string}")
    public void enterValidUsername(String username) {
        emailloginpage.username(username);
    }

    @And("enter valid password {string}")
    public void enterValidPassword(String password) {
        emailloginpage.password(password);
    }

    @When("click the login button")
    public void clickTheLoginButton() {
        emailloginpage.clickbutton();
    }

    @And("verify the user interface is visible")
    public void verifyTheUserInterfaceIsVisible() {
        emailloginpage.userloginsuccessfull();
    }




    @And("verify the user is getting error msg {string}")
    public void verifyTheUserIsGettingErrorMsg(String errormsg) {
        emailloginpage.errormassage(errormsg);
    }

    @Then("takescreenshot name is {string}")
    public void takescreenshotNameIs(String filename) throws IOException {
        emailloginpage.waitmethod();
        emailloginpage.screenshot(filename);

    }
}
