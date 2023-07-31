package com.ticketBooking.page;

import com.ticketBooking.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CheckoutSeatPage extends Utility {
    private static final Logger log = LogManager.getLogger(CheckoutSeatPage.class.getName());

    public CheckoutSeatPage() {
        PageFactory.initElements(driver, this);

    }

    @CacheLookup
    @FindBy(xpath = "//div[@data-testid=\"checkout_seat_map_controller_expand_seats_0\"]/div[2]/div[1]")
    WebElement seatfrom1;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[8]/button[1]/div[1]")
    WebElement selctseat;


    public void clickonSelectaseatfrom1() {
        clickOnElement(seatfrom1);
        clickOnElement(selctseat);
    }

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"basiclayout\"]/div/div[2]/div/div[2]/div[2]/div/div/div[1]/div/div/div[2]/div[1]/button/div/div/div[2]/div/div/div/span/span")
    WebElement vSeatNo;


    public String verifySeatNo() {
        String message = getTextFromElement(vSeatNo);
        log.info("get Seat No " + vSeatNo.toString());
        return message;
    }

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"basiclayout\"]/div/div[2]/div/div[2]/div[4]/div/div/div[2]/button")
    WebElement next;

    public void clickonNextButton() {
        clickOnElement(next);
    }


}
