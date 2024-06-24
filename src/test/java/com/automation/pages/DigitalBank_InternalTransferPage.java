package com.automation.pages;

import com.automation.utils.PropertyReader;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DigitalBank_InternalTransferPage extends BasePage{

    @FindBy(xpath = "//strong[@class=\"card-title text-white\"]")
    WebElement internalTransferPageHeader;

    @FindBy(id = "fromAccount")
    WebElement fromAccountDropdown;

    @FindBy(id = "toAccount")
    WebElement toAccountDropdown;

    @FindBy(id = "amount")
    WebElement amountInput;

    @FindBy(xpath = "//button[@class=\"btn btn-primary btn-sm\"]")
    WebElement submitBtn;

    public void verifyUserIsOnInternalTransferPage() {
        Assert.assertTrue("InternalTransferPage is not displayed", internalTransferPageHeader.isDisplayed());
    }

    public void userSelectFromAccount(String fromAccount) {
        Select select = new Select(fromAccountDropdown);
        select.selectByVisibleText(PropertyReader.getProperty(fromAccount));
    }

    public void userSelectToAccount(String toAccount) {
        Select select = new Select(toAccountDropdown);
        select.selectByVisibleText(PropertyReader.getProperty(toAccount));
    }

    public void enterAmount(String amount) {
        amountInput.sendKeys(PropertyReader.getProperty(amount));
    }

    public void userClickOnSubmit() {
        submitBtn.click();
    }
}
