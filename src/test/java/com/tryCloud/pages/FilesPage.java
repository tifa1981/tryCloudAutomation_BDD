package com.tryCloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FilesPage extends BasePage{

    @FindBy(css = "button[class='settings-button']")
    public WebElement settingsBtn;

    @FindBy(xpath = "//div[@id='app-settings-content']//label")
    public List<WebElement> checkBoxes;

    @FindBy(xpath = "(//p[text()])[1]")
    public WebElement numberOfUsage;

    @FindBy(css = "span[class='icon icon-add']")
    public WebElement icon_add;

    @FindBy(xpath = "(//span[@class='displayname'])[1]")
    public WebElement uploadFileBtn2;

    @FindBy(xpath = "//span[@class='svg icon icon-upload']")
    public WebElement uploadFileBtn;

    @FindBy(xpath = "(//span[@class='icon icon-more'])[3]")
    public WebElement actionIcon;

    @FindBy(xpath = "//a[@class='menuitem action action-details permanent']/span[2]")
    public WebElement details;
//*[@id="fileList"]/tr[1]/td[2]/div/ul/li[4]/a/span[2]
    @FindBy(xpath = "//a[@id='commentsTabView']")
    public WebElement commentsBox;

    @FindBy(xpath = "//div[@class='message']")
    public WebElement textBox;

    @FindBy(xpath = "(//div[@class='message'])[2]")
    public WebElement verifyText;




}
