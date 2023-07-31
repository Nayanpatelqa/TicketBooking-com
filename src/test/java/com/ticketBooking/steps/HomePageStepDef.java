package com.ticketBooking.steps;

import com.ticketBooking.page.FlightsPage;
import com.ticketBooking.page.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageStepDef {
    @Given("^I am on Home Page$")
    public void iAmOnHomePage() {
    }

    @When("^I Click on Cookies Accept & Close$")
    public void iClickOnCookiesAcceptClose() {
        new HomePage().clickonAcceptandClose();
    }




    @And("^I click on Flights from header \"([^\"]*)\"$")
    public void iClickOnFlightsFromHeader(String hMenu)  {
        new HomePage().clickonHeaderMenu(hMenu);

    }




    @Then("^I navigate to a Header Menu Page$")
    public void iNavigateToAHeaderMenuPage() {
    }
}
