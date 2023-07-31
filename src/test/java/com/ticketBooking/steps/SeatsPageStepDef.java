package com.ticketBooking.steps;

import com.ticketBooking.page.CheckoutSeatPage;
import cucumber.api.java.en.And;

public class SeatsPageStepDef {
    @And("^I select a seat from$")
    public void iSelectASeatFrom() {
        new CheckoutSeatPage().clickonSelectaseatfrom1();
    }


    @And("^I Verify seat No$")
    public void iVerifySeatNo() {
        new CheckoutSeatPage().verifySeatNo();

    }

    @And("^I Click on Next button in Seat Page$")
    public void iClickOnNextButtonInSeatPage() {

        new CheckoutSeatPage().clickonNextButton();
    }
}
