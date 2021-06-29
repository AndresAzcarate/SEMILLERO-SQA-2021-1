package com.avianca.automation.stepdefinitions;

import com.avianca.automation.pageobjects.RegisterPage;
import com.avianca.automation.steps.RegisterPageSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;
import java.sql.Time;

public class BuyTicketStepDefinitions {
    @Steps
    RegisterPageSteps registerPageSteps;

    @Given("^that a web user wants to access Avianca Airlines$")
    public void that_a_web_user_wants_to_access_Avianca_Airlines() throws InterruptedException { registerPageSteps.openBrowser(); }
    @When("^i have filled in the necessary fields$")
    public void i_have_filled_in_the_necessary_fields() throws InterruptedException, IOException { registerPageSteps.buyTicket(); }
    @Then("^you should see the flight that has been selected$")
    public void you_should_see_the_flight_that_has_been_selected() throws InterruptedException, IOException { registerPageSteps.validations(); }
}
