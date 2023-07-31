package com.ticketBooking.steps;

import com.ticketBooking.page.CheckoutFarePage;
import cucumber.api.java.en.And;

public class FarePageStepDef {
    @And("^I click on Next button$")
    public void iClickOnNextButton() {
        new CheckoutFarePage().clickonNextButton();
    }
}
