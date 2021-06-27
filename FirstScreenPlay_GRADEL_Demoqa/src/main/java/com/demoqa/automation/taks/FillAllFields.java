package com.demoqa.automation.taks;

import com.demoqa.automation.models.DataInjection;
import com.demoqa.automation.userinterfaces.PracticeFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillAllFields implements Task {
    DataInjection dataInjection = new DataInjection();

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(dataInjection.getFirstName()).into(PracticeFormPage.FIRST_NAME_INPUT),
                Enter.theValue(dataInjection.getLastName()).into(PracticeFormPage.LAST_NAME_INPUT),
                Enter.theValue(dataInjection.getEmail()).into(PracticeFormPage.EMAIL_INPUT),
                JavaScriptClick.on(PracticeFormPage.GENDER_SELECT),
                Enter.theValue(dataInjection.getMobileNumber()).into(PracticeFormPage.MOBILE_INPUT),
                Enter.theValue(dataInjection.getCurrentAddress()).into(PracticeFormPage.CURRENT_ADDRESS_INPUT),
                JavaScriptClick.on(PracticeFormPage.SUBMIT_BUTTON),
                WaitUntil.the(PracticeFormPage.BOX_VALIDATION,isVisible())
        );
    }
    public static FillAllFields successful(){
        return instrumented(FillAllFields.class);
    }
}
