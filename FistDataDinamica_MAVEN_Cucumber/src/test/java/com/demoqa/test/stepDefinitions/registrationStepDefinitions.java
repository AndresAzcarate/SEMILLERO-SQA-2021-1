package com.demoqa.test.stepDefinitions;

import com.demoqa.automation.models.dataInjection;
import cucumber.api.java.en.*;

import java.util.List;

public class registrationStepDefinitions {
    @Given("^a web user wants to access demoqa$")
    public void aWebUserWantsToAccessDemoqa(List<dataInjection> dataInjections) {
        System.out.println(dataInjections.get(0).getFirstName());
    }

    @When("^you have completed the necessary fields$")
    public void youHaveCompletedTheNecessaryFields(List<dataInjection> dataInjections) {
    }

    @Then("^should then see the new record that has been created$")
    public void shouldThenSeeTheNewRecordThatHasBeenCreated(List<dataInjection> dataInjections) {
    }
}
