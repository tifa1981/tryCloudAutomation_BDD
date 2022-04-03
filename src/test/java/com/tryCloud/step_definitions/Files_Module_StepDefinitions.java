package com.tryCloud.step_definitions;

import com.tryCloud.pages.DashboardPage;
import com.tryCloud.pages.FilesPage;
import com.tryCloud.pages.LoginPage;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Files_Module_StepDefinitions {

    FilesPage filesPage = new FilesPage();

    @Then("verify the page is {string}")
    public void verify_the_page_is(String string) {
        Assert.assertTrue(string.equals(Driver.getDriver().getTitle()));
        Driver.closeDriver();
    }

    @When("user click the top-left checkbox of the table")
    public void user_click_the_top_left_checkbox_of_the_table() {
        filesPage.checkBox.click();

    }

    @Then("verify all the files are selected")
    public void verify_all_the_files_are_selected() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 2);
        wait.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath("(//a[@class='name sort columntitle']/span[text()='Name'])[1]"), "Name"));

        String file = Driver.getDriver().findElement(By.xpath("(//a[@class='name sort columntitle'])/span")).getText();
        System.out.println("file.getText() = " + file);
        Assert.assertTrue("no file or files arr uploaded", file.contains("file"));


    }


}





