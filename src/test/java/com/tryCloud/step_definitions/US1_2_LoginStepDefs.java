package com.tryCloud.step_definitions;

import com.tryCloud.pages.LoginPage;
import com.tryCloud.utilities.ConfigurationReader;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class US1_2_LoginStepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("user on the login page")
    public void user_on_the_login_page() {
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);

    }
    @When("user enters username {string} and passcode {string}")
    public void user_enters_username_and_passcode(String username, String password) {
        loginPage.inputUsername.sendKeys(username);
        loginPage.inputPassword.sendKeys(password);


    }
    @When("user clicks the login button")
    public void user_clicks_the_login_button() {
        loginPage.loginButton.click();

    }
    @Then("user should be able to land on the dashboard page")
    public void user_should_be_able_to_land_on_the_dashboard_page() {
        String expectedName ="Dashboard - Trycloud QA";
        String actualName = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedName, actualName);
    }
    @When("user enters invalid username {string} and passcode {string}")
    public void user_enters_invalid_username_and_passcode(String invalidUsername, String invalidPassword ) {
        loginPage.inputUsername.sendKeys(invalidUsername);
        loginPage.inputPassword.sendKeys(invalidPassword);
    }
    @Then("user should be able to see {string} is displayed")
    public void user_should_be_able_to_see_is_displayed(String errorMessage) {

        Assert.assertTrue(loginPage.errorMsg.isDisplayed());
    }
}
