package com.ticketBooking.steps;

import com.ticketBooking.page.CheckoutExtrasPage;
import cucumber.api.java.en.And;

public class ExtrasPageStepDef {
    @And("^I click on Next button in extras Page$")
    public void iClickOnNextButtonInExtrasPage() {
        new CheckoutExtrasPage().clickonNextButton();
    }
}
