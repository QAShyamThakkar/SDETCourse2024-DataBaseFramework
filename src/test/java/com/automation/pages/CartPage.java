package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addToCartBtnFirstProduct;

    @FindBy(id = "shopping_cart_container")
    WebElement cartBtn;

    @FindBy(xpath = "//span[@class=\"title\"]")
    WebElement cartTitle;


    public void clickOnFirstProduct() {
        addToCartBtnFirstProduct.click();
    }

    public void clickOnCartbutton() {
        cartBtn.click();
    }

    public void verifyUserisonCartPage() {
        Assert.assertTrue("You are not on the Cart Page", cartTitle.isDisplayed());
    }


}
