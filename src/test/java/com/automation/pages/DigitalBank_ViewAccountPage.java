package com.automation.pages;

import com.automation.utils.DataBaseUtils;
import com.automation.utils.PropertyReader;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.ObjectInputFilter;
import java.sql.ResultSet;

public class DigitalBank_ViewAccountPage extends BasePage{

    @FindBy(id="page-title")
    WebElement viewAccountPageTitle;

    @FindBy(xpath="//tbody/tr[1]/td[4]")
    WebElement actualAmountWebElement;

    @FindBy(xpath="//tbody/tr[1]/td[3]")
    WebElement descriptionFromUIWebElement;

    public void verifyUserIsOnViewAccountsPage() {
        Assert.assertTrue("ViewAccountPage is not displayed", viewAccountPageTitle.isDisplayed());

    }

    public void verifyTransactionHistory() {
        String expectedAmount = PropertyReader.getProperty("transfer.amount");
        String actualAmount = actualAmountWebElement.getText().replace("$","").replace(".00","");
        Assert.assertEquals("Amount mismatch on the UI", expectedAmount, actualAmount);

        System.out.println("=============UI Testing============");
        System.out.println("expectedAmount====" + expectedAmount);
        System.out.println("actualAmount====" + actualAmount);
    }

    public void verifyDetailsInDatabase() {

        try {

            String transactionNumber = descriptionFromUIWebElement.getText().split("-")[0].replace(" (TRN) ","");

            String query = "SELECT amount from digitalbank.account_transaction where transaction_number = '"+transactionNumber +"';";
            ResultSet rs = DataBaseUtils.executeQuery(query);
            rs.next();

            String expectedAmount = PropertyReader.getProperty("transfer.amount");
            String actualAmount = rs.getString("amount").replace(".00","");

            System.out.println("=============Database Testing============");
            System.out.println("expectedAmount====" + expectedAmount);
            System.out.println("actualAmount====" + actualAmount);

            Assert.assertEquals("Amount mismatch on the DataBase", expectedAmount, actualAmount);


        }catch (Exception e){
            e.printStackTrace();
        }



    }
}
