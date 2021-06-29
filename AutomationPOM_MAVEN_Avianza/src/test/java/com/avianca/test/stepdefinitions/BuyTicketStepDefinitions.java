package com.avianca.test.stepdefinitions;

import com.avianca.automation.steps.RegisterPageSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class BuyTicketStepDefinitions {

    @Steps
    RegisterPageSteps registerPageSteps;

    @Given("^that a web user wants to access Avianca Airlines$")
    public void thatAWebUserWantsToAccessAviancaAirlines() throws InterruptedException {
        registerPageSteps.openBrowser();
    }

    @When("^i have filled in the necessary fields$")
    public void iHaveFilledInTheNecessaryFields() throws IOException, InterruptedException {
        registerPageSteps.buyTicket();
    }

    @Then("^you should see the flight that has been selected$")
    public void youShouldSeeTheFlightThatHasBeenSelected() throws IOException, InterruptedException {
        registerPageSteps.validations();
    }
}
