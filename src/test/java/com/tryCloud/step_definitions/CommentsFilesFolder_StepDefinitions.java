package com.tryCloud.step_definitions;

import com.tryCloud.pages.DashboardPage;
import com.tryCloud.pages.FilesPage;
import com.tryCloud.pages.LoginPage;
import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class CommentsFilesFolder_StepDefinitions {
    // The users log in with valid credentials
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    FilesPage filesPage = new FilesPage();
    String textIs = "Im done for this project, what is next";
    public void the_users_log_in_with_valid_credentials() {
        Driver.getDriver().get("http://qa2.trycloud.net");
        loginPage.loginWithConfig();
    }

    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String file) {
        dashboardPage.filesModule.click();
    }

    @When("user click action-icon from any file on the page")
    public void user_click_action_icon_from_any_file_on_the_page() {
        filesPage.actionIcon.click();


    }

    @When("user choose the {string} option")
    public void user_choose_the_option(String Details) {
        BrowserUtils.sleep(2);
        filesPage.details.click();
    }

    @When("user write a comment inside the input box")
    public void user_write_a_comment_inside_the_input_box() {
       filesPage.commentsBox.click();
    }
    @When("user click the submit button to post it")
    public void user_click_the_submit_button_to_post_it() {
        filesPage.textBox.sendKeys(textIs+ Keys.ENTER);
    }

    @Then("Verify the comment is displayed in the comment section.")
    public void verify_the_comment_is_displayed_in_the_comment_section() {
        System.out.println("filesPage.verifyText.getText() = " + filesPage.verifyText.getText());
        Assert.assertTrue(textIs.equals(filesPage.verifyText.getText()));

    }

}
