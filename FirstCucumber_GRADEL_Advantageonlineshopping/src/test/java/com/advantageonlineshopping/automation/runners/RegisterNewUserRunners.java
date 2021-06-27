package com.advantageonlineshopping.automation.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/registerNewUser.feature",
        glue = "com.advantageonlineshopping.automation.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class RegisterNewUserRunners {
}
