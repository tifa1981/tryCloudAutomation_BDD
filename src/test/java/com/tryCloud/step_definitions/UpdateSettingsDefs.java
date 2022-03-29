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
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
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


    }
    @When("user clicks the Files module")
    public void user_clicks_the_files_module() {
         BrowserUtils.waitForPresenceOfElement(By.xpath("//li[@data-id='files']"), 5);


    @When("the user clicks the Files module")
    public void the_User_Clicks_The_Files_Module() {
        // BrowserUtils.waitFor(15);
        BrowserUtils.waitForPresenceOfElement(By.xpath("//li[@data-id='files']"), 5);

        dashboard.filesModule.click();
    }


    @When("user clicks Settings on the left bottom corner")
    public void user_clicks_settings_on_the_left_bottom_corner() {

        //BrowserUtils.waitFor(5);
        files.settingsBtn.click();
    }
    @Then("user should be able to click any buttons")
    public void user_should_be_able_to_click_any_buttons() {
        //  WebElement checkBox =Driver.getDriver().findElement(By.xpath("(//div[@id='app-settings-content']//label)"));
        for (int i = 1; i <=3 ; i++) {
            WebElement checkBox = Driver.getDriver().findElement(By.xpath("(//div[@id='app-settings-content']//label)["+i+"]"));
            BrowserUtils.waitFor(5);
            checkBox.click();
            Assert.assertTrue(checkBox.isDisplayed());
        }
    }
    @When("user checks the current storage usage")
    public void user_checks_the_current_storage_usage() {

        System.out.println("Storage usage before upload = " + files.numberOfUsage.getText());


    }
    @When("user uploads file with the upload file option")
    public void user_uploads_file_with_the_upload_file_option() {
      // BrowserUtils.waitFor(2);
        files.icon_add.click();

       String path= "D:\\soft skills\\1.Interview Prep - SDLC & Agile & STLC - Google Docs.pdf";
       BrowserUtils.waitFor(3);

        files.uploadFileBtn.click();// Click on browse option on the webpage
        BrowserUtils.waitFor(2);// suspending execution for specified time period

        // creating object of Robot class
        Robot rb = null;
        try {
            rb = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }

        // copying File path to Clipboard
        StringSelection str = new StringSelection(path);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

        // press Contol+V for pasting
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);

        // release Contol+V for pasting
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);

        // for pressing and releasing Enter
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
        BrowserUtils.waitFor(3);
    }




    @When("user refreshes the page")
    public void user_refreshes_the_page() {
        Driver.getDriver().navigate().refresh();
        BrowserUtils.waitFor(3);

    }
    @Then("user should be able to see storage usage is increased")
    public void user_should_be_able_to_see_storage_usage_is_increased() {
        WebElement numberOfUsage2 = files.numberOfUsage;
        System.out.println("Storage usage after upload = " + numberOfUsage2.getText());
        double n1 = Double.parseDouble(files.numberOfUsage.getText().substring(0,3));
        double n2 = Double.parseDouble(numberOfUsage2.getText().substring(0,4));
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

        boolean b = n2 > n1;
        Assert.assertTrue(b);

    }

}

        BrowserUtils.waitFor(5);
        //BrowserUtils.waitForPresenceOfElement(By.xpath("//button[@class='settings-button']"),15);
        files.settingsBtn.click();
    }

    @Then("the user should be able to click any buttons")
    public void the_user_should_be_able_to_click_any_buttons() {
        //  WebElement checkBox =Driver.getDriver().findElement(By.xpath("(//div[@id='app-settings-content']//label)"));
         for (int i = 1; i <=3 ; i++) {
        WebElement checkBox = Driver.getDriver().findElement(By.xpath("(//div[@id='app-settings-content']//label)["+i+"]"));
        BrowserUtils.waitFor(5);
        checkBox.click();
        Assert.assertTrue(checkBox.isDisplayed());
          }

    }
}

