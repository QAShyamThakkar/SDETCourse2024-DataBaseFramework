package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DigitalBank_HomePage extends BasePage {

    @FindBy(xpath = "//li[@class=\"active\"]")
    WebElement welcomeMsg;

    @FindBy(id = "transfer-menu-item")
    WebElement transferMenuItem;

    public void verifyUserOnHomePage() {
        Assert.assertTrue("Homepage is not displayed", welcomeMsg.isDisplayed());
    }

    public void userClickOnTransferBetweenAccount() {
        transferMenuItem.click();

    }
}
