package Cucumber;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class instaloginpage {

    @Given("Open the browser and click the url")
    public void openTheBrowserAndClickTheUrl() {
        System.out.println("browser is opened");
    }

    @When("Enter username {string}and password {string}")
    public void enterUsernameAndPassword(String username, String password) {

        System.out.println("user: "+username);
        System.out.println("pass: "+password);
    }

//    @And("Click the submit button")
//    public void clickTheSubmitButton() {
//        System.out.println("click the submit button");
//    }

    @Then("Verify the homepage is visible to the user")
    public void verifyTheHomepageIsVisibleToTheUser() {
        System.out.println("verify the homepage is visible");
    }

    @And("verify the username {string} is visible in the homepage")
    public void verifyTheUsernameIsVisibleInTheHomepage(DataTable dt) {

        System.out.println("username : "+dt+" is visible n the homepage");
    }

    @And("Click the submit button")
    public void clickTheSubmitButton() {
    }
}
