package com.ticketBooking.page;

import com.ticketBooking.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.print.attribute.standard.Destination;
import java.util.List;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);

    }

    @CacheLookup
    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    WebElement cookies;

    @CacheLookup
    @FindBy(xpath = "//header/nav[2]/div[1]/ul[1]/li")
    List<WebElement> menu;

    public void clickonAcceptandClose() {
        clickOnElement(cookies);
    }

    public void clickonHeaderMenu(String hMenu) {
        for (WebElement topMenu : menu) {
            if (topMenu.getText().equalsIgnoreCase(hMenu)) {
                topMenu.click();
                break;
            }
        }
    }


}
