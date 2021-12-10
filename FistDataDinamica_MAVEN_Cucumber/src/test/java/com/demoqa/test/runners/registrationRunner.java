package com.demoqa.test.runners;


import com.demoqa.automation.utils.BeforeSuite;
import com.demoqa.automation.utils.classType;
import com.demoqa.automation.utils.dataToFeature;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.junit.runner.RunWith;

import java.io.IOException;

@RunWith(runner.class)
@CucumberOptions(features = "src/test/resources/features/registration.feature",
                 glue = "com.demoqa.test.stepDefinitions",
                 snippets = SnippetType.CAMELCASE)

public class registrationRunner {
    public registrationRunner(){
        throw new IllegalStateException(classType.RUNNER_CLASS);
    }
    @BeforeSuite
    public static void test() throws IOException{
        dataToFeature.overrideFeatureFiles("./src/test/resources/features/registration.feature");
    }
}
