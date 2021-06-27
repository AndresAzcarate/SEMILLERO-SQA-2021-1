package com.demoqa.test.stepdefinitions;

import com.demoqa.automation.interactions.OpenBrowser;
import com.demoqa.automation.taks.FillAllFields;
import com.demoqa.automation.userinterfaces.PracticeFormPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PracticeFormStepDefinitions {
    @Managed
    private WebDriver driver;

    @Before
    public void actorSetup(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("").can(BrowseTheWeb.with(driver));
    }

    @Given("^that a web user wants to practice the text form in demoqa$")
    public void thatAWebUserWantsToPracticeTheTextFormInDemoqa() {
        theActorInTheSpotlight().attemptsTo(OpenBrowser.on(PracticeFormPage.URL));

    }

    @When("^he fills all the requested fields in form section$")
    public void heFillsAllTheRequestedFieldsInFormSection() {
        theActorInTheSpotlight().attemptsTo(FillAllFields.successful());
    }

    @Then("^he should see him data down\\.$")
    public void heShouldSeeHimDataDown() {
    }

    @When("^he fills all the requested fields in form section with data Excel$")
    public void heFillsAllTheRequestedFieldsInFormSectionWithDataExcel() {
    }
}
