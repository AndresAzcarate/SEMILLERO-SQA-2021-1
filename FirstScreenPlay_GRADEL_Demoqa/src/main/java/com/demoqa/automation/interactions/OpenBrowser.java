package com.demoqa.automation.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Open;

public class OpenBrowser implements Interaction {
    private String URL;
    public OpenBrowser(String URL){
        this.URL = URL;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(URL));
    }

    public static OpenBrowser on (String URL){
        return new OpenBrowser(URL);
    }
}
