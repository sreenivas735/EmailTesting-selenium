package glue_test;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Githubloginpage;

import java.io.IOException;

public class GithubLoginTests {

    Githubloginpage githubloginpage = new Githubloginpage(hooks.driver);
//
//    public EmailLoginTests() {
//        emailloginpage = new Emailloginpage(hooks.driver);
//    }

    @Given("enter valid username {string}")
    public void enterValidUsername(String username) {
        githubloginpage.username(username);
    }

    @And("enter valid password {string}")
    public void enterValidPassword(String password) {
        githubloginpage.password(password);
    }

    @When("click the login button")
    public void clickTheLoginButton() {
        githubloginpage.clickbutton();
    }

    @And("verify the user interface is visible")
    public void verifyTheUserInterfaceIsVisible() {
        githubloginpage.userloginsuccessfull();
    }




    @And("verify the user is getting error msg {string}")
    public void verifyTheUserIsGettingErrorMsg(String errormsg) {
        githubloginpage.errormassage(errormsg);
    }

    @Then("takescreenshot name is {string}")
    public void takescreenshotNameIs(String filename) throws IOException {
        githubloginpage.waitmethod();
        githubloginpage.screenshot(filename);

    }
}
