package com.automation.pages;

import com.automation.utils.PropertyReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DigitalBank_LoginPage extends BasePage{
    @FindBy(id="username")
    WebElement userNameInput;

    @FindBy(id="password")
    WebElement passwordInput;

    @FindBy(id="submit")
    WebElement signInBtn;

    public void userOpenWebsite() {
        driver.get(PropertyReader.getProperty("DigitalBank.url"));
    }

    public void userEnterValidCred(String userName, String password) {
    userNameInput.sendKeys(PropertyReader.getProperty(userName));
    passwordInput.sendKeys(PropertyReader.getProperty(password));
    }

    public void clickOnSubmitBtn() {
        signInBtn.click();
    }
}
