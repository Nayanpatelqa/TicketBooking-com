package com.ticketBooking.page;

import com.ticketBooking.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FlightsPage extends Utility {
    private static final Logger log = LogManager.getLogger(FlightsPage.class.getName());

    public FlightsPage() {
        PageFactory.initElements(driver, this);

    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Compare and book flights with ease')]")
    WebElement pageTitle;

    public String getPageTitleText() {
        String message = getTextFromElement(pageTitle);
        log.info("Get pageTitle text " + pageTitle.toString());
        return message;
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/fieldset[1]/div[1]/div[2]/label[1]/span[2]")
    WebElement oneway;

    public void clickononeway() {
        clickOnElement(oneway);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
    WebElement from;

    public void clickonFromWhere() {
        clickOnElement(from);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[@id=':R12ra3b5:']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/span[2]/*[1]")
    WebElement clearfrom;

    public void clearfromfield() {
        clickOnElement(clearfrom);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[@id=':R12ra3b5:']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
    WebElement eLocation;

    public void enterLocationFrom(String from1) {
        sendTextToElement(eLocation, from1);
    }

    @CacheLookup
    @FindBy(xpath = "//ul[@class=\"css-1eonra\"]/li[2]")
    WebElement sFromLocation;

    public void selectLocationFrom() {
        clickOnElement(sFromLocation);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[3]")
    WebElement to;

    public void clickonToWhere() {
        clickOnElement(to);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[@id=':R16ra3b5:']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
    WebElement eLocationTo;

    public void enterLocationTo(String from1) {
        sendTextToElement(eLocationTo, from1);
    }

    @CacheLookup
    @FindBy(xpath = "//ul[@class=\"css-1eonra\"]/li[1]")
    WebElement sToLocation;

    public void selectLocationTo() {
        clickOnElement(sToLocation);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]")
    WebElement date;
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[2]/span[1]/span[1]/span[1]")
    WebElement selDate;

    public void selectDate() {
        clickOnElement(date);
        clickOnElement(selDate);
    }

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Search')]")
    WebElement searchbutton;

    public void clickonSearchbutton() {
        clickOnElement(searchbutton);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/select[1]")
    WebElement eClass;

    public void selectEconomyClass() {
        clickOnElement(eClass);
        clickOnElement(eClass);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/label[1]/span[2]")
    WebElement dFlight;

    public void clickonDirectFlightsOnly() {
        clickOnElement(dFlight);
    }

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"flight-card-0\"]/div/div/div[2]/div[2]/button")
    WebElement seeflight;

    public void clickonSeeFlight() {
        clickOnElement(seeflight);
    }

    @CacheLookup
    @FindBy(xpath = "/html/body/div[4]/div/div/div/div/div[2]/div[3]/div[2]/button")
    WebElement selectbutton;

    public void clickonselectButton() {
        clickOnElement(selectbutton);
    }

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"basiclayout\"]/div/div[2]/div/div[2]/div[3]/div/div/div[2]/button")
    WebElement next1;

    public void clickonNextButton1() {
        clickOnElement(next1);
    }

}



