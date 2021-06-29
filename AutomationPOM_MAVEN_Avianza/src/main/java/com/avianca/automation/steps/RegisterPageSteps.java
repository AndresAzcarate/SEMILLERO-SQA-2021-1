package com.avianca.automation.steps;

import com.avianca.automation.pageobjects.RegisterPage;
import com.avianca.automation.utils.Times;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class RegisterPageSteps {

    RegisterPage registerPage = new RegisterPage();

    public RegisterPageSteps() throws IOException {
    }

    @Step
    public void openBrowser() throws InterruptedException {
        registerPage.open();
        Times.waitFor(1000);
    }
    @Step
    public void buyTicket() throws InterruptedException, IOException {
        Times.waitFor(1000);
        registerPage.clickReserve();
        Times.waitFor(1000);
        registerPage.clickOneWay();
        Times.waitFor(1000);
        registerPage.sendSelectOrigin();
        Times.waitFor(1000);
        registerPage.sendSelectDestination();
        Times.waitFor(1000);
        registerPage.clickSelectDate();
        Times.waitFor(1000);
        registerPage.clickButtonGo();
        Times.waitFor(1000);
        registerPage.clickTicket();
        Times.waitFor(2000);
        registerPage.sendDataTicket();
        Times.waitFor(3000);
    }
    @Step
    public void validations () throws InterruptedException, IOException {
        registerPage.dataValidations();
        registerPage.getDriver().quit();
    }
}
