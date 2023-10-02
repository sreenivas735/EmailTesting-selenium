package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;



public class loginpage {
    @Given("open browser and launch url")
    public void openBrowserAndLaunchUrl() {

        System.out.println("open browser");
    }

    @When("login user {string} and passwd {string}")
    public void loginUserAndPasswd(String name, String pass) {
        System.out.println("login user " + name + " " + pass);
    }
}

class exception {
    public static void main(String[] args) throws ArithmeticException {
        meth(10, 3);
    }

    public static void meth(int a, int b) throws ArithmeticException {
        int s = a / b;
        System.out.println(s / 0);

    }

}
