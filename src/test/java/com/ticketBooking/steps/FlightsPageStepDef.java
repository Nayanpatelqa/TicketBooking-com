package com.ticketBooking.steps;

import com.ticketBooking.page.FlightsPage;
import com.ticketBooking.page.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class FlightsPageStepDef {

    @Given("^I am on Flights Page$")
    public void iAmOnFlightsPage() {
    }

    @Then("^I Navigate to Flights Page successfully$")
    public void iNavigateToFlightsPageSuccessfully() {
        new FlightsPage().getPageTitleText();

    }


    @And("^I click on one way Trip Radio button$")
    public void iClickOnOneWayTripRadioButton() {
        new FlightsPage().clickononeway();
    }

    @And("^I Select on Destination from where$")
    public void iSelectOnDestinationFromWhere() {
        new FlightsPage().clickonFromWhere();
        new FlightsPage().clearfromfield();
    }

    @And("^I enter \"([^\"]*)\"$")
    public void iEnter(String from)  {

        new FlightsPage().enterLocationFrom(from);
        new FlightsPage().selectLocationFrom();

    }

    @And("^I select on Destination To \"([^\"]*)\"$")
    public void iSelectOnDestinationTo(String to)  {
        new FlightsPage().clickonToWhere();
        new FlightsPage().enterLocationTo(to);
        new FlightsPage().selectLocationTo();


    }

    @And("^I select Date$")
    public void iSelectDate() {
        new FlightsPage().selectDate();
    }

    @And("^I click on Search Button$")
    public void iClickOnSearchButton() {
        new FlightsPage().clickonSearchbutton();
    }

    @And("^I select Economy class$")
    public void iSelectEconomyClass() {
        new FlightsPage().selectEconomyClass();
    }

    @And("^I select Direct only radio checkbox$")
    public void iSelectDirectOnlyRadioCheckbox() {
        new FlightsPage().clickonDirectFlightsOnly();
    }

    @And("^I click on See Flight button$")
    public void iClickOnSeeFlightButton() {
        new FlightsPage().clickonSeeFlight();
    }

    @And("^I Click on select button$")
    public void iClickOnSelectButton() {
        new FlightsPage().clickonselectButton();
    }

}
