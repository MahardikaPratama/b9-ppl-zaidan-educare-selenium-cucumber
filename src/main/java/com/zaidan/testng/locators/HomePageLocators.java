package com.zaidan.testng.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {

    @FindBy(xpath = "/html/body/div[2]/main/div/div[1]/div/div/div[1]/h1")
    public WebElement homePageUserName;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div[2]/div/div/div/div/ul/li[1]/a/span")
    public WebElement sidebarDasbor;

}