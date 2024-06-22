package com.automation.pages;

import com.automation.utils.DriverUtils;
import com.automation.utils.PropertyReader;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    // Variables

    @FindBy(id = "user-name")
    WebElement userName;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "login-button")
    WebElement logInBtn;

    @FindBy(xpath = "//div[@class=\"header_label\"]")
    WebElement homePageLogo;

    // Constructor - Refer from Parent Constructor

       // Methods

    public void openWebsite() {
               driver.get(PropertyReader.getProperty("url"));
    }

    public void doLogin() {

        userName.sendKeys(PropertyReader.getProperty("userName"));
        password.sendKeys(PropertyReader.getProperty("password"));
        logInBtn.click();

    }

    public void verifyHomePage() {
        Assert.assertTrue("You are not on the homePage", homePageLogo.isDisplayed());

    }








}
