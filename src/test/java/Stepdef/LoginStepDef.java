package Stepdef;

import Base.BaseClass;
import Pages.LoginPage;
import Utils.ConfigReader;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {

    LoginPage loginPage = new LoginPage();

    @Given("User launches application")
    public void userLaunchesApplication() {


        loginPage.login();


    }

    @When("User login with {string} and {string} credentials")
    public void userLoginWithAndCredentials(String username, String password) {

    loginPage.enterUserName(username);
    loginPage.password(password);

    }

    @Then("Verify user login successfully")
    public void verifyUserLoginSuccessfully() {


    }
}
