package com.ticketBooking.steps;

import com.ticketBooking.page.PaymentPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class PaymentPageStepDef {
    @Then("^I navigate to Check and pay Page$")
    public void iNavigateToCheckAndPayPage() {
        new PaymentPage().getPageTitleText();
    }

    @And("^I enter card details \"([^\"]*)\"$")
    public void iEnterCardDetails(String cNo)  {
        new PaymentPage().enterCardNumber(cNo);

    }
}
