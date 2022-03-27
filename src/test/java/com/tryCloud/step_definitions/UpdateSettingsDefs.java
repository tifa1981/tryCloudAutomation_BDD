package com.tryCloud.step_definitions;

import com.tryCloud.pages.DashboardPage;
import com.tryCloud.pages.FilesPage;
import com.tryCloud.pages.LoginPage;
import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.ConfigurationReader;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class UpdateSettingsDefs {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboard = new DashboardPage();
    FilesPage files = new FilesPage();

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);
        loginPage.loginWithConfig();
        //dashboard.dashboardModule.click();

    }
    @When("the user clicks the Files module")
    public void the_User_Clicks_The_Files_Module() {
       // BrowserUtils.waitFor(15);
        BrowserUtils.waitForPresenceOfElement(By.xpath("//li[@data-id='files']"),5);
        dashboard.filesModule.click();
    }

    @When("user clicks Settings on the left bottom corner")
    public void user_clicks_settings_on_the_left_bottom_corner() {
        BrowserUtils.waitFor(5);
       //BrowserUtils.waitForPresenceOfElement(By.xpath("//button[@class='settings-button']"),15);
       files.settingsBtn.click();
    }
    @Then("the user should be able to click any buttons")
    public void the_user_should_be_able_to_click_any_buttons() {
        BrowserUtils.waitFor(5);
        List<WebElement> allCheckboxes =
                Driver.getDriver().findElements(By.xpath("//div[@id='app-settings-content']//label"));
        allCheckboxes.remove(3);
        //allCheckboxes.add(Driver.getDriver().findElement(By.id("showhiddenfilesToggle")));
        System.out.println("allCheckboxes.size() = " + allCheckboxes.size());

        for (WebElement eachCheckbox : allCheckboxes) {
            if (!eachCheckbox.isSelected()) {

              BrowserUtils.waitFor(2);
                eachCheckbox.click();

           }
           Assert.assertTrue(eachCheckbox.isSelected());
        }

    }
}
