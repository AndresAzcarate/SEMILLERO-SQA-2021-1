package com.avianca.automation.steps;

import com.avianca.automation.pageobjects.RegisterPage;
import com.avianca.automation.utils.Times;
import net.thucydides.core.annotations.Step;
import java.io.IOException;


public class RegisterPageSteps {

    RegisterPage registerPage = new RegisterPage();

    public RegisterPageSteps() throws IOException {
    }

    @Step
    public void openBrowser() throws InterruptedException {
        registerPage.open();
        Times.waitFor(3000);
        registerPage.open();
    }

    @Step
    public void buyTicket() throws InterruptedException, IOException {
        registerPage.clickReserve();
        Times.waitFor(6000);
        registerPage.clickOneWay();
        Times.waitFor(5000);
        registerPage.sendSelectOrigin();
        Times.waitFor(5000);
        registerPage.sendSelectDestination();
        Times.waitFor(5000);
        registerPage.clickSelectDate();
        Times.waitFor(10000);
        registerPage.clickButtonGo();
        Times.waitFor(20000);
        registerPage.clickTicket();
        Times.waitFor(20000);
        registerPage.sendDataTicket();
        Times.waitFor(20000);
    }

    @Step
    public void validations () throws InterruptedException, IOException {
        registerPage.dataValidations();
        Times.waitFor(10000);
    }
}