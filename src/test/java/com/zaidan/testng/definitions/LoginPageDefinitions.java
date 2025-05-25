package com.zaidan.testng.definitions;

import org.testng.Assert;
import com.zaidan.testng.actions.HomePageActions;
import com.zaidan.testng.actions.LoginPageActions;
import com.zaidan.testng.utils.HelperClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageDefinitions {

    LoginPageActions objLogin = new LoginPageActions();
    HomePageActions objHomePage = new HomePageActions();

    @Given("User is on HRMLogin page {string}")
    public void loginTest(String url) {

        HelperClass.openPage(url);

    }

    @When("User enters username as {string} and password as {string}")
    public void goToHomePage(String userName, String passWord) {

        // login to application
        objLogin.login(userName, passWord);

        // go the next page

    }

    @Then("User should be able to login successfully and new page open")
    public void verifyLogin() {

        // Verify home page
        Assert.assertTrue(objHomePage.getHomePageText().contains("Dashboard"));

    }

    @Then("User should be able to see error message {string}")
    public void verifyErrorMessage(String expectedErrorMessage) {

        // Verify home page
        Assert.assertEquals(objLogin.getErrorMessage(), expectedErrorMessage);

    }

}