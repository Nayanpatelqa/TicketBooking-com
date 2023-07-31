package com.ticketBooking.page;

import com.ticketBooking.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CheckoutPaxPage extends Utility {
    private static final Logger log = LogManager.getLogger(CheckoutPaxPage.class.getName());

    public CheckoutPaxPage() {
        PageFactory.initElements(driver, this);

    }

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"basiclayout\"]/div/div[2]/div/div[2]/div[1]/div/h2")
    WebElement titletext;


    public String pageTitle() {
        String message = getTextFromElement(titletext);
        log.info("get Page title text " + titletext.toString());
        return message;
    }

    @CacheLookup
    @FindBy(xpath = "//input[@type=\"email\"]")
    WebElement mailId;

    public void enterEmailId(String mid) {
        sendTextToElement(mailId, mid);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@type=\"tel\"]")
    WebElement pNo;

    public void enterPhoneNumber(String no) {
        sendTextToElement(pNo, no);


    }

    @CacheLookup
    @FindBy(xpath = "//input[@name=\"passengers.0.firstName\"]")
    WebElement fNam;

    public void enterFirstName(String nameF) {
        sendTextToElement(fNam, nameF);


    }

    @CacheLookup
    @FindBy(xpath = "//input[@name=\"passengers.0.lastName\"]")
    WebElement lNam;

    public void enterLastName(String nameL) {
        sendTextToElement(lNam, nameL);

    }

    @CacheLookup
    @FindBy(name = "passengers.0.gender")
    WebElement gender;

    public void selectGender(String gnd) {
        selectByVisibleTextFromDropDown(gender, gnd);

    }

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"basiclayout\"]/div/div[2]/div/div[2]/div[3]/div[1]/div/div/div[2]/button")
    WebElement next;

    public void clickonNextButton() {
        clickOnElement(next);
    }


}
