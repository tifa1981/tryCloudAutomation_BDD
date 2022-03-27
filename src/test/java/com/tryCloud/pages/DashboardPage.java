package com.tryCloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{

    @FindBy(xpath = "//span[text()='Dashboard']")
    public WebElement dashboard;

    @FindBy(xpath="//span[.='Files']")
    public WebElement files ;

    @FindBy(xpath ="//span[.='Talk']")
    public WebElement talk;

    @FindBy(xpath="(//span[.='Contacts'])[1]")
    public WebElement contacts ;

    @FindBy(xpath ="//div[@class='header-menu unified-search header-menu--opened']")
    public WebElement serachIcon;

}
