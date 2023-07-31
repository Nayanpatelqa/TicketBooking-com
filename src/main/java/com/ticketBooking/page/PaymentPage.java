package com.ticketBooking.page;

import com.ticketBooking.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage extends Utility {
    private static final Logger log = LogManager.getLogger(PaymentPage.class.getName());

    public PaymentPage() {
        PageFactory.initElements(driver, this);

    }

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Check and pay')]")
    WebElement pageTitle;

    public String getPageTitleText() {
        String message = getTextFromElement(pageTitle);
        log.info("Get pageTitle text " + pageTitle.toString());
        return message;
    }

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"pc-card-number-field-576c25a4\"]")
    WebElement cardNumber;

    public void enterCardNumber(String cnumber) {
        sendTextToElement(cardNumber, cnumber);
    }
}
