package com.zaidan.testng.definitions;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import com.zaidan.testng.actions.HomePageActions;
import com.zaidan.testng.actions.LoginPageActions;
import com.zaidan.testng.utils.HelperClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageDefinitions {

    LoginPageActions objLogin = new LoginPageActions();
    HomePageActions objHomePage = new HomePageActions();

    @Given("User has opened the browser")
    public void user_has_opened_the_browser() {
        HelperClass.setUpDriver();
    }

    @And("User has navigated to the login page of Education Fund Payment Management System for Zaidan Educare School app {string}")
    public void user_has_navigated_to_login_page(String url) {
        HelperClass.openPage(url);
    }

    @When("User enters username as {string} and password as {string}")
    public void goToHomePage(String userName, String passWord) {

        // login to application
        objLogin.login(userName, passWord);

        // go the next page

    }

    @And("User clicks on the login button")
    public void clickLoginButton() {

        // Click Login button
        objLogin.clickedLoginButton();

    }

    @Then("User is navigated to the dashboard page")
    public void user_is_navigated_to_dashboard() {
        Assert.assertTrue(objHomePage.getHomePageText().contains("Dasbor - Bendahara"));
    }

    @And("User should be able to see navigation bar for bendahara")
    public void user_should_see_all_sidebar_items() {
        List<String> expectedItems = Arrays.asList(
            "Dasbor",
            "Tagihan Siswa",
            "Transaksi Penerimaan Dana",
            "Pengaturan Notifikasi",
            "Status Pembayaran",
            "Rekapitulasi",
            "Progres Transaksi Penerima Dana"
        );
        List<String> actualItems = objHomePage.getSidebarItems();
        Assert.assertEquals(actualItems, expectedItems, "Sidebar items do not match!");
    }

    @Then("User should be able to see {string} notification message")
    public void verifyErrorMessage(String expectedErrorMessage) {

        // Verify home page
        Assert.assertEquals(objLogin.getErrorMessage(), expectedErrorMessage);

    }

}