package com.tryCloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{

    @FindBy(xpath = "//span[.='Dashboard']")
    public WebElement dashboardModule;

    @FindBy(css="li[data-id='files']")
    public WebElement filesModule ;

    @FindBy(css ="li[data-id='spreed']")
    public WebElement talkModule;

    @FindBy(css="li[data-id='contacts']")
    public WebElement contactsModule ;

    @FindBy(xpath ="//div[@class='header-menu unified-search header-menu--opened']")
    public WebElement searchIcon;


}
