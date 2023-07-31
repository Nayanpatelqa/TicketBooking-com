package com.ticketBooking.page;

import com.ticketBooking.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CheckoutExtrasPage extends Utility {
    private static final Logger log = LogManager.getLogger(CheckoutExtrasPage.class.getName());

    public CheckoutExtrasPage() {
        PageFactory.initElements(driver, this);

    }

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"basiclayout\"]/div/div[2]/div/div[2]/div[2]/div[1]/div/div/div/div[2]/button")
    WebElement next;

    public void clickonNextButton() {
        clickOnElement(next);
    }
}
