package com.tryCloud.step_definitions;

import com.tryCloud.pages.LoginPage;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Main_Modules_StepDefinitions {

    LoginPage loginPage = new LoginPage();

    @When("the users log in with valid credentials")
    public void the_users_log_in_with_valid_credentials() {
        Driver.getDriver().get("http://qa2.trycloud.net");
        loginPage.loginWithConfig();
    }

    @Then("Verify the user see the following modules")
    public void verify_the_user_see_the_following_modules(List<String> modules) {
        List<String> expectedList = new ArrayList<>();
        expectedList.addAll(modules);
        System.out.println("expectedList = " + expectedList);
          for (int i = 0; i <= 8; i++) {
              String tab = Driver.getDriver().findElement(By.xpath("(//ul[@id='appmenu'])/li[(" + (i + 1) + ")]/a")).getAttribute("aria-label");
              Assert.assertEquals(expectedList.get(i),tab);
         }

    }

}
