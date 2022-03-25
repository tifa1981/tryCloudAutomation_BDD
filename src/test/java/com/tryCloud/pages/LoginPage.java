package com.tryCloud.pages;

import com.tryCloud.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//input[@name='user']")
    public WebElement inputUsername;

    @FindBy(id = "password")
    public WebElement inputPassword;

    @FindBy(id="submit-form")
    public WebElement loginButton;

    @FindBy(css = "p[class='warning wrongPasswordMsg']")
    public WebElement errorMsg;

    public void loginWithConfig(){
        inputUsername.sendKeys(ConfigurationReader.getProperty("username1"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton.click();
    }
}