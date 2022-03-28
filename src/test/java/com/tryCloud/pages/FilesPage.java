package com.tryCloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FilesPage extends BasePage{

    @FindBy(css = "button[class='settings-button']")
    public WebElement settingsBtn;

    @FindBy(css= "div[id='files-app-extra-settings']")
    public List<WebElement> checkBoxes;

}
