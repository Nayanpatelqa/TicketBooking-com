package com.ticketBooking.steps;

import com.ticketBooking.page.CheckoutPaxPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;

public class PaxPageStepDef {
    @And("^I am on Who's flying Page$")
    public void iAmOnWhoSFlyingPage() {
        new CheckoutPaxPage().pageTitle();
    }

    @And("^I enter Contact \"([^\"]*)\"$")
    public void iEnterContact(String mail)  {
        new CheckoutPaxPage().enterEmailId(mail);

    }


    @And("^I enter Contact phone number \"([^\"]*)\"$")
    public void iEnterContactPhoneNumber(String number)  {
        new CheckoutPaxPage().enterPhoneNumber(number);


    }

    @And("^I enter  First Name\"([^\"]*)\"$")
    public void iEnterFirstName(String fName)  {
        new CheckoutPaxPage().enterFirstName(fName);


    }

    @And("^I enter  Last Name \"([^\"]*)\"$")
    public void iEnterLastName(String lName)  {
        new CheckoutPaxPage().enterLastName(lName);


    }

    @And("^I select \"([^\"]*)\"$")
    public void iSelect(String  gnder) {
        new CheckoutPaxPage().selectGender(gnder);

    }
    @And("^I click on Next button in pax Page$")
    public void iClickOnNextButtonInPaxPage() {
        new CheckoutPaxPage().clickonNextButton();
    }


}
